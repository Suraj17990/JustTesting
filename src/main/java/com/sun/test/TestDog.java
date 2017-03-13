package com.sun.test;

/**
 * Created by senorita on 3/7/2017.
 */
public class TestDog {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.move();
        Carnivores c = new Dog();
        c.eat();
    }
}
