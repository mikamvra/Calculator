package org.example;

import java.util.Scanner;

public class ExampleIf {
    public static void main(String[] args) {
        // if statements!
        Scanner age = new Scanner(System.in);
        // if person is over 50 thye old
        // if the person is between 19 - 49 not too old
        // if below 18 they are not an adult
        System.out.println( "How old are you?");
        int userAge = age.nextInt();
        if (userAge >= 50){
            System.out.println("You're old!");
        }
        else if (userAge >= 18 && userAge <= 49) {
            System.out.println("You're not too old.");

        }
        else{
            System.out.println("You're underage!");
        }

    }
}
