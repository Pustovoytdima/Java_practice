package com.company.lesson_05_cycle;

/**
 * Created by temap on 09.12.2017.
 * Рисуем треугольник
 Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
 Пример:
 8
 88
 888
 ...
 */
public class Test_03 {
    public static void main (String[]args){
        int m = 10;
        for (int i = 1; i <= m; i++){
            for ( int j = 0; j < i; j++){
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
