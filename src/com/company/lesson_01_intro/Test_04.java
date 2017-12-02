package com.company.lesson_01_intro;

/**
 * Created by temap on 12.11.2017.
 */
public class Test_04 {
    String name = "Artem";

    public static void main(String[] args) {
        Test_04 t = new Test_04();
        t.setName("Igor");
        System.out.println(t.name);

        Test_04 t1 = new Test_04();
        System.out.println(t1.name);

        int result = Test_04.m2(123, 324);
        System.out.println(result);
    }

    public void setName(String n) {
        name = n;
    }

    public static int m2(int n1, int n2) {
        int c = n1 + n2;
        return c;
    }
}
