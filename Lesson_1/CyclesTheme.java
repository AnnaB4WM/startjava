public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int oddNumbersCount = 0;
        int evenNumbersCount = 0;
        int lineStart = -10;
        int lineFinish = 21;
        System.out.print("В отрезке [" + lineStart + ", " + lineFinish + "]");
        do {
            if (lineStart % 2 == 0) {
                evenNumbersCount++;
            } else {
                oddNumbersCount++;
            }
            lineStart++;
        }
        while (lineStart <= lineFinish);
        System.out.println(" сумма четных чисел = " + evenNumbersCount +
                ", а нечетных " + oddNumbersCount + "\n");

        System.out.println("2. Вывод чисел в порядке убывания");


        System.out.println("3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int reversedNumber = 0;
        int sum = 0;
        while (number > 0) {
            sum += reversedNumber % 10;
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }
        System.out.println("исходное число в обратном порядке - " + reversedNumber);
        System.out.println("сумма - " + sum + "\n");

        System.out.println("4. Вывод чисел в несколько строк");
        for (int i = 1; i < 24; i++) {
            if (i % 2 != 0) {
                System.out.printf("%d%s", i, i % 5 == 0 ? "\n" : " ");
            }
        }
        System.out.println("\n");

        System.out.println("5. Проверка количества двоек числа на четность/нечетность");
        int num = 32425922;
        int evenNumber = 0;
        int oddNumber = 0;
        int count = 0;
        while (num > 0) {
            if (num % 10 == 2) {
                count++;
                if (count % 10 == 0) {
                    evenNumber++;
                } else {
                    oddNumber++;
                }
            }
            num /= 10;
        }
        System.out.println("В 3242592" + " нечётное количество двоек - " + oddNumber);
        System.out.println("В 3242592" + " чётное количество двоек - " + evenNumber + "\n");

        System.out.println("6. Отображение геометрических фигур");
        for (int k = 0; k < 5; k++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int l = 5;
        while (l > 0) {
            int j = 0;
            while (j < l) {
                System.out.print("#");
                j++;
            }
            System.out.println();
            l--;
        }


        System.out.println("7. Отображение ASCII-символов");
        System.out.printf("%-9S%-11S%-13S%n", "decimal", "character", "description");
        for (int sign = 15; sign < 123; sign++) {
            if (sign % 2 != 0 && sign < 48) {
                System.out.printf("  %-11d%-12s%-20s%n", sign, (char) sign, Character.getName(sign));
            } else if (sign % 2 == 0 && sign >= 'a' && sign <= 'z') {
                System.out.printf("  %-11d%-12s%-20s%n", sign, (char) sign, Character.getName(sign) + "\n");
            }
        }

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
        int numOrigin = 123543;
        int numCopy = numOrigin;
        int digitCount = 0;
        int sum1 = 0;
        int sum2 = 0;
        int digit = 1;

        while (numCopy > 0) {
            if (digitCount >= 3) {
                sum2 += digit * (numCopy % 10);
            } else {
                sum1 += digit * (numCopy % 10);
            }
            numCopy /= 10;
            digitCount++;
        }
        if (sum1 == sum2) {
            System.out.println("Число " + numOrigin + " является счастливым");
        } else {
            System.out.println("Число " + numOrigin + " не является счастливым");
        }
        System.out.println("Сумма цифр ABC = " + sum2 + ", а сумма DEF = " + sum1 + "\n");

        System.out.println("10. Отображение таблицы умножения Пифагора");
        System.out.printf("%22S%n", "таблица пифагора");
        System.out.print("    |");
        for (int k = 2; k < 10; k++) {
            System.out.printf("%3d", k);
        }
        System.out.printf("\n----|---------");
        System.out.println("---------------");
        for (int m = 2; m < 10; m++) {
            System.out.printf("%3d |", m);
            for (int j = 2; j < 10; j++) {
                System.out.printf("%3d", m * j);
            }
            System.out.println();
        }
    }
}