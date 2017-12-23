package com.company.Lesson_06;

/**
 * Created by temap on 17.12.2017.
 * women -> name, age
 * fish  -> name, age, owner
 * Lion  -> name, age, owner
 * Elephant -> name, age, owner
 *
 * Hi! My name is [name].
 * Hi! My name is [name], my owner is [name]
 * Hi! My name is [name], my owner is [name]
 * Hi! My name is [name], my owner is [name]
 */
public class Task_06 {
    public static void main(String[] args) {
        Women women = new Women("Alina",23);
        Fish fish = new Fish ("Karasik", 3, women);
        Lion lion = new Lion ("Simba", 7, women);
        Elephant elephant = new Elephant("Slon", 25, women);
        System.out.println("Hi! my name is " + women.name);
        System.out.println("Hi! my name is " + fish.name + " my owner is " + women.name);
        System.out.println("Hi! my name is " + lion.name + " my owner is " + women.name);
        System.out.println("Hi! my name is " + elephant.name + " my owner is " + women.name);
    }
}

class Women {
    public String name;
    public int age;

    Women(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Fish {
    public String name;
    public int age;
    public Women owner;

    Fish(String name, int age, Women owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }
}

class Lion {
    public String name;
    public int age;
    public Women owner;

    Lion(String name, int age, Women owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }
}

class Elephant {
    public String name;
    public int age;
    public Women owner;

    Elephant(String name, int age, Women owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }
}