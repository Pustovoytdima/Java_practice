package com.company.Lesson_07_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by temap on 23.12.2017.
 * Создать массив на 10 чисел, заполнить 1, 3 и последний индекс значениями
 * Вывести в консоль все числа в этом массиве, каждое значение с новой строки
 */
public class Task_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] dima = new int[10];
        for (int i = 0; i < dima.length; i++) {
            dima[i] = Integer.parseInt(reader.readLine());
        }
        dima[0] = 23;
        dima[2] = 24;
        dima[9] = 25;
        for(int i = 0; i < dima.length; i++){
            System.out.println(dima[i]);
        }

    }
}
