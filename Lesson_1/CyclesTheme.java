public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int oddNumbersSum = 0;
        int evenNumbersSum = 0;
        int segmentBegin = -10;
        int segmentEnd = 21;
        System.out.print("В отрезке [" + segmentBegin + ", " + segmentEnd + "]");
        do {
            if (segmentBegin % 2 == 1 || segmentBegin % 2 == -1) {
                oddNumbersSum = oddNumbersSum + segmentBegin;
            } else {
                evenNumbersSum = evenNumbersSum + segmentBegin;
            }
            segmentBegin++;
        } while (segmentBegin <= segmentEnd);
        System.out.println(" сумма четных чисел = " + evenNumbersSum +
                ", а нечетных " + oddNumbersSum + "\n");

        System.out.println("2. Вывод чисел в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int max;
        int min;

        if (a > b && a > c) {
            max = a;
        } else if (b > c) {
            max = b;
        } else {
            max = c;
        }

        if (a < b && a < c) {
            min = a;
        } else if (b < c) {
            min = b;
        } else {
            min = c;
        }

        for (int i = max - 1; i > min; i--) {
            System.out.printf("%2d", i);
        }
        System.out.println("\n");

        System.out.println("3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int reversedNumber = 0;
        int sum = 0;
        System.out.print("исходное число в обратном порядке - ");
        while (num > 0) {
            reversedNumber = num % 10;
            System.out.print(reversedNumber);
            sum += reversedNumber;
            num /= 10;
        }
        System.out.println("\nсумма - " + sum + "\n");

        System.out.println("4. Вывод чисел в несколько строк");
        for (int i = 1; i < 24; i += 10) {
            System.out.printf("%3d", i);
            for (int j = 2; j < 9; j += 2) {
                if ((i + j) > 23) {
                    System.out.printf("%3d%3d%3d", 0, 0 , 0);
                    break;
                }
                    System.out.printf("%3d", i + j);
                }
            System.out.println();
            }
        System.out.println();

        System.out.println("5. Проверка количества двоек числа на четность/нечетность");
        int numWithTwos = 3242592;
        int countTwos = 0;
        while (numWithTwos > 0) {
            if (numWithTwos % 10 == 2) {
                countTwos++;
            }
            numWithTwos /= 10;
        }
        if (countTwos % 2 == 0) {
            System.out.println("В " + numWithTwos + " чётное количество двоек - " + countTwos + "\n");
        } else {
            System.out.println("В " + numWithTwos + " нечётное количество двоек - " + countTwos + "\n");
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
            int j = 0;
            while (j < rightTriangle ) {
                System.out.print("#");
                j++;
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
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                } else {
                    if (row >= center + column - triangleHeight - 1 && row <= center - column + triangleWidth - 1) {
                        System.out.print("*");
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
        System.out.println();

        System.out.println("8. Проверка, является ли число палиндромом");
        int numPalindrome = 121;
        int temp = numPalindrome;
        int reverseNumber = 0;
        int lastDigit;

        while (temp > 0) {
            lastDigit = temp % 10;
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
        int digit = 1;

        while (luckyNumberCopy > 0) {
            if (digitCount >= 3) {
                sum2 += digit * (luckyNumberCopy % 10);
            } else {
                sum1 += digit * (luckyNumberCopy % 10);
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
        System.out.printf("\n----|---------");
        System.out.println("---------------");
        for (int j = 2; j < 10; j++) {
            System.out.printf("%3d |", j);
            for (int k = 2; k < 10; k++) {
                System.out.printf("%3d", j * k);
            }
            System.out.println();
        }
    }
}