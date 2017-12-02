package com.company.lesson_02_if_else;

/**
 * Created by temap on 26.11.2017.
 * 2 numbers input -> min -> n1 == n2 -> return 0
 */
public class Test_03 {
    public static void main(String[] args) {
        int a1 = 6;
        int a2 = 6;
        System.out.println(min(a1, a2));
    }

    public static int min(int n1, int n2) {
        if (n1 < n2) {
            return n1;
        } else if (n1 == n2) {
            return 0;
        } else {
            return n2;
        }
    }
}
