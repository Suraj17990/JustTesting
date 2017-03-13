package com.sun.dev;

import java.util.Scanner;

/**
 * Created by senorita on 2/13/2017.
 */
public class ReverseOrder {
    String sentence1 = "";
    String sentence2 = "";
    String sentence3 = "";
    Scanner scanner = new Scanner(System.in);
    public void takeInput(){
        System.out.println("Enter 3 Sentences");
        sentence1 = scanner.nextLine();
        sentence2 = scanner.nextLine();
        sentence3 = scanner.nextLine();
        System.out.println(sentence1);
        System.out.println(sentence2);
        System.out.println(sentence3);
    }

    public void reverseSentences(){
        System.out.println("Reversing the sentences....");
        System.out.println(sentence3);
        System.out.println(sentence2);
        System.out.println(sentence1);
    }
    public static void main(String[] args) {
        ReverseOrder ro = new ReverseOrder();
        ro.takeInput();
        ro.reverseSentences();
    }
}
