package org.example;

import java.util.Scanner;

public class ExampleIfString {
    public static void main(String[] args) {
        // ask what favorite color
        // if red or blue or green youre basic
        // if orange  that cool or whatever
        // if purple that old royal
        //anything else youre lame
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your favorite color?");
        String color = scanner.nextLine();

        if (color.equalsIgnoreCase("blue") || color.equalsIgnoreCase("red") || color.equalsIgnoreCase("green")){
            System.out.println("You're basic. :( ");

        }
        else if (color.equalsIgnoreCase("orange")) {
            System.out.println("That's cool or whatever.");

        }
        else if (color.equalsIgnoreCase("purple")) {
            System.out.println("Old royalty color!");

        }
        else{
            System.out.println("You're lame :P");

        }

    }
}
