package com.sun.dev;

/**
 * Write a short Java method that takes an integer n and returns the sum of all the
 odd positive integers less than or equal to n.
 */
public class NumberAddition2 {
    public void addNumber(int n){
        int sum = 0;
        for (int i=n;i>0;i--){
            if(i%2==1)
            sum = sum +i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        NumberAddition2 num = new NumberAddition2();
        num.addNumber(5);
    }
}
