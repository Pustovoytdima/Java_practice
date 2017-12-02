package com.company.lesson_04;

/**
 * Created by temap on 02.12.2017.
 */
public class Test_01 {
    public static void main(String[] args) {
       for(int i = 0; i < 100; i++){
           System.out.println("Text" + i);
           for (int j = 0; j < 5; j++) {
               System.out.println("Inner " + j);
           }
       }

       int a = 0;
       while (a < 0){
           System.out.println("While " + a);
           a++;
       }


       int b = 0;
       do{
           System.out.println("hefer");
           b++;
       }while(b < 0);
    }


}
