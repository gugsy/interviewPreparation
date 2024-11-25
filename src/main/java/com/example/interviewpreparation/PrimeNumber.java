package com.example.interviewpreparation;

import java.util.Scanner;

public class PrimeNumber {

//    Check for Prime Number:
//    Write a program to check if a given number is prime.
//  What is a prime number, a number divisible by 1 and itself and greater than 1


    public static void main(String args[]){

        //user to enter the requiered number of prime numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter required number of Prime numbers");
        int numberOfPrimes = scanner.nextInt();

        findPrimesUpTo(numberOfPrimes);

    }

    private static void findPrimesUpTo(int numberOfPrimes) {
        System.out.println("Prime numbers upto " + numberOfPrimes);
        for(int i =2; i <= numberOfPrimes; i++){
            if(checkIfPrime(i)){
                System.out.println(i +" ");
            }
        }
        System.out.println();
    }

    private static boolean checkIfPrime(int number) {
        if(number <= 1)
            return false;

        for(int i= 2; i <= Math.sqrt(number); i++){
            if(number % i == 0)
                return false;
        }
        return true;
    }

}
