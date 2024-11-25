package com.example.interviewpreparation;

import java.util.Arrays;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");

        int size = scanner.nextInt();

        int[] elements = new int[size];
        System.out.println("Enter this number of array elements" + size);
        for(int i =0; i<size; i++)
            elements[i] = scanner.nextInt();
        int max = checkLarge(elements);

        System.out.println("This is the max element"+ max);

    }

    private static int checkLarge(int[] elements) {
        int maxValue = elements[0];
        for(int i =1; i < elements.length; i++)
            if(maxValue < elements[i]){
                maxValue = elements[i];
            }
        return maxValue;
    }

    private static int checkLarge1(int[] elements) {

        return Arrays.stream(elements).max().getAsInt();
    }
}
