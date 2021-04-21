package org.launchcode.java.demos.ExercisesJava;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        String exStr = "I would not, could not, in a box. I would not, " +
                "could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        int[] pracArr = {1,1,2,3,5,8};
        for (int i: pracArr) {
            System.out.print(i + ", ");
        }
        String[] splitStr = exStr.split(",");
        String[] splitStr2 = exStr.split("\\.");
        System.out.println("");
//        for (String x : splitStr){
//            System.out.print(x + " (end of indexed section.) ");
//        }
        System.out.println(Arrays.toString(splitStr));
        System.out.println(Arrays.toString(splitStr2));

    }
}
