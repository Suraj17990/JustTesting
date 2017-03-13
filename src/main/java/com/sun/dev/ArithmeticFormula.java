package com.sun.dev;

import java.util.Scanner;

/**
 * Write a Java program that can take a positive integer greater than 2 as input and
 write out the number of times one must repeatedly divide this number by 2 before
 getting a value less than 2.
 */
public class ArithmeticFormula {
    public int returnCount(int input){
        int count =0;
        if(input >2){
            while(input>2) {
                input = input/2;
                count ++;
            }
        }else
            System.out.println("Please Enter number greater than 2");
        return count;
    }
    public static void main(String[] args) {
        ArithmeticFormula af = new ArithmeticFormula();
        System.out.println("Enter any number:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int count = af.returnCount(input);
        System.out.println("We have to divide the number"+input+" for "+count+" times.");
    }
}
