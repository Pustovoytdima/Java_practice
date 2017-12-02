package com.company.lesson_02_if_else;

/**
 * Created by temap on 26.11.2017.
 */
public class Test_01 {
    public static void main(String[] args) {
        int a1 = 20;
        int a2 = 50;

        // < > == != <= >=
        // && - AND true true
        // || - OR  false true

        if(a1 >= 20 && a1 <= 40){
            System.out.println("Ok");
        } else {
            System.out.println("Ne ok");
        }

        if(a2 >= 20 || a2 <= 40){
            System.out.println("Ok");
        } else {
            System.out.println("Ne ok");
        }

        if(a1 > 20){
            System.out.println("Ok");
        } else if(a1 < 20){
            System.out.println("Ne ok");
        } else if(a1 == 20){
            System.out.println("Equals");
        } else {
            System.out.println("Text");
        }
    }
}
