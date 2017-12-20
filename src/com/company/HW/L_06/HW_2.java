package com.company.HW.L_06;

/**
 * Created by temap on 20.12.2017.
 * Создать класс Cat с параметрами: name, age, power
 * Реализовать метод boolean fight(Cat anotherCat):
 * реализовать механизм драки котов в зависимости от силы.
 * Метод должен определять, выиграли ли мы (this) бой или нет,
 * т.е. возвращать true, если выиграли и false - если нет.
 * Должно выполняться условие:
 * если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
 */
public class HW_2 {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Farmacetron", 26, 99);
        Robot robot2 = new Robot("Victor", 36, 97);
        if (robot1.fights(robot2)) {
            System.out.println(robot2.name + " is Winner");
        } else {
            System.out.println(robot1.name + " is Winner");
        }
    }
}

class Robot {
    public String name;
    public int age;
    public int power;

    Robot(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }

    public boolean fights(Robot robot) {
        if (this.power < robot.power) {
            return true;
        } else {
            return false;
        }
    }
}
