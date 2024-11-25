package com.example.interviewpreparation;

public class QuickSortAlgorithm {

//    Quick Sort is another divide-and-conquer algorithm that selects a pivot element
//    and partitions the array into two subarrays, sorting each recursively.

    public static void quickSort(int[] array, int low, int high) {
        if(low < high) {
            int pi = partition(array, low, high);

            //Recursively sort elements before and after partition
            quickSort(array, low, pi -1);
            quickSort(array, pi +1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low -1); //Index of smaller element

        for(int j = low; j < high; j++) {
            //if current element is smaller than pivot
            if(array[j] < pivot) {
                i++;

                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        return i + 1;
    }

    public static void main(String[]args){
        int[] array3 = {12, 11, 13, 5, 6, 7};

        // Quick Sort
        quickSort(array3, 0, array3.length - 1);
        System.out.println("Sorted Array using Quick Sort:");
        printArray(array3);
    }

    private static void printArray(int[] array3) {
        for(int i : array3){
            System.out.println( i + " ");
        }
    }
}
