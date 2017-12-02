package com.company.HW.l_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by temap on 28.11.2017.
 */
public class Home_Work3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("  Bitcoin convertor");
        System.out.println("  Enter your sum in Dollar   ");
        double btc1 = Integer.parseInt(reader.readLine());
        System.out.println("Congratulations!!! You have " + btc1 / 9470 + " Bitcoin");
    }
}
