package com.company.lesson_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by temap on 02.12.2017.
 * /* Хорошего не бывает много
 * Ввести с клавиатуры строку и число N.
 * Вывести на экран строку N раз используя цикл while.
 * Пример ввода:
 * абв
 * 2
 * Пример вывода:
 * абв
 * абв
 */

public class Test_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String");
        String a = reader.readLine();
        System.out.println("Enter number");
        int b = Integer.parseInt(reader.readLine());
        while(b > 0){
            System.out.println(a);
            b--;
        }
    }
}
