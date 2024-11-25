package com.example.interviewpreparation;

import java.util.Scanner;

public class FibonacciSeries {

//    Input: N = 10
//    Output: 0 1 1 2 3 5 8 13 21 34
//    Explanation: Here first term of Fibonacci is 0 and second is 1, so that 3rd term = first(o) + second(1) etc and so on.

    public static void main(String[]args){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the number of digits for the Fibonacci Series ");

        int numberOfDigits = scanner.nextInt();
        int first = 0, second =1;
        for(int i =1; i< numberOfDigits; i++){

            System.out.println(first); //0
            int next = first + second;//0=+1
            first =second;// 1
            second = next;//2
        }

    }
}
