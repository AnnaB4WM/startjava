public class Calculator {

    private int a;
    private char mathOperation;
    private int b;
    private int result = 0;

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
        switch (mathOperation) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
            case '%' -> result = a % b;
            case '^' -> pow();
            default -> System.out.println("Введенная математическая операция не поддерживается!");
        }
        System.out.println(result);
    }

    private void pow() {
        result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
    }
}