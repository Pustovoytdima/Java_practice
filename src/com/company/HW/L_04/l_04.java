package com.company.HW.L_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by temap on 05.12.2017.
 * <p>
 * Ввести строку с консоли, если строка равна "exit", то вывести "Good bye!" в консоль,
 * иначе если строка равна "hi", то вывести "Welcome!" в консоль, иначе выводить "Ahaha, very funny!" в консоль.
 *
 //
 //        }
 */
public class l_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your String ");
        String a = reader.readLine();
        cons(a);

    }

    public static void cons(String a) {
        if (a.equals("exit")) {
            System.out.println("Good bye!");
        } else if (a.equals("hi")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Ahah Very funny");
        }
    }
}
