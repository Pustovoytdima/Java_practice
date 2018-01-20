package com.company.Lesson_08;

/**
 * Created by temap on 20.01.2018.
 * /* Таблица умножения
 * Вывести на экран таблицу умножения 10х10 используя цикл while.
 * Числа разделить пробелом.
 * 1 2 3 4 5 6 7 8 9 10
 * 2 4 6 8 10 12 14 16 18 20
 * ...
 */
public class Task_05 {
    public static void main(String[] args){
        int i = 0;
        while (i < 10){
            i++;
            int j = 0;
            while (j < 10){
                j++;
                System.out.print(j * i + " ");
            }
            System.out.println();
        }

    }
}
