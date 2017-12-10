package com.company.HW.L_05;

/**
 * Created by temap on 10.12.2017.
 * S-квадрат
 * Вывести на экран квадрат из 10х10 букв S используя цикл while.
 * Буквы в одной строке не разделять.
 */
public class HW_2 {
    public static void main(String[] args) {
        int m = 10;
        int n = 10;
        int i = 0;
        while (i < m) {
            i++;
            int j = 0;
            while (j < n) {
                System.out.print("S");
                j++;
            }
            System.out.println();
        }
    }
}
