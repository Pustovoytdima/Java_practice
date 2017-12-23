package com.company.Lesson_07_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by temap on 23.12.2017.
 * Создать массив на 5 чисел и 5 строк, заполнть их с клавиатуры
 * Вывести массив в консоль чисел в обратном порядке
 * Вывесть массив в консоль слов
 */
public class Task_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        System.out.println("Enter your number");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());

        }
        String[]array1 = new String [5];
        System.out.println("Enter your String");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = reader.readLine();

        }
        for(int i = 4; i >= 0; i-- ){
            System.out.println(array[i]);
        }
        for (int i = 0; i < 5 ; i++) {
            System.out.println(array1[i]);

        }


    }
}
