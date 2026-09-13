package com.itranswarp.learnjava.service;

import org.springframework.stereotype.Component;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class MailService {
    private ZoneId zonId = ZoneId.systemDefault();

    public void setZonId(ZoneId zonId) {
        this.zonId = zonId;
    }

    public String getTime() {
        return ZonedDateTime.now(this.zonId).format(DateTimeFormatter.ISO_ZONED_DATE_TIME);
    }

    public void sendLoginMail(User user) {
        System.out.println(String.format("Hi, %s! You are logged in at %s", user.getName(), getTime()));
    }

    public void sendRegistrationMail(User user) {
        System.err.println(String.format("Welcome, %s!", user.getName()));
    }
}
