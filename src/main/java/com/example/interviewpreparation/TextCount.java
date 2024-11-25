package com.example.interviewpreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TextCount {

    public static void main(String...args){
        Scanner scanner = new Scanner(System.in);
        // enter string with repeating letters
        System.out.println("Enter the string with repeating letters");
        String testString = scanner.next();
        //call method of the result
        String finalString = processString(testString);
        //print out the result
        System.out.println("This is the fnial result," + finalString);


    }

    private static String processString(String testString) {
        char[] chaArray = testString.toCharArray();
        Map<Character, Integer> testArray = new LinkedHashMap<>();// to maintain order
        for(char test : chaArray){
        testArray.put(test, testArray.getOrDefault(test, 0)+1);
    }
        StringBuilder stringBuilder = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : testArray.entrySet()){
            stringBuilder.append(entry.getKey()).append(entry.getValue());
        }
        return stringBuilder.toString();
    }

//    private static String processString(String testString) {
//        char[] charArray = testString.toLowerCase().toCharArray();
//        Map<Character, Integer> testArray = new LinkedHashMap<>(); // maintaing order
//         for(char test : charArray){
//             testArray.put(test, testArray.getOrDefault(test, 0)+1);
//         }
//
//         StringBuilder result = new StringBuilder();
//         for(Map.Entry<Character, Integer> entry : testArray.entrySet()){
//             result.append(entry.getKey()).append(entry.getValue());
//         }
//        return result.toString();
//    }
}
