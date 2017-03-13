package com.sun.test;

/**
 * Created by senorita on 3/7/2017.
 */
public class Dog extends Animal implements Carnivores {
    public void move(){
        super.move();
        System.out.println("Dog can walk and run");
    }

    public void eat(){
        System.out.println("Dog eats meat");
    }
}
