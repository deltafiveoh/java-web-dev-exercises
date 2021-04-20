package org.launchcode.java.demos.areaofcircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Circle ex = new Circle();
        Scanner scanner = new Scanner(System.in);
        double number;
        do {
            System.out.println("What is the radius of your circle? ");
            number = Double.parseDouble(scanner.nextLine());
            if (number > 0){
                System.out.println("This is your circle's area: " + ex.getArea(number));
            } else {
                System.out.println("That number is not a valid choice. Choose a number greater than 0.\n");
            }
        } while (number <= 0);
    }

    // step 1, commented out
//    public static double area (double num) {
//        double pi = Math.PI;
//        return num*num*pi;
//    }
}

//    Add validation to your program. If the user enters a negative number? a non-numeric character? the empty string?
//        Print an error message and quit. You’ll need to peek ahead to learn about conditional syntax in Java.
//        Extend your program further by using a while or do-while loop, so that when the user enters a negative number they are re-prompted.