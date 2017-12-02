package com.company.lesson_02_if_else;

/**
 * Created by temap on 26.11.2017.
 * <p>
 * HW:
 * 1) min of 3 numbers -> sout "Min number is NUMBER" min -> if numbers is equals sout "Numbers is equals"
 * 2) SKYPE
 * 3) lesson_01 (Test05) + lesson_02 (02 - 05) -> BufferedReader
 * 4) Registration on GitHub
 * <p>
 * Number input -> sout "Number NUMBER in interval" if number contains in interval of 0 to 100, else sout "Number NUMBER is not in interval"
 */
public class Test_05 {

    public static void main(String[] args) {
        int a1 = 140;
        cont(a1);
    }

    public static void cont(int n1) {
        if (n1 > 0 && n1 < 100) {
            System.out.println("Number " + n1 + " in interval");
        } else {
            System.out.println("Number " + n1 + " is not in interval");
        }

    }
}
