package com.web.springboot.demo.entities;

import java.util.Date;

public class User extends BaseClass{
    private String name;
    private String surname;
    private String username;

    public User() {
    }

    public User(Long id, Date createdAt, String createdBy, String name, String surname, String username) {
        super(id, createdAt, createdBy);
        this.name = name;
        this.surname = surname;
        this.username = username;
    }

    public User(Long id, String username, String name, String surname) {
        super(id, null, null);
        this.name = name;
        this.surname = surname;
        this.username = username;
        setCreatedAt(new Date());
        setCreatedBy(getUsername());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + getId() + '\'' +
                "createdAt=" + getCreatedAt() + '\'' +
                "createdBy=" +getCreatedBy()+'\''+
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
