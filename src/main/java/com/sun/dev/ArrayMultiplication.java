package com.sun.dev;

/**
 * Created by senorita on 2/12/2017.
 */
public class ArrayMultiplication {
    public int[] arrayMultiplication(int[] a, int[] b){
        int[] c = new int[3];
        for(int i=0; i<a.length; i++){
            c[i] = a[i]*b[i];
        }
        return c;
    }
    public static void main(String[] args) {
        ArrayMultiplication am = new ArrayMultiplication();
        int[] dotProduct;
        int[] array1 = {2, 4, 6};
        int[] array2 = {3, 5, 7};
        dotProduct = am.arrayMultiplication(array1,array2);
        for (int i=0; i<dotProduct.length; i++){
            System.out.print(dotProduct[i]+",");
        }
    }
}
