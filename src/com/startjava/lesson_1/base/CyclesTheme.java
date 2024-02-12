package com.startjava.lesson_1.base;

public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int sumOddNumbers = 0;
        int sumEvenNumbers = 0;
        int beginingOfSegment = -10;
        int endOfSegment = 21;
        System.out.print("В отрезке [" + beginingOfSegment + ", " + endOfSegment + "]");
        do {
            if (beginingOfSegment % 2 == 1 || beginingOfSegment % 2 == -1) {
                sumOddNumbers += beginingOfSegment;
            } else {
                sumEvenNumbers += beginingOfSegment;
            }
            beginingOfSegment++;
        } while (beginingOfSegment <= endOfSegment);
        System.out.println(" сумма четных чисел = " + sumEvenNumbers +
                ", а нечетных " + sumOddNumbers + "\n");

        System.out.println("2. Вывод чисел в порядке убывания");
        int b = 5;
        int max = 10;
        int min = -1;

        if (b > min && b > max) {
            max = b;
        }
        if (b < min && b < max) {
            min = b;
        }

        for (int i = max - 1; i > min; i--) {
            System.out.printf("%2d", i);
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int numForReverse = 1234;
        int sum = 0;
        System.out.print("исходное число в обратном порядке - ");
        while (numForReverse > 0) {
            int lastDigit = numForReverse % 10;
            System.out.print(lastDigit);
            sum += lastDigit;
            numForReverse /= 10;
        }
        System.out.println("\nсумма - " + sum + "\n");

        System.out.println("4. Вывод чисел в несколько строк");
        int count = 0;
        for (int i = 1; i < 24; i += 2) {
            count++;
            System.out.printf("%3d", i);
            if (count % 5 == 0) {
                System.out.println();
            } else {
            }
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        int num = 3242592;
        int numCopy = num;
        int countTwos = 0;
        while (numCopy > 0) {
            if (numCopy % 10 == 2) {
                countTwos++;
            }
            numCopy /= 10;
        }
        if (countTwos % 2 == 0) {
            System.out.println("В " + num + " чётное количество двоек - " + countTwos + "\n");
        } else {
            System.out.println("В " + num + " нечётное количество двоек - " + countTwos + "\n");
        }

        System.out.println("6. Отображение геометрических фигур");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int rightTriangle = 5;
        while (rightTriangle  > 0) {
            int row = 0;
            while (row < rightTriangle ) {
                System.out.print("#");
                row++;
            }
            System.out.println();
            rightTriangle--;
        }

        int triangleHeight = 5;
        int triangleWidth = 3;
        int center = triangleHeight / 2;
        int column = 0;
        do {
            int row = 0;
            do {
                if (column <= center) {
                    if (row >= center - column && row <= center + column) {
                        System.out.print("$");
                    } else
                        System.out.print(" ");
                } else {
                    if (row >= center + column - triangleHeight - 1 && row <= center - column + triangleWidth - 1) {
                        System.out.print("$");
                    } else {
                        System.out.print(" ");
                    }
                }
                row++;
            } while (row < triangleWidth);
            System.out.println(" ");
        } while (column++ < triangleHeight);

        System.out.println("7. Отображение ASCII-символов");
        System.out.printf("%-9S%-11S%-13S%n", "decimal", "character", "description");
        for (int sign = 15; sign < 123; sign++) {
            if (sign % 2 != 0 && sign < 48) {
                System.out.printf("  %-11d%-12c%-20s%n", sign, sign, Character.getName(sign));
            } else if (sign % 2 == 0 && sign >= 'a' && sign <= 'z') {
                System.out.printf("  %-11d%-12c%-20s%n", sign, sign, Character.getName(sign));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int numPalindrome = 121;
        int temp = numPalindrome;
        int reverseNumber = 0;

        while (temp > 0) {
            int lastDigit = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            temp /= 10;
        }
        if (numPalindrome == reverseNumber) {
            System.out.println("число " + numPalindrome + " является палиндромом\n");
        } else {
            System.out.println("число " + numPalindrome + " не является палиндромом\n");
        }

        System.out.println("9. Проверка, является ли число счастливым");
        int luckyNumber = 123543;
        int luckyNumberCopy = luckyNumber;
        int digitCount = 0;
        int sum1 = 0;
        int sum2 = 0;

        while (luckyNumberCopy > 0) {
            int lastDigit = luckyNumberCopy % 10;
            if (digitCount >= 3) {
                sum2 += lastDigit;
            } else {
                sum1 += lastDigit;
            }
            luckyNumberCopy /= 10;
            digitCount++;
        }
        if (sum1 == sum2) {
            System.out.println("Число " + luckyNumber + " является счастливым");
        } else {
            System.out.println("Число " + luckyNumber + " не является счастливым");
        }
        System.out.println("Сумма цифр ABC = " + sum2 + ", а сумма DEF = " + sum1 + "\n");

        System.out.println("10. Отображение таблицы умножения Пифагора");
        System.out.printf("%22S%n", "таблица пифагора");
        System.out.print("    |");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println("\n----|------------------------");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%3d |", i);
            for (int j = 2; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}