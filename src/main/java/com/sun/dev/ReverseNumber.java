package com.sun.dev;

/**
 * Created by senorita on 1/14/2017.
 */
public class ReverseNumber {
    public static void main(String[] args) {
        int number = 9732;
        int mod = 0;
        int reverse = 0;
        while(number>0) {
            mod = number%10;
            reverse = reverse*10 + mod;
            number = number /10;
        }
        System.out.println(reverse);
    }
}
