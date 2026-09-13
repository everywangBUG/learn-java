package com.itranswarp.learnjava;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan
public class AppConfig {

    // 把 app.properties 注入为 Resource，再从 Resource 中读取配置
    @Value("classpath:app.properties")
    private Resource appProperties;

    @Bean(destroyMethod = "close")
    public DataSource dataSource() throws IOException {
        Properties props = PropertiesLoaderUtils.loadProperties(appProperties);
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl(props.getProperty("jdbc.url"));
        ds.setUsername(props.getProperty("jdbc.username"));
        ds.setPassword(props.getProperty("jdbc.password"));
        return ds;
    }
}
