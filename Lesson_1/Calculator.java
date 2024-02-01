public class Calculator {
    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        char sign = '^';

        do {
            if (sign == '+') {
                int result = a + b;
                System.out.println(a + " " + sign + " " + b + " = " + result);
                break;
            } else if (sign == '-') {
                int result = a - b;
                System.out.println(a + " " + sign + " " + b + " = " + result);
                break;
            } else if (sign == '*') {
                int result = a * b;
                System.out.println(a + " " + sign + " " + b + " = " + result);
                break;
            } else if (sign == '/') {
                double result = a / b;
                System.out.println(a + " " + sign + " " + b + " = " + result);
                break;
            } else if (sign == '^') {
                int result = a;
                for (int i = 1; i < b; i++) {
                    result = result * a;
                }
                System.out.println(a + " " + sign + " " + b + " = " + result);
                break;
            } else if (sign == '%') {
                double result = a % b;
                System.out.println(a + " " + sign + " " + b + " = " + result);
                break;
            }
        } while (true);
    }
}