package com.company.lesson_01_intro;

/**
 * Created by temap on 12.11.2017.
 * <p>
 * 1) sum of 3 numbers
 * 2) number + 10% -> 10 -> 11
 * 3) USD -> UAH / 10 -> 269
 * 4) String -> 4 times print in console
 */
public class Test_05 {
    public static void main(String[] args) {
        System.out.println("-----------SUM------------");
        int a = sum(20, 30, 40);
        System.out.println(a);

        System.out.println(sum(60, 12, 23));

        System.out.println("-----------CONVERTER-------------");
        double b = convert(100);
        System.out.println(b);

        System.out.println("--------number + 10%-----------");
        double c = convert1(1000);
        System.out.println(c);

        System.out.println("-------4 times in console----------");
        name("Hello world");

        System.out.println("------------Bitcoin change convertor-----------");
        double g = convertbtc(5000, 9578);
        System.out.println(g);

    }

    public static int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public static double convert(double n1){
        return n1 * 26.91;
    }

    public static double convert1 (double n2){
        return n2 + n2 * 0.1;
    }

    public static void name(String s1){
        System.out.println(s1 + " " + s1 + " " + s1 + " " + s1);
    }

    public static double convertbtc(double n5, double n6){
        return n5 / n6;
    }

}
