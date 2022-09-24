package com.kodilla.patterns.strategy.social;

public class Millenials extends User{
    public Millenials(String user) {
        super(user);
        this.socialPublisher = new FacebookPublisher();
    }
}