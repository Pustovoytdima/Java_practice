package com.company.HW.l_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by temap on 27.11.2017.
 */
public class Test_03HomeWork {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter please 3 number");
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        System.out.println(num1 + num2 + num3);

        System.out.println("OK) Good work!!! Now enter some of number and I convert it)");
        double conv = Integer.parseInt(reader.readLine());
        System.out.println(conv * 26.7);


    }
}





