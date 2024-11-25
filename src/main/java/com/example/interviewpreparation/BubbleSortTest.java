package com.example.interviewpreparation;

public class BubbleSortTest {

    //  real-world example of a bubble sort algorithm is how the contact list on your phone is sorted in alphabetical order.
    // declare need an array
    // declare want to compare adjascent array values and interchange them if former is greater than latter
    // print out array values

    public static void main(String[] args) {
        int[] array = {3, 5, 2, 8, 4};
        System.out.println("Original Array: ");
        printArray(array);

        System.out.println("Sorted Arrary: ");
        bubbleSortArray(array);
        printArray(array);
    }

    private static void bubbleSortArray(int[] array) {
        int length = array.length;
        // first fior loop is for traking
        for (int i = 0; i < length; i++){
            // changing elements to comapre till array is sorted
            for(int j = 0; j < length-1-i; j++){
                if(array[j] > array[j+1]){
                    int temp  =  array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }

        }
    }

    private static void printArray(int[] array) {
        for (int i : array)
            System.out.println(i +" ");
    }

}
