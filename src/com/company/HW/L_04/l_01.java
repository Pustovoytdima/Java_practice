package com.company.HW.L_04;

import java.io.IOException;

/**
 * Created by temap on 05.12.2017.
 * S-квадрат
 * Вывести на экран квадрат из 10х10 букв S используя цикл while.
 * Буквы в одной строке не разделять.
 */
public class l_01 {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("S  ");
            }

            System.out.println();
        }

    }
}
