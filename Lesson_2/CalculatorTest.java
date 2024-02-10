import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Начало работы калькулятора");

        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();
            calculator.setA(a);

            System.out.print("Введите знак математической операции: ");
            char mathOperation = scanner.next().charAt(0);
            calculator.setMathOperation(mathOperation);

            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();
            calculator.setB(b);

            calculator.calculate();

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next();
            } while ((!answer.equals("yes")) && (!answer.equals("no")));
        }
        System.out.println("Конец работы калькулятора");
    }
}