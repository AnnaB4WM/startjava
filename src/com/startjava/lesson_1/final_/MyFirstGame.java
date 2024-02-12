package com.startjava.lesson_1.final_;

public class MyFirstGame {

    public static void main(String[] args) {
        System.out.println("Угадай число от 0 до 100");
        int computerNumber = 77;
        int playerNumber;
        do {
            for (playerNumber = 1; playerNumber <= 100; playerNumber++) {
                if (playerNumber > computerNumber) {
                    System.out.println("Число " + playerNumber + " больше того что загадал компьютер");
                } else if (playerNumber < computerNumber) {
                    System.out.println("Число " + playerNumber + " меньше того что загадал компьютер");
                } else {
                    System.out.println("Вы победили! Загаданное число - " + computerNumber);
                    break;
                }
            }
        } while (playerNumber != computerNumber);
    }
}