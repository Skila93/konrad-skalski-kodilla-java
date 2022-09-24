package com.kodilla.patterns.strategy.social;

public class User {
    private final String user;
    protected SocialPublisher socialPublisher;

    public User(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }
    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
    public String sharePost(){
        return socialPublisher.share();
    }
}