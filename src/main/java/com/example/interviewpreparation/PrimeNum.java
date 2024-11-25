package com.example.interviewpreparation;

import java.util.Scanner;

public class PrimeNum {
    // Write a program to check if a given number is prime.a whole number greater than 1 that cannot be exactly divided by any whole number other than itself
    // get the number of prime numbers we want
    //have a method that checks if a number is prime
    //print out the prime numbers

    public static void main(String[] args) {
        int primeNumberCheck = new Scanner(System.in).nextInt();
        getPrimeNumber(primeNumberCheck);
    }

    private static void getPrimeNumber(int primeNumberCheck) {
        for (int i = 2; i <= Math.sqrt(primeNumberCheck); i++) {
            if (primeNumberCheck % i == 0){
                System.out.println("Not prime");
            return;
            }
        }
        System.out.println("Prime");
    }

}
