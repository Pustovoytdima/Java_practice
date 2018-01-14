package com.company.Lesson_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by temap on 14.01.2018.
 */
public class Task_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        min(a, b, c);
    }

    public static void min(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < a && b < c) {
            System.out.println(b);
        } else if (c < a && c < b) {
            System.out.println(c);
        } else {
            System.out.println("Number is equals");
        }
    }
}
