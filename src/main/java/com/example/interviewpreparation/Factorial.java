package com.example.interviewpreparation;

import java.util.Scanner;

public class Factorial {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number we want to calculate for factorial");

        int numberToFactorial = scanner.nextInt();
        long result = calculateFactorial(numberToFactorial);

         System.out.println("This is the result: " +result);
    }

    private static long calculateFactorial(int numberToFactorial) {
        long  product = 1;
        for(int i=1; i <=numberToFactorial; i++)
            product = product*i;
        return product;
    }
}
