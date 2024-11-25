package com.example.interviewpreparation;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElementInArray {
    //allow user to enter an array of n elements
    //ensure the array is sorted
    // set value at index 0 to be max
    // compare element at index 0 to element at 0+1

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");

        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter " + n + "elements");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int largest = findLargest(array);
        System.out.println("This is the largest number" + largest);

    }

    private static int findLargest(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max)
                max = array[i];
        }
        return max;
    }
}

