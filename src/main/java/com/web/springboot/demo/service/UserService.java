package com.web.springboot.demo.service;

import com.web.springboot.demo.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<User> listOfUsers = new ArrayList<User>();

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
