package com.company.HW.l_02;

/**
 * Created by temap on 29.11.2017.
 * min of 3 numbers -> sout "Min number is NUMBER" min -> if numbers is equals sout "Numbers is equals"
 */
public class Test_06HW {
    public static void main(String[] args) {
        int n1 = 8;
        int n2 = 8;
        int n3 = 8;
        min(n1, n2, n3);
    }

    public static void min(int n1, int n2, int n3) {
        if (n1 < n2 && n1 < n3) {
            System.out.println("Min number is " + n1 + " min");
        } else if (n2 < n1 && n2 < n3) {
            System.out.println("Min number is " + n2 + " min");
        } else if (n3 < n1 && n3 < n2) {
            System.out.println("Min number is " + n3 + " min");
        } else if (n1 == n2 && n1 == n3) {
            System.out.println(" Number is equals ");
        }
    }
}
