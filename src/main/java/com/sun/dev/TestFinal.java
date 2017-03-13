package com.sun.dev;

/**
 * Created by senorita on 2/1/2017.
 */
public class TestFinal {
    public final int i = 10;
    int j=0;
    TestFinal(int j){
        this.j = j;
    }
    public final void testFinal() {
        int sum=0;
        sum = i + j;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        TestFinal testFinal = new TestFinal(10);
        testFinal.testFinal();
    }
}
