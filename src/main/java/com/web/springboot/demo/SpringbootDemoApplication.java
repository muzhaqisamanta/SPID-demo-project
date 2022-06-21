package com.web.springboot.demo;

import com.web.springboot.demo.entities.Spid;
import com.web.springboot.demo.entities.User;
import com.web.springboot.demo.entities.enums.SpidStatus;
import com.web.springboot.demo.entities.utils.UtilsClass;
import com.web.springboot.demo.service.SpidService;
import com.web.springboot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.web.springboot.demo")
@Configuration
@EnableAutoConfiguration
public class SpringbootDemoApplication implements CommandLineRunner {
    @Autowired
    public UserService userService;
    @Autowired
    public SpidService spidService;

    public static void main(String[] args) {

        SpringApplication.run(SpringbootDemoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        //create first user
        User user1 = userService.createUser(new User(1L, "samanta", "samanta", "samanta"));
        System.out.println("First user is: " + user1 + "\n");
        //create second user
        User user2 = userService.createUser(new User(1L, "gera", "gera", "gera"));
        //show list of users
        System.out.println("List of users: " + userService.listOfUsers + "\n");

        //create first spid
        Spid firstSpid = spidService.addSpid(new Spid(1L, "dsc", user1));
        System.out.println("First spid is: " + firstSpid);

        //edit first spid's status to approved
        SpidService.editSpid(firstSpid, SpidStatus.APPROVED);
        System.out.println("Edited first spid status is " + firstSpid.getStatus()+"\n");

        //create a second spid
        Spid secondSpid = spidService.addSpid(new Spid(2L, "dsc2", user1));
        System.out.println("Spid list is: " + spidService.listOfSpids + "\n");

        //edit user
        User editedUser = (userService.editUser(UtilsClass.generateUser(), "Updated username"));
        System.out.println("Updated username is: " + editedUser.getUsername());

        //show spid connected to user1
        if (user1.getUsername().equals(firstSpid.getUser().getUsername())) {
            System.out.println("User with username " + user1.getUsername() + " is connected to spid with id " + firstSpid.getId());
        } else {
            System.out.println("You dont have a spid connected to user " + user1.getUsername());
        }
    }
}
