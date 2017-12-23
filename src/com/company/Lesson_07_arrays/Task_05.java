package com.company.Lesson_07_arrays;

/**
 * Created by temap on 23.12.2017.
 * /**
 * Created by temap on 23.12.2017.
 * Создать массив на 10 чисел, заполнить его числами от 25 до 34 не используя баф рид
 * Вывести значения в обратном порядке
 */

public class Task_05 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = 25 + i;

        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(array[i]);

        }
    }
}
