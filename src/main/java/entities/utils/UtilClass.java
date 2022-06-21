package entities.utils;

import entities.Spid;
import entities.User;
import service.UserService;


public class UtilClass {

    public User generateUser(){
        User generatedUser = new User(
                1L,
                "samanta",
                "samanta",
                "samanta"
        );
        return generatedUser;
    }
}
