package com.company.HW.l_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by temap on 27.11.2017.
 */
public class Home_Work2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("   Enter number + 10%    ");
        int num = Integer.parseInt(reader.readLine());
        System.out.println( num + num * 0.1);
    }
}
