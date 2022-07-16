package com.kodilla.exception.test;

import java.time.LocalDate;
import java.time.LocalTime;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {

        try {
            if (b == 0){
            throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception found: " + e);
        }
        finally {
            System.out.println("Date: " + LocalDate.now() + " ,time: " + LocalTime.now());
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);

        System.out.println(result);
    }
}