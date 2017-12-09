package com.company.lesson_05_cycle;

/**
 * Created by temap on 09.12.2017.
 * S-квадрат
 * Вывести на экран квадрат из 10х10 букв S используя цикл while.
 * Буквы в одной строке не разделять.
 */
public class Test_02 {
    public static void main(String[] args) {
        int m = 10;
        int n = 10;
        int i = 0;
        while (i < m) {
            int j = 0;
            while (j < n) {
                System.out.print(" S");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
