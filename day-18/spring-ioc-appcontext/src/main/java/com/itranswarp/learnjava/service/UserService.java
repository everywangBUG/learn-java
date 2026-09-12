package com.itranswarp.learnjava.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class UserService {
    private MailService mailService;
    private DataSource dataSource;

    public void setMailService(MailService mailService) {
        this.mailService = mailService;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * Bean 初始化时建表并写入示例用户（application.xml 中通过 init-method 调用）。
     */
    public void init() throws SQLException {
        try (Connection conn = dataSource.getConnection()) {
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate("CREATE TABLE IF NOT EXISTS users ("
                        + "id BIGINT AUTO_INCREMENT PRIMARY KEY, "
                        + "email VARCHAR(100) NOT NULL, "
                        + "password VARCHAR(100) NOT NULL, "
                        + "name VARCHAR(100) NOT NULL, "
                        + "UNIQUE (email))");
            }
            // MERGE 保证重复执行初始化也不会产生重复数据
            try (PreparedStatement ps = conn.prepareStatement(
                    "MERGE INTO users (email, password, name) KEY(email) VALUES (?, ?, ?)")) {
                String[][] seed = {
                        { "bob@example.com", "password", "Bob" },
                        { "alice@example.com", "password", "Alice" },
                        { "tom@example.com", "password", "Tom" }
                };
                for (String[] row : seed) {
                    ps.setString(1, row[0]);
                    ps.setString(2, row[1]);
                    ps.setString(3, row[2]);
                    ps.executeUpdate();
                }
            }
        }
    }

    public User login(String email, String password) {
        User user = findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            mailService.sendLoginMail(user);
            return user;
        }
        throw new RuntimeException("login failed.");
    }

    public User getUser(long id) {
        try (Connection conn = dataSource.getConnection()) {
            try (PreparedStatement ps = conn.prepareStatement("SELECT id, email, password, name FROM users WHERE id = ?")) {
                ps.setLong(1, id);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        return mapRow(rs);
                    }
                    throw new RuntimeException("user not found by id: " + id);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public User register(String email, String password, String name) {
        if (findByEmail(email) != null) {
            throw new RuntimeException("email exist.");
        }
        try (Connection conn = dataSource.getConnection()) {
            try (PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO users (email, password, name) VALUES (?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS)) {
                ps.setString(1, email);
                ps.setString(2, password);
                ps.setString(3, name);
                ps.executeUpdate();
                long id;
                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (rs.next()) {
                        id = rs.getLong(1);
                    } else {
                        throw new RuntimeException("missing generated id.");
                    }
                }
                User user = new User(id, email, password, name);
                mailService.sendRegistrationMail(user);
                return user;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private User findByEmail(String email) {
        try (Connection conn = dataSource.getConnection()) {
            try (PreparedStatement ps = conn
                    .prepareStatement("SELECT id, email, password, name FROM users WHERE email = ?")) {
                ps.setString(1, email);
                try (ResultSet rs = ps.executeQuery()) {
                    return rs.next() ? mapRow(rs) : null;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private User mapRow(ResultSet rs) throws SQLException {
        return new User(rs.getLong("id"), rs.getString("email"), rs.getString("password"),
                rs.getString("name"));
    }
}
