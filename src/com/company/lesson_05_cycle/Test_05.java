package com.company.lesson_05_cycle;

/**
 * Created by temap on 09.12.2017.
 * Рисуем линии
 * Используя цикл for вывести на экран:
 * - горизонтальную линию из 10 восьмёрок
 * - вертикальную линию из 10 восьмёрок.
 * 8888888888
 * 8
 * 8
 * 8
 * 8
 * 8
 * 8
 * 8
 * 8
 * 8
 * 8
 */
public class Test_05 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print("8");
        }
        System.out.println();
        for (int i = 0; i < 10; i++){
            System.out.println("8");
        }


    }
}
