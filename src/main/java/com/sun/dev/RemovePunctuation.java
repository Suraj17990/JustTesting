package com.sun.dev;

import java.util.Scanner;

/**
 * Write a short Java method that uses a StringBuilder instance to remove all the
 punctuation from a string s storing a sentence, for example, transforming the
 string "Let’s try, Mike!" to "Lets try Mike".
 */
public class RemovePunctuation {
    public StringBuilder removePunctuations(StringBuilder sb){
        for (int i=0; i<sb.length(); i++) {
            if((sb.charAt(i)=='!')|(sb.charAt(i)==',')|(sb.charAt(i)=='"'))
                sb.deleteCharAt(i);
        }
        return sb;
    }
    public static void main(String[] args) {
        RemovePunctuation rp = new RemovePunctuation();
        System.out.println("Please enter a statement which contains punctuations:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);
        StringBuilder result = rp.removePunctuations(sb);
        System.out.println("The modified statement is: "+result);
    }
}
