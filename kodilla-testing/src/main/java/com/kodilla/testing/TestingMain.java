package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;
public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();
        int addingResult = calculator.add(12, 11);
        int substractResult = calculator.subtract(13, 12);
        if (addingResult == 23) {
            System.out.println("Adding test OK");
        } else {
            System.out.println("Adding test not OK");
        }
        if (substractResult == 1) {
            System.out.println("Substraction test OK");
        } else {
            System.out.println("Substraction test not OK");
        }
    }
}