package com.sun.dev;

/**
 * Write a Java class, Flower, that has three instance variables of type String, int,
 and float, which respectively represent the name of the flower, its number of
 petals, and price. Your class must include a constructor method that initializes
 each variable to an appropriate value, and your class should include methods for
 setting the value of each type, and getting the value of each type.
 */
public class Flower {
    public String nameOfTheFlower;

    public String getNameOfTheFlower() {
        return nameOfTheFlower;
    }

    public void setNameOfTheFlower(String nameOfTheFlower) {
        this.nameOfTheFlower = nameOfTheFlower;
    }

    public int getNumberOfPetals() {
        return numberOfPetals;
    }

    public void setNumberOfPetals(int numberOfPetals) {
        this.numberOfPetals = numberOfPetals;
    }

    public float getPriceOftheFlower() {
        return priceOftheFlower;
    }

    public void setPriceOftheFlower(float priceOftheFlower) {
        this.priceOftheFlower = priceOftheFlower;
    }

    public int numberOfPetals;
    public float priceOftheFlower;

    Flower(String flower, int petals, float price) {
        this.nameOfTheFlower = flower;
        this.numberOfPetals = petals;
        this.priceOftheFlower = price;
    }
}
