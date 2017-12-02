package com.company.lesson_01_intro;

/**
 * Created by temap on 12.11.2017.
 */
public class Test_02 {
    public static void main(String[] args) {
        int a = 10; // 30
        int b = 30; // 17
        int c = 17;
        int d = a;// 10
        a = b;
        b = c;
        c = d;
        System.out.println(a + " " + b + " " + c);
    }
}
