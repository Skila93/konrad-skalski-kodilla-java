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

        Calculator calcCheck = new Calculator();
        int calcCheckAdd = calcCheck.add(5, 7);
        if(calcCheckAdd == 12){
            System.out.println("Numbers adding test OK");
        } else {
            System.out.println("Numbers adding test failed");
        }
        int calcChechSub = calcCheck.substract(14, 13);
        if (calcChechSub == 1) {
            System.out.println("Numbers subtraction test OK");
        } else {
            System.out.println("Numbers subtraction test failed");
        }
    }
}