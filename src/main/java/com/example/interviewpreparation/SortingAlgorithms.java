package com.example.interviewpreparation;

public class SortingAlgorithms {

//    Bubble Sort compares adjacent elements and swaps them if they are in the wrong order.
//    This process is repeated until the list is sorted.

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};

        System.out.println("Original Array:");
        printArray(array);

        // Bubble Sort
        SortingAlgorithms.bubbleSort(array);
        System.out.println("Sorted Array using Bubble Sort:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
