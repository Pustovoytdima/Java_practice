package com.company.lesson_05_cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Рисуем прямоугольник
 * Ввести с клавиатуры два числа fights и n.
 * Используя цикл for вывести на экран прямоугольник размером fights на n из восьмёрок.
 * Пример: fights=2, n=4
 * 8888
 * 8888
 */

public class Test_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
