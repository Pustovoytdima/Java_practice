package com.company.HW.l_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by temap on 01.12.2017.
 */
public class Home_Work8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Number input -> sout Number NUMBER in interval if number contains in interval of 0 to 100, else sout Number NUMBER is not in interval");
        System.out.println("Enter your number");
        int a1 = Integer.parseInt(reader.readLine());
        cont(a1);

    }

    public static void cont(int n1) {
        if (n1 > 0 && n1 < 100) {
            System.out.println("Number " + n1 + " in interval");
        } else {
            System.out.println(" Number " + n1 + " is not in interval");
        }
    }
}
