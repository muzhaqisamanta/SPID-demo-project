package service;

import entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    List<User> listOfUsers = new ArrayList<User>();

    public User createUser(User user) {
        User savedUser = new User(
                user.getId() ,
                user.getCreatedAt(),
                user.getCreatedBy() ,
                user.getUsername(),
                user.getName(),
                user.getSurname());
        listOfUsers.add(savedUser);
        return savedUser;
    }
    public User editUser (User user, String username){
        User user1 = new User(
                user.getId(),
                username,
                user.getName(),
                user.getSurname()
        );
        return user1;
    }

}
