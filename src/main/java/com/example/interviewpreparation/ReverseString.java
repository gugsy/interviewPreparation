package com.example.interviewpreparation;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word to be reversed: ");

        String tobeReversed = scanner.nextLine();
        String reversedString = reverseString(tobeReversed);
        System.out.println("This is the original string: " +tobeReversed+" reversed to: " +reversedString);
    }

    private static String reverseString(String tobeReversed) {
        StringBuilder sb = new StringBuilder(tobeReversed);
        return sb.reverse().toString();
    }


}
