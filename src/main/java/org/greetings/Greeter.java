package org.greetings;

import java.util.Scanner;

/**
 * This is a change to greeter. Master repo
 */
public class Greeter {
    public static void main (String [] args) {
        String user = getUser();

        System.out.println("Hi, Greetings " +  user + "!");
    }

    /**
     * Prompts user for first name, returns result. One more line.
     * @return The first name user enters.
     */
    public static String getUser () {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = scan.next();
        return firstName;
    }
}
