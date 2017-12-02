package com.company.Lesson_03_buffered_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by temap on 26.11.2017.
 */
public class Test_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        System.out.println("Text: " + s);

        System.out.println("Enter only number: ");
        int n = Integer.parseInt(reader.readLine());
        System.out.println(n*n);
    }
}
