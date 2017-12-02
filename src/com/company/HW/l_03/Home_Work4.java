package com.company.HW.l_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by temap on 28.11.2017.
 */
public class Home_Work4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" 2 number input => max of number ");
        System.out.println(" Enter two number ");
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        System.out.println(" Max number is " + max (n1, n2));


    }

    public static int max(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        }
        else {
            return n2;
        }
    }
}
