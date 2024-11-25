package com.example.interviewpreparation;

import java.util.Scanner;

public class CheckPalidrome {

    public static void main(String ... args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String to check");
        String toCheck = scanner.next();

        if(checkIfPalidrome(toCheck))
            System.out.println("String is palidrome: " +toCheck);
        else
            System.out.println("String not palidrome, "+ toCheck);
    }

    private static boolean checkIfPalidrome(String toCheck) {
        StringBuilder sb = new StringBuilder(toCheck);
        sb.reverse();
        return toCheck.equals(sb.toString());

    }
}
