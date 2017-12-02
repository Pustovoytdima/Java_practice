package com.company.HW.l_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by temap on 01.12.2017.
 */
public class Home_Work7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("min of 3 numbers -> sout ->Min number is NUMBER-> min -> if numbers is equals sout ->Numbers is equals");
        System.out.println("Enter 3 number");
        int a1 = Integer.parseInt(reader.readLine());
        int a2 = Integer.parseInt(reader.readLine());
        int a3 = Integer.parseInt(reader.readLine());
        min(a1, a2, a3);
    }

    public static void min(int n1, int n2, int n3) {
        if (n1 < n2 && n1 < n3) {
            System.out.println("Min number is " + n1);
        } else if (n2 < n1 && n2 < n3) {
            System.out.println("Min number is " + n2);
        } else if (n3 < n1 && n3 < n2) {
            System.out.println("Min number is " + n3);
        } else if (n1 == n2 && n1 == n3) {
            System.out.println("Number is equals");
        }
    }
}
