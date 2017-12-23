package com.company.Lesson_07_arrays;

/**
 * Created by temap on 23.12.2017.
 * Создать массив на 5 чисел, заполнить его числами от 40 до 36 не используя баф рид
 * Вывести последние 3 значения
 */
public class Task_06 {
    public static void main(String[] args) {
        int[]array = new int[5];
        for(int i = 0; i < array.length; i++){
            array[i] = 40 - i;
        }
        for(int i = 2; i <= 4; i++){
            System.out.println(array[i]);
        }
    }
}
