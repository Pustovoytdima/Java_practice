package com.company.lesson_02_if_else;

/**
 * Created by temap on 26.11.2017.
 * 2 numbers input -> max of numbers
 */
public class Test_02 {
    public static void main(String[] arg) {
        int a1 = 15;
        int a2 = 10;
        System.out.println(max(a1, a2));
    }

    public static int max(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

}
