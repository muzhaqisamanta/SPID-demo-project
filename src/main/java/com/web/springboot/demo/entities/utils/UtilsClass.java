package com.web.springboot.demo.entities.utils;

import com.web.springboot.demo.entities.User;

public class UtilsClass {

    public static User generateUser(){
        User generatedUser = new User(
                1L,
                "samanta",
                "samanta",
                "samanta"
        );
        return generatedUser;
    }
}
