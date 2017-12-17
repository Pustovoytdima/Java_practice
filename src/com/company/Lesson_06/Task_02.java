package com.company.Lesson_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by temap on 17.12.2017.
 * Посчитать сумму чисел
 * Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
 * -1 должно учитываться в сумме.
 */
public class Task_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int sum = 0;
        do{
            a = Integer.parseInt(reader.readLine());
            sum = sum + a;
        } while (a != -1);
        System.out.println(sum);
    }
}
