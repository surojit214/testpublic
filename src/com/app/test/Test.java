package com.app.test;

/**
 * Created by Surojit on 13-09-2015.
 */
public class Test {
    public static void main(String[] args) {
        int[] values = new int[10];
        values[5] = 123;
        for (int i = 0; i < values.length; i++) {
            System.out.println("values = " + values[i]);
        }
        String[] val = new String[12];
        val[5] = "rest";
        for (int i = 0; i < val.length; i++) {
            String s = val[i];
            System.out.println("s = " + s);
        }
    }
}
