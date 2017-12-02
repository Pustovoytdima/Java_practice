package com.company.HW.l_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by temap on 29.11.2017.
 */
public class Home_Work5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Two numbers input -> min -> n1 == n2 -> return 0");
        System.out.println(" Enter two numbers ");
        int a1 = Integer.parseInt(reader.readLine());
        int a2 = Integer.parseInt(reader.readLine());
        System.out.println(" Your number is " + min(a1, a2));
    }

    public static int min(int n1, int n2) {
        if (n1 < n2) {
            return n1;
        } else if (n1 == n2) {
            return 0;
        } else {
            return n2;                                      //как сделать чтоб если н1 == н2 выводило ваше число 0?
        }
    }
}
