package com.sun.dev;

/**
 * Created by senorita on 2/9/2017.
 */
public class NumberAddition3 {
    public void addNumber(int n){
        int sum = 0;
        for (int i=n;i>0;i--){

            sum = sum +i*i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        NumberAddition3 num = new NumberAddition3();
        num.addNumber(5);
    }
}
