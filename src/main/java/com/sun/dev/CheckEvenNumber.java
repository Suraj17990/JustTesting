package com.sun.dev;

import java.util.Scanner;

/**
 * Write a short Java method, isEven, that takes an int i and returns true if and only
 if i is even. Your method cannot use the multiplication, modulus, or division
 operators, however
 */
public class CheckEvenNumber {
    public void checkEvenNumber(int number){
        String lastIndex = Integer.toString(number);
        int lastDigit = getLastIndexValue(lastIndex);
        if((lastDigit==0)|(lastDigit==2)|(lastDigit==4)|(lastDigit==6)|(lastDigit==0))
            System.out.println("The number "+number+" is EVEN");
        else
            System.out.println("The number "+number+" is odd");
    }
    public int getLastIndexValue(String lastIndex){
        int lastIndexLenght = lastIndex.length();
        char lastvalue = lastIndex.charAt(lastIndexLenght-1);
        int lastDigit = Character.getNumericValue(lastvalue);
        return lastDigit;
    }
    public static void main(String[] args) {
        CheckEvenNumber check = new CheckEvenNumber();
        System.out.println("Please Enter Any Number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        check.checkEvenNumber(number);
    }
}
