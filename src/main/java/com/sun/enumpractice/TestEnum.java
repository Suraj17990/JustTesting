package com.sun.enumpractice;

/**
 * Created by senorita on 2/5/2017.
 */
public class TestEnum {
    enum myEnum {
        Sunday, Monday, tuesday, Wednesday, Thursday, Friday, Saturday;
    }

    public static void getEnumData() {
        System.out.println(myEnum.valueOf("Friday"));
    }

    public static void main(String[] args) {
        getEnumData();
    }
}
