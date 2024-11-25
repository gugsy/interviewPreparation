package com.example.interviewpreparation;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter work to check if its a palidrome");
        String wordToCheck = scanner.nextLine();
        checkIfPalindrome(wordToCheck);
    }

    private static void checkIfPalindrome(String wordToCheck) {
        StringBuilder sb = new StringBuilder(wordToCheck);
        sb.reverse();
        if(sb.toString().equals(wordToCheck))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
