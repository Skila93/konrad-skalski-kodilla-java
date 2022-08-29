package com.kodilla.good.patterns.challenges;

public class User {
    private String userName;
    private String name;
    private String surname;

    public User(String userName, String name, String surname) {
        this.userName = userName;
        this.name = name;
        this.surname = surname;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return name;
    }

    public String getRealSurname() {
        return surname;
    }
}