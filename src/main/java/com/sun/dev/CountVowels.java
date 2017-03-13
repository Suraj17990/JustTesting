package com.sun.dev;

import java.util.Scanner;

/**
 * Write a short Java method that counts the number of vowels in a given character
 string.
 */
public class CountVowels {
    public int countNoOfVowels(String word){
        int count = 0;
        for (int i=0; i<word.length(); i++){
            if((word.charAt(i)=='a')|(word.charAt(i)=='e')|(word.charAt(i)=='i')|(word.charAt(i)=='o')|(word.charAt(i)=='u'))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        CountVowels count = new CountVowels();
        System.out.println("Enter Any String:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String word = input.toLowerCase();
        int occurance = count.countNoOfVowels(word);
        System.out.println("The number of VOWELS in the String are: "+occurance );
    }
}
