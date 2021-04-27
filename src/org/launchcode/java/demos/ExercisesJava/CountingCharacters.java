package org.launchcode.java.demos.ExercisesJava;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filePath = "..\\TextFiles\\TestStringFile.txt";

        File file = new File(filePath);
        System.out.println(file.exists());
        String curDir = System.getProperty("user.dir");
        System.out.println("Current sys dir: " + curDir);
        System.out.println("file abs dir: " + file.getAbsolutePath());

//        System.out.println("Please enter a text to determine character count");
//        filePath = scanner.nextLine();

        ArrayList<Character> chars = new ArrayList<>();

        int i;

        try (FileReader fin = new FileReader(filePath)){

            while ((i = fin.read()) != -1) {
                chars.add((char) i);
            }

        } catch(IOException exc) {
            System.out.println("Error reading file.");
        }

        char[] textArr = new char[chars.size()];

        for(int j = 0; j < chars.size(); j++) {
            textArr[j] = chars.get(j);
        }

            HashMap<Character, Integer> repetitions = new HashMap<>();

            for (char x : textArr) {
                if (x >= 'a' && x <= 'z' || x >= 'A' && x <= 'Z') {
                    if (!repetitions.containsKey(x)) {
                        repetitions.put(x, 0);
                    }
                    if (repetitions.containsKey(x)) {
                        repetitions.put(x, repetitions.get(x) + 1);
                    }
                }

            }

            for (Map.Entry<Character, Integer> repeats : repetitions.entrySet()) {
                System.out.println(repeats.getKey() + ": " + repeats.getValue());
            }
        }
}
