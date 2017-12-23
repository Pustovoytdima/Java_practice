package com.company.Lesson_07_arrays;

import java.util.Arrays;

/**
 * Created by temap on 23.12.2017.
 * 0[]1[]2[]3[123]4[]5[]6[]7[]8[]9[]
 */
public class Task_02 {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[3] = 123;
        System.out.println(array[0]);
        System.out.println(array[3]);

        System.out.println("/////////////////////");
        array[3] = 123314;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
