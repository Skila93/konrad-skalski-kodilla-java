package com.kodilla.rps;

import java.util.Scanner;

public class Greeting {
    public void greet(){
        Scanner receiveName = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = receiveName.nextLine();
        System.out.println("Hello " + name + "! Welcome to rock, paper, scissors game.  You need to win 3 rounds to take final victory");
        System.out.println("To play you need to use keyboard, below you can find what the various keys in the game are responsible for.");
        System.out.println("Key 1 - select stone");
        System.out.println("Key 2 - select paper");
        System.out.println("Key 3 - select scissors");
        System.out.println("Key x - end game");
        System.out.println("Key n - new game");
    }
}
