package org.launchcode.java.demos;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, what is your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
        scanner.close();
    }
}
