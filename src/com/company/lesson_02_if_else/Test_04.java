package com.company.lesson_02_if_else;

/**
 * Created by temap on 26.11.2017.
 * input: 3 numbers -> max -> sout max -> equals sout "Numbers is equals"
 */
public class Test_04 {
    public static void main(String[] args) {
        int a1 = 6;
        int a2 = 6;
        int a3 = 6;
        max(a1, a2, a3);
    }

    public static void max(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2);
        } else if (n3 > n1 && n3 > n2) {
            System.out.println(n3);
        } else if (n1 == n2 && n1 == n3) {
            System.out.println("Numbers is equals");
        }
    }
}
