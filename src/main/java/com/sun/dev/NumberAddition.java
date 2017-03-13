package com.sun.dev;

/**
 * Write a short Java method that takes an integer n and returns the sum of all
 positive integers less than or equal to n.
 */
public class NumberAddition {
    public void addNumber(int n){
        int sum = 0;
        for (int i=n;i>0;i--){
            sum = sum +i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        NumberAddition num = new NumberAddition();
        num.addNumber(5);
    }
}
