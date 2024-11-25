package com.example.interviewpreparation;

public class BST {

    public static void main(String[] args) {
        int[] array ={7, 5, 3, 2, 0, 1, 9};
        System.out.println("Printing original array");
        printArray(array);

        bubbleSortArray(array);
        System.out.println("Printing bubble sorted array");
        printArray(array);
    }

    private static void bubbleSortArray(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++){
            for (int j = 0; j < length-1-i; j++){
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                }

            }
        }
    }

    private static void printArray(int[] array) {
        for(int i : array)
            System.out.println(i);
    }
}
