package com.example.interviewpreparation;

public class MergeSortAlgorithm {
//    Merge Sort is a divide-and-conquer algorithm that splits the array into halves,
//    sorts each half, and then merges them back together.

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            //sort first and second halves
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            //Merge the sorted halves
            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        //Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            leftArray[i] = array[left + 1];
        for (int j = 0; j < n2; ++j)
            rightArray[j] = array[right + 1];

        // merge the temp arrays back into original array
        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {

                array[k] =rightArray[j];
                j++;

            }
            k++;
        }
// Copy remaining elements of leftArray[] and rightArray[]
        while(i < n1){
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while(j < n2){
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] arga){
        int[] array2 = {12, 11, 13, 5, 6, 7};

        // Merge Sort
        mergeSort(array2, 0, array2.length - 1);
        System.out.println("Sorted Array using Merge Sort:");
        printArray(array2);
    }

    private static void printArray(int[] array2) {
        for(int i : array2){
            System.out.println(i + " ");
        }
        System.out.println();
    }
}
