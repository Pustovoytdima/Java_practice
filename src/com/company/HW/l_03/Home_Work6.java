package com.company.HW.l_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by temap on 29.11.2017.
 */
public class Home_Work6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input 3 of numbers -> max -> sout max -> equals sout 'Number is equals'");
        System.out.println("Enter 3 numbers ");
        int a1 = Integer.parseInt(reader.readLine());
        int a2 = Integer.parseInt(reader.readLine());
        int a3 = Integer.parseInt(reader.readLine());
        System.out.println(" Your true number is ");              //почему не могу вывести на экран?
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
            System.out.println("Number is equals");
        }
    }
}
