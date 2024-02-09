import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Начало работы калькулятора");

        String answer = "да";
        while (answer.equals("да")) {
            System.out.print("Введите первое число: ");
            int firstNumber = scanner.nextInt();
            calculator.setFirstNumber(firstNumber);

            System.out.print("Введите знак математической операции: ");
            char mathOperation = scanner.next().charAt(0);
            calculator.setMathOperation(mathOperation);

            System.out.print("Введите второе число: ");
            int secondNumber = scanner.nextInt();
            calculator.setSecondNumber(secondNumber);

            calculator.calculate();
            do {
                System.out.print("Хотите продолжить вычисления? [да/нет]: ");
                answer = scanner.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }
        System.out.println("Конец работы калькулятора");
    }
}