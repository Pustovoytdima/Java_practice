package com.company.HW.L_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by temap on 05.12.2017.
 * S-квадрат
 * Вывести на экран квадрат из 10х10 букв S используя цикл while.
 * Буквы в одной строке не разделять.
 */
public class l_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("S  ");
            }

            System.out.println();
        }

    }
}
