package com.kodilla.good.patterns.challenges;

public class MessageService implements InformationService {

    public void sendMessage(User user) {
        System.out.println("Your order is confirmed!");
    }
}