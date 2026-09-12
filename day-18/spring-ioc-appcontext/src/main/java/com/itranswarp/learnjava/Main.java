package com.itranswarp.learnjava;

import com.itranswarp.learnjava.service.User;
import com.itranswarp.learnjava.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    static void main() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserService userService = context.getBean(UserService.class);

        // 注册新用户（写入数据库）
        User registered = userService.register("ada@example.com", "password", "Ada");
        System.out.println("registered id = " + registered.getId());

        // 按主键从数据库查询刚注册的用户
        System.out.println(userService.getUser(registered.getId()).getName() + "按主键从数据库查询刚注册的用户");

        // 用数据库中的账号登录
        User user = userService.login("bob@example.com", "password");
        System.out.println(user.getName());
    }
}
