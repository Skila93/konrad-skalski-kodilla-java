package com.kodilla.exception.test;

public class ExceptionHandling {
    SecondChallenge secondChallenge = new SecondChallenge();
    {
        try {
            secondChallenge.probablyIWillThrowException(5,8);
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
    }

}
