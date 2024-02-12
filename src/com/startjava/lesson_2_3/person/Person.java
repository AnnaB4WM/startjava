package com.startjava.lesson_2_3.person;

public class Person {
    
    String gender = "male";
    String name = "Mark";
    double height = 1.80;
    double weight = 75.0;
    int age = 40;

    void move() {
        System.out.println("Вы прошли 100 метров");
    }

    void sit() {
        System.out.println("Вы сели на диван");
    }

    void run() {
        System.out.println("Вы бегаете 3 раза в неделю");
    }

    void speak() {
        System.out.println("Вы говорите по-английски");
    }

    boolean learnJava() {
        System.out.println("Вы изучили 1 Урок");
        return true;
    }
}