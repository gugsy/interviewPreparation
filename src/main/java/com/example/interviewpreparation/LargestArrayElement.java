package com.example.interviewpreparation;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class LargestArrayElement {

    // an array intialise to a size
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int arraySize = scanner.nextInt();

        int[] arrayElements = new int[arraySize];

        System.out.println("Enter Array elements" + arraySize);
        for(int i =0; i < arraySize; i++) {
            arrayElements[i] = scanner.nextInt();
        }
        int largestElement = checkLargestElement(arrayElements);
        System.out.println("This is the largest element" + largestElement);
    }
    // compare the elements in array

    private static int checkLargestElement(int[] arrayElements) {

//        int maxValue = arrayElements[0];
//        for(int i =1; i < arrayElements.length; i++) {
//            if (maxValue < arrayElements[i])
//                maxValue = arrayElements[i];
//        }
        return Arrays.stream(arrayElements).max().getAsInt();
    }


}
