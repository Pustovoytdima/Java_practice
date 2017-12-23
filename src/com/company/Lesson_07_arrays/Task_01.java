package com.company.Lesson_07_arrays;

/**
 * Created by temap on 23.12.2017.
 * Создай 2 класса:
 - класс Man с полями: name, age, weight, wife. Подумай какой тип должен быть у каждого поля.
 - класс Woman с полями: name, age, weight, husband. Подумай какой тип должен быть у каждого поля.
 В выполняющем методе создай по одному объекту перечисленных выше классов, и сделай так, что бы они были мужем и женой :)
 После чего выведи надпись в консоль:
 "Привет! Меня зовут man.name. Мне man.age. Мою жену зовут man.wife.name"
 "Привет! Меня зовут woman.name. Мне woman.age. Моего мужа зовут woman.husband.name"
 */
public class Task_01 {
    public static void main (String[]args){
        Man man = new Man("Artem",21, 56, null);
        Women women = new Women("Alina", 24, 65, man);
        man.setWife(women);
    }
}

class Man{
    private String name;
    private int age;
    private int weight;
    private Women wife;

    public Man(String name, int age, int weight, Women wife) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.wife = wife;
    }

    public Man() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Women getWife() {
        return wife;
    }

    public void setWife(Women wife) {
        this.wife = wife;
    }
}
class Women{
    private String name;
    private int age;
    private int weight;
    private Man husband;

    Women(String name, int age, int weight, Man husband){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.husband = husband;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Man getHusband() {
        return husband;
    }

    public void setHusband(Man husband) {
        this.husband = husband;
    }
}