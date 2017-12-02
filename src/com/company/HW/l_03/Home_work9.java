package com.company.HW.l_03;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by temap on 01.12.2017.Реализовать метод closeToTen.
 * Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в аргументах метода.Например, среди чисел 8 и 11 ближайшее к десяти 11.
 * Если оба числа на равной длине к 10, то вывести на экран любое из них.
 */
public class Home_work9 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your number");
        int a1 = Integer.parseInt(reader.readLine());
        int a2 = Integer.parseInt(reader.readLine());
        closeToTen(a1, a2);
    }

    public static void closeToTen(int n1, int n2) {
        int num1 = 10 - n1; // Math
        int num2 = 10 - n2;
        if (num1 < num2) {
            System.out.println(n1);
        } else {
            System.out.println(n2);
        }
    }

    public static int abs(int i){
        if (i < 0){
            return (-i);
        }
        else {
            return(i);
        }
    }
}
