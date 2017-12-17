package com.company.lesson_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by temap on 02.12.2017.
 * Рисуем прямоугольник
 Ввести с клавиатуры два числа fights и n.
 Используя цикл for вывести на экран прямоугольник размером fights на n из восьмёрок.
 Пример: fights=2, n=4
 8888
 8888
 */
public class Test_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter two number");
//        String s = "rere";
//        if(s.equals("exit")){
//
//        }
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 4; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
