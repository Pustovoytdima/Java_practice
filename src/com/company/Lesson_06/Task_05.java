package com.company.Lesson_06;

/**
 * Created by temap on 17.12.2017.
 * Создать класс Cat с параметрами: name, age, power
 * Реализовать метод boolean fight(Cat anotherCat):
 * реализовать механизм драки котов в зависимости от силы.
 * Метод должен определять, выиграли ли мы (this) бой или нет,
 * т.е. возвращать true, если выиграли и false - если нет.
 * Должно выполняться условие:
 * если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
 */
public class Task_05 {
    public static void main(String[] args) {
        Dog dog1 = new Dog(5, "Jora", 59);
        Dog dog2 = new Dog(4, "Fiona", 89);

        try {
            if (dog1.fights(dog2)) {
                System.out.println(dog1.name + " is winner");
            } else {
                System.out.println(dog2.name + " is winner");
            }
        } catch (RuntimeException e){
            System.out.println("Equals");
        }
    }


}

class Dog {
    public int age;
    public String name;
    public int power;

    Dog(int age, String name, int power) {
        this.age = age;
        this.name = name;
        this.power = power;
    }

    public boolean fights(Dog dog) {
        if (this.power > dog.power) {
            return true;
        } else if (this.power < dog.power){
            return false;
        } else {
            throw new RuntimeException("Equals");
        }
    }

}