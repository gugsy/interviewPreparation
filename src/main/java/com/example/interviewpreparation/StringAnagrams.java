package com.example.interviewpreparation;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagrams {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter original word: ");
        String originalWord = scanner.nextLine();
        System.out.println("Enter original word: ");
        String anagramlWord = scanner.nextLine();

        if(checkIfAnagram(originalWord, anagramlWord)){
            System.out.println("Original word: "+originalWord+ "anagram word: "+anagramlWord);
        }
        else{
            System.out.println("Not Anagrams");
        }

    }

    private static boolean checkIfAnagram(String originalWord, String anagramlWord) {
        originalWord =originalWord.replace("\\s", "").toLowerCase();
        anagramlWord =anagramlWord.replace("\\s", "").toLowerCase();

        if(originalWord.length() != anagramlWord.length())
            return false;

        //convert to chaarray
        char[] chaArray1 = originalWord.toCharArray();
        char[] chaArray2 = anagramlWord.toCharArray();
        Arrays.sort(chaArray1);
        Arrays.sort(chaArray2);
        return Arrays.equals(chaArray1, chaArray2);

    }
}
