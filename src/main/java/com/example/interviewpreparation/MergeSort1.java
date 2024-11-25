package com.example.interviewpreparation;

public class MergeSort1 {

    public static void main(String[] args) {
        int[] array = {3,8,4,7,2,9,4};

        mergeSort(array);

        for (int j : array) {
            System.out.println(j + " ");
        }
    }

    private static void mergeSort(int[] array) {

        int length = array.length;
        if ( length <= 1) return;

        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0 ; //leftArray
        int j = 0; // rightArray

        for(; i < length; i++){
            if (i < middle){
                leftArray[i]  = array[i];// end::[]
            }
            else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array){

        int leftSize = array.length/2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r =0; // indices

        //check conditions for merging

        while (l < leftSize && r < rightSize){
            if (leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else {
                array[i] = rightArray[r];
                i++;
                r++;
            }

        }
        while (l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while (r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
