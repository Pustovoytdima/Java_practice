package com.company.Lesson_03_buffered_reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by temap on 26.11.2017.
 *
 * Hi! My name is 'name'. My age is 'age'. My salary is 'salary'+100 dollars.
 */
public class Test_02 {
    public static void main(String[]args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter your name");
        String name = reader.readLine();
        System.out.println("Enter your age");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("Enter your salary");
        int salary = Integer.parseInt(reader.readLine());
        System.out.println("Hi! My name is " + name + ". My age is " + age + ". My salary is " + (salary+100) + " dollars.");
    }

}
