package com.sun.dev;

/**
 * Created by senorita on 1/14/2017.
 */
public class ReverseString {
    public static void main(String[] args) {
        String name = "Suraj";
        String reverse = "";
        for(int i=name.length()-1; i>=0; i--) {
            reverse = reverse + name.charAt(i);
        }
        System.out.println(reverse);
    }
}
