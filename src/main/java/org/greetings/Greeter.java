package org.greetings;

import java.util.Scanner;

/**
 * This is a change to greeter. Master repo
 */
public class Greeter {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scan.next();

        System.out.println("Hi, Greetings " +  firstName + "!");
    }
}
