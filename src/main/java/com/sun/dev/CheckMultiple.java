package com.sun.dev;

/**
 * Created by senorita on 2/9/2017.
 */
public class CheckMultiple {
    public  boolean isMultiple(long n, long m){
        long l;
        boolean flag=false;
        for (int i=1; i<m; i++) {
            l = m*i;
            if(l==n) {
                flag = true;
                System.out.println("m is multiple of n");
                break;
            }
            else if (l>n) {
                System.out.println("m is not multiple of n");
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        CheckMultiple check = new CheckMultiple();
        check.isMultiple(125, 27);
    }
}
