package com.company.Lesson_07_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by temap on 23.12.2017.
 * Создать массив на 5 чисел, заполнить его с клавиатуры
 * Найти максимальное значение в этом массиве и вывести его в консоль
 */
public class Task_08 {
    public static void main(String[]args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[]array = new int[5]; // 5 3 34 23 1
        for (int i = 0; i <array.length ; i++) {
            array[i] = Integer.parseInt(reader.readLine());

        }

        if(array.length > 0) {
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }

            System.out.println(max);
        }
    }
}
