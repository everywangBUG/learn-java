package com.itranswarp.learnjava.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserService {
    private MailService mailService;

    public void setMailService(MailService mailService) {
        this.mailService = mailService;
    }

    private List<User> users = new ArrayList<>(List.of(
            new User(1, "bob@example.com", "password", "Bob"),
            new User(2, "alice@example.com", "password", "Alice"),
            new User(3, "tom@example.cpm", "password", "Tom")
    ));

    public User login(String email, String password) {
        for (User user : users) {
            if (user.getEmail().equalsIgnoreCase(email) && user.getPassword().equals(password)) {
                mailService.sendLoginMail(user);
                return user;
            }
        }
        throw new RuntimeException("login failed.");
    }

    public User getUser(long id) {
        //取第一个匹配的元素（没匹配到就是空的）
        // 有值就返回，无值抛 NoSuchElementException
        return this.users.stream().filter(user -> Objects.equals(user.getId(), id)).findFirst().orElseThrow();
    }

    public User register(String email, String password, String name) {
        users.stream().forEach(user -> {
            if (user.getEmail().equalsIgnoreCase(email)) {
                throw new RuntimeException("email exist.");
            }
        });
        User user = new User(users.stream().mapToLong(u -> u.getId()).max().getAsLong() + 1, email, password, name);
        users.add(user);
        mailService.sendRegistrationMail(user);
        return user;
    }
}
