package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();
        Player p1 = new Player(name1);

        System.out.print("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();
        Player p2 = new Player(name2);

        GuessNumber game = new GuessNumber(p1, p2);
        String answer = "yes";
        while (answer.equals("yes")) {
            game.start();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}