package com.company.Lesson_06;

/**
 * Created by temap on 17.12.2017.
 */

public class Cat {
    public int age;
    public String name;

    Cat(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void fights(Cat cat){
        if(this.age > cat.age){
            System.out.println("Im older");
        } else {
            System.out.println("Im younger");
        }
    }

}
