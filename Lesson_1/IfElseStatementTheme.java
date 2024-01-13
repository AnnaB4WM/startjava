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
            System.out.println("Поробуйте ввести другую букву.\n");
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
        int num = 0;
        System.out.print(num + " является");
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
        if (num == 0) {
            System.out.println(" нулем\n");
        }

        System.out.println("4. Поиск одинаковых цифр в числах");
        int num1 = 123;
        int num1FirstDigit = num1 / 100; // 1
        int num1SecondDigit = (num1 % 100) / 10; // 2
        int num1ThirdDigit = num1 % 10; // 3

        int num2 = 223;
        int num2FirstDigit = num2 / 100; // 2
        int num2SecondDigit = (num2 % 100) / 10; // 2
        int num2ThirdDigit = num2 % 10; // 3

        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;

        System.out.println("исходные числа - " + num1 + ", " + num2);
        if (!(num1FirstDigit == num2FirstDigit || num1SecondDigit == num2SecondDigit
            || num1ThirdDigit == num2ThirdDigit)) {
            System.out.println("равных цифр нет");
        } else {
            System.out.print("номера разрядов - ");
            if (num1FirstDigit == num2FirstDigit) {
                System.out.print(num1FirstDigit + ", ");
                firstNumber = num1FirstDigit;
            }
            if (num1SecondDigit == num2SecondDigit) {
                System.out.print(num1SecondDigit + ", ");
                secondNumber = num2SecondDigit;
            }
            if (num1ThirdDigit == num2ThirdDigit) {
                System.out.println(num1ThirdDigit);
                thirdNumber = num1ThirdDigit;
            }
            System.out.print("одинаковые в них цифры - " + firstNumber +
                secondNumber + thirdNumber + "\n");
        }

        System.out.println("5. Определение символа по его коду");
        char symbol = '\u0057';


        System.out.println("6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 301_000;
        int sumPercentage = 0;
        int sumDeposit = 0;
        System.out.println("сумма - " + deposit);
        if (deposit <= 100_000) {
            double percent5 = deposit * 0.05;
            sumPercentage = (int) percent5;
            sumDeposit = sumPercentage + deposit;
        } else if (deposit > 100_000 && deposit <= 300_000) {
            double percent7 = deposit * 0.07;
            sumPercentage = (int) percent7;
            sumDeposit = sumPercentage + deposit;
        } else if (deposit > 300_000) {
            double percent10 = deposit * 0.1;
            sumPercentage = (int) percent10;
            sumDeposit = sumPercentage + deposit;
        }
        System.out.println("итоговая сумма с % - " + sumDeposit);
        System.out.println("сумма начисленного % - " + sumPercentage + "\n");

        System.out.println("7. Определение оценки по предметам");
       int history = 59;
        int programming = 92;
        int historyGrade = 0;
        int programmingGrade = 0;
        int averagePercentageBySubject = (history + programming) / 2;
        if (history != 0) {
            if (history <= 60) {
                historyGrade = 2;
            } else if (history > 60) {
                historyGrade = 3;
            } else if (history > 73) {
                historyGrade = 4;
            } else {
                historyGrade = 5;
            }
        }
        System.out.println("история - " + historyGrade);
        if (programming !=0) {
            if (programming <= 60) {
                programmingGrade = 2;
            } else if (programming > 60) {
                programmingGrade = 3;
            } else if (programming > 73) {
                programmingGrade = 4;
            } else {
                programmingGrade = 5;
            }
        }
        System.out.println("программирование - " + programmingGrade);
        int gpa = (historyGrade + programmingGrade) / 2;
        System.out.println("средний балл оценок по предметам - " + gpa);
        System.out.println("средний % по предметам - " + averagePercentageBySubject + "\n");

        System.out.println("8. Расчет годовой прибыли");
        int productSoldMonthly = 13_000;
        int rent = 5_000;
        int productionCost = 9_000;
        int yearProfit = (productSoldMonthly - (rent + productionCost)) * 12;

        if (yearProfit > 0 && yearProfit != 0) {
            System.out.println("Прибыль за год: " + "+" + yearProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + yearProfit + " руб.");
        }
    }
}