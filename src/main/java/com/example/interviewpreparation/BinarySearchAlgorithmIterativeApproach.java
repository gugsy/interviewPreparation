package com.example.interviewpreparation;

public class BinarySearchAlgorithmIterativeApproach {
//    Here’s a Java implementation of a binary search algorithm,
//    which searches for an element in a sorted array.
//    Binary search works by repeatedly dividing the search interval in half
//    and comparing the target element to the middle element of the array.

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // prevents overflow

            //Check if the target is at the middle
            if (array[mid] == target) {
                return mid; // target found return index
            }

            //if target is greater ignore the left half
            if (array[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignnore the right half
            else {
                right = mid - 1;
            }
        }
        // target not found
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = {2, 3, 4, 10, 40, 55, 78};

        int target = 10;
        System.out.println("Iterative Binary Search");
        int result = binarySearch(sortedArray, target);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
