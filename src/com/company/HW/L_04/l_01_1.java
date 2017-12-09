package com.company.HW.L_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by temap on 09.12.2017.
 * S-квадрат
 * Вывести на экран квадрат из 10х10 букв S используя цикл while.
 * Буквы в одной строке не разделять.
 * int m = Integer.parseInt(reader.readLine());
 * int n = Integer.parseInt(reader.readLine());
 *
 */
public class l_01_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int i = 0;
        while (i < a) {
            int j = 0;
            while (j < b) {
                System.out.print("S");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
