public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean isMale = true;
        if(!isMale) {
            System.out.println("Пол - женский.");
        } else {
            System.out.println("Пол - мужской.");
        }

        int age = 15;
        if(age > 18) {
            System.out.println("Человеку " + age + ", он взрослый.");
        } else {
            System.out.println("Человеку " + age + ", он несовершеннолетний.");
        }

        double height = 1.99;
        if (height < 1.8) {
            System.out.println("Рост " + height + " - это средний рост.");
        } else {
            System.out.println("Рост " + height + " - это высокий рост.");
        }

        char firstLetterOfName = "Cillian".charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("Имя начинается на букву М.");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Имя начинается на букву I.");
        } else {
            System.out.println("Попробуйте ввести другую букву.\n");
        }

        System.out.println("2. Поиск большего числа");
        int a = 55458;
        int b = 56647;
        if(a > b) {
            System.out.println("Число " + a + " больше числа " + b + "\n");
        } else if(a < b) {
            System.out.println("Число " + a + " меньше числа " + b + "\n");
        } else {
            System.out.println("Число " + a + " равно числу " + b + "\n");
        }

        System.out.println("3. Проверка числа");
        int num = -7;
        System.out.print(num + " является");

        if (num == 0) {
            System.out.println(" нулем\n");
        } else {
            if (num < 0) {
                System.out.print(" отрицательным");
            } else if (num > 0) {
                System.out.print(" положительным");
            }
            if (num % 2 == 0 && num != 0) {
                System.out.println(" и четным\n");
            } else if (num % 2 == 1 || num % 2 == -1) {
                System.out.println(" и нечетным\n");
            }
        }

        System.out.println("4. Поиск одинаковых цифр в числах");
        int num1 = 123;
        int num1Hundreds = num1 / 100;
        int num1Tens = (num1 % 100) / 10;
        int num1Ones = num1 % 10;

        int num2 = 223;
        int num2Hundreds = num2 / 100;
        int num2Tens = (num2 % 100) / 10;
        int num2Ones = num2 % 10;

        System.out.println("исходные числа - " + num1 + ", " + num2);
        if ((num1Hundreds != num2Hundreds) && (num1Tens != num2Tens) && (num1Ones != num2Ones)) {
            System.out.println("равных цифр нет");
        } else {
            System.out.print("номера разрядов - ");
            if (num1Hundreds == num2Hundreds) {
                System.out.print("1, ");
            }
            if (num1Tens == num2Tens) {
                System.out.print("2, ");
            }
            if (num1Ones == num2Ones) {
                System.out.println("3");
            }
            System.out.print("одинаковые в них цифры - " + num1Hundreds +
                num2Tens + num1Ones + "\n");
        }

        System.out.println("5. Определение символа по его коду");
        char signCode = '\u0057';
        System.out.print("Символ ");
        if (signCode >= 'a' && signCode <= 'z') {
            System.out.println(signCode + " является маленькой буквой\n");
        } else if (signCode >= 'A' && signCode <= 'Z') {
            System.out.println(signCode + " является большой буквой\n");
        } else if (signCode >= 0 && signCode <= 9) {
            System.out.println(signCode + " является цифрой\n");
        } else {
            System.out.println(signCode + " не буква и не цифра\n");
        }

        System.out.println("6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 301_000;
        int percent = (deposit * 5) / 100;
        int sumPercentage;
        System.out.println("сумма вклада - " + deposit);

        if (deposit > 300_000) {
            sumPercentage = (deposit * 10) / 100;
        } else if (deposit > 100_000 && deposit <= 300_000) {
            sumPercentage = (deposit * 7) / 100;
        } else {
            sumPercentage = percent;
        }
        System.out.println("сумма начисленного % - " + sumPercentage);
        System.out.println("итоговая сумма с % - " + (sumPercentage + deposit) + "\n");

        System.out.println("7. Определение оценки по предметам");
        int historyPercent = 59;
        int averageGrade = 3;

        if (historyPercent > 91) {
            averageGrade = 5;
        } else if (historyPercent > 73 && historyPercent < 91) {
            averageGrade = 4;
        } else if (historyPercent <= 60) {
            averageGrade = 2;
        } else {
            System.out.print(averageGrade);
        }
        System.out.println("история - " + averageGrade);

        int programmingPercent = 92;
        if (programmingPercent > 91) {
            averageGrade = 5;
        } else if (programmingPercent > 73 && programmingPercent < 91) {
            averageGrade = 4;
        } else if (programmingPercent <= 60) {
            averageGrade = 2;
        } else {
            System.out.println(averageGrade);
        }
        System.out.println("программирование - " + averageGrade);
        int averagePercent = (historyPercent + programmingPercent) / 2;
        System.out.println("средний балл оценок по предметам - " + (averageGrade + averageGrade) / 2);
        System.out.println("средний % по предметам - " + averagePercent + "\n");

        System.out.println("8. Расчет годовой прибыли");
        int productSoldMonthly = 13_000;
        int rent = 5_000;
        int productionCost = 9_000;
        int yearProfit = (productSoldMonthly - (rent + productionCost)) * 12;

        if (yearProfit > 0) {
            System.out.println("Прибыль за год: +" + yearProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + yearProfit + " руб.");
        }
    }
}