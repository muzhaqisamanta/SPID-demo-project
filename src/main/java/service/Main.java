package service;

import entities.Spid;
import entities.User;
import entities.enums.SpidStatus;
import entities.utils.UtilClass;

public class Main {

    public static void main(String[] args) {
        SpidService spidService = new SpidService();
        UserService userService = new UserService();
        UtilClass utilClass = new UtilClass();

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
        User editedUser = (userService.editUser(utilClass.generateUser(), "Updated username"));
        System.out.println("Updated username is: " + editedUser.getUsername());

        //show spid connected to user1
        if (user1.getUsername().equals(firstSpid.getUser().getUsername())) {
            System.out.println("User with username " + user1.getUsername() + " is connected to spid with id " + firstSpid.getId());
        } else {
            System.out.println("You dont have a spid connected to user " + user1.getUsername());
        }
    }
}
