package com.sun.dev;

import java.util.Scanner;

/**
 * Created by senorita on 1/14/2017.
 */
public class WeekDays {
    public static void main(String[] args) {
        String[] array = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println("Enter todays day number, for example Monday is day 1 of week");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(array[number-1]);
    }
}
