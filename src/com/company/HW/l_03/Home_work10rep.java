package com.company.HW.l_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by temap on 10.12.2017.
 * "min of 3 numbers -> sout ->Min number is NUMBER-> min -> if numbers is equals sout ->Numbers is equals")
 */
public class Home_work10rep {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter three number");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        min(a, b, c);
    }
    public static void min (int n1, int n2, int n3){
        if(n1 < n2 && n1 < n3){
            System.out.println("Your min number is " + n1);
        }
        else if(n2 < n1 && n2 < n3){
            System.out.println("Your min number is " + n2);
        }
        else if( n3 < n1 && n3 < n2){
            System.out.println("Your min number is " + n3);
        }
        else if ( n1 == n2 && n1 == n3){
            System.out.println("The number is equals");
        }
    }
}
