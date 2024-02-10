public class Calculator {
    private int a;
    private char mathOperation;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void calculate() {
        int result = 0;
        switch (mathOperation) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
            case '%' -> result = a % b;
            case '^' -> exponentiation();
            default -> System.out.println("Введенная математическая операция не поддерживается!");
        }
        System.out.println(result);
    }

    public void exponentiation() {
        int mathDegree = 1;
        for (int i = 0; i < b; i++) {
            mathDegree = mathDegree * a;
        }
    }
}