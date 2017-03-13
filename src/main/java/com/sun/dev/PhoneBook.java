package com.sun.dev;

import org.apache.bcel.generic.SWITCH;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by senorita on 1/14/2017.
 */
public class PhoneBook {
    HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();
    Iterator<Map.Entry<String,Integer>> entries = phoneBook.entrySet().iterator();
    Scanner sc = new Scanner(System.in);
    String name = "";
    int phoneNumber = 0;

    public void addRecord(){
        System.out.println("Please Enter Name");
        name = sc.next();
        System.out.println("Please Enter Phone Number");
        phoneNumber = sc.nextInt();
        phoneBook.put(name,phoneNumber);
        displayRecord();
    }
    public void displayRecord(){
        while(entries.hasNext()){
            Map.Entry<String,Integer> entry = entries.next();
            System.out.println("Name=" +entry.getKey() + ", Number=" +entry.getValue());
        }
    }
    public void searchRecord(){
        System.out.println("Enter the Name:");
        String input = sc.next();
        while(entries.hasNext()){
            Map.Entry<String,Integer> entry = entries.next();
            if(input.equals(entry.getKey())){
                System.out.println("Name=" +entry.getKey() + ", Number=" +entry.getValue());
            } else
                System.out.println("No Record Found with the mentioned name");
        }
    }
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner sc = new Scanner(System.in);
        boolean flag;
        System.out.println("Welcome to Phonebook");
        do {
            System.out.println("You are looking to 1.Add Record 2.Search Record 3.Delete Record 4.Exit");
            int choice = sc.nextInt();
            switch(choice) {
                case 1 : phoneBook.addRecord();
                    break;
                case 2 : phoneBook.searchRecord();
                    break;
                default:
                         System.exit(0);
            }
            System.out.println("Do you want to continue: Yes or No");
            String ch = sc.next();
            if (ch.contains("Yes"))
                flag = true;
            else flag = false;
        }while(flag);

    }
}
