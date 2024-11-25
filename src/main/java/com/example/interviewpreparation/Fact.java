package com.example.interviewpreparation;

import java.util.Scanner;

public class Fact {
//factorial eg 5! = 5*4*3*2*1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to calculate factory");
         int numberToFact = scanner.nextInt();

         int product = calculateFactorial(numberToFact);
        System.out.println("Product calculated: "+product);
    }

    private static int calculateFactorial(int numberToFact) {
        int product =1;
        for (int i =numberToFact; i == 1; i--)
            product *= i;
        return product;
    }
}
