package com.company.Lesson_08;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by temap on 20.01.2018.
 * Рисуем треугольник
 Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
 Пример:
 8
 88
 888
 ...
 */
public class Task_04 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
