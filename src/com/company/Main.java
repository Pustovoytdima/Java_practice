package com.company;

/**
 * Created by temap on 15.07.2017.
 * OOP - object oriented prog
 */
public class Main {
    public static void main(String[] args) {
        String s = "20";

        byte b = 127;          // 1 byte = 8 bit // Byte
        boolean bool = true;   // false 1 byte   // Boolean
        char c = 'y';          // 2 byte         // Character
        short sh = 32000;      // 2 byte         // Short
        int i = 20;            // 4 byte 2^32    // Integer
        long l = 20000000000l; // 6 byte         // Long
        float f = 21.1f;                         // Float
        double d = 22.2;       // 8 byte         // Double

        Integer intr = 10;
        int number = Integer.parseInt(s);

        System.out.println(number + number);

        if(intr.equals(10)){
            System.out.println("Ten");
        } else {
            System.out.println("Other");
        }

        System.out.println(i * i);
    }

    public void method(){
        System.out.println("Move!@");
    }
}
