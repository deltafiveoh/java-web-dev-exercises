package org.launchcode.java.demos.ExercisesJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        String exStr = "I would not, could not, in a box. I would not, " +
                "could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        ArrayList<String> stringArrList = new ArrayList<>(Arrays.asList(exStr.split(" ")));
//        for(String s: stringArrList){
//            System.out.println(s);
//        }

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            double x = Math.floor(Math.random()*100);
            numbers.add((int) x);
        }
        for (int i : numbers){
            System.out.print(i + ", ");
        }

        System.out.println("The sum of all evens is: " + sumEven(numbers) + " of a total of: " + sumAll(numbers));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a length of word to identify from list. Please enter an integer: ");
        int selected = scanner.nextInt();
        System.out.println("The list of words with length " + selected + " of the original list is: " +
                wordList(stringArrList, selected));
    }

    public static int sumEven(ArrayList<Integer> ex){
        int answer = 0;
        for (int i = 0; i < ex.size(); i++){
            if (ex.get(i) % 2 == 0){
                answer += ex.get(i);
            }
        }
        return answer;
    }

    public static int sumAll(ArrayList<Integer> ex){
        int answer = 0;
        for (int i = 0; i < ex.size(); i++){
            answer += ex.get(i);
        }
        return answer;
    }

    public static ArrayList<String> wordList(ArrayList<String> ex, int length){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < ex.size(); i++){
            if (ex.get(i).length() == length){
                list.add(ex.get(i));
            }
        }
        return list;
    }
}
