package com.company.lesson_01_intro;

/**
 * Created by temap on 12.11.2017.
 * Работа с статик и нон-статик переменными
 */
public class Test_03 {
    static int age = 30;
    int weight = 40;

    public static void main(String[] args) {
        Test_03 t = new Test_03();
        Test_03 t1 = new Test_03();
        Test_03 t2 = new Test_03();

        t.age = 15;    // Статик переменная age - поменяла свое значение у всех объектов
        t.weight = 10; // Нон статик переменная weight - поменяла свое значение только у объекта t

        System.out.println("-------Static-----------");

        System.out.println(t.age);
        System.out.println(t1.age);
        System.out.println(t2.age);

        System.out.println("-------NON STATIC-----------");

        System.out.println(t.weight);
        System.out.println(t1.weight);
        System.out.println(t2.weight);
    }
}
