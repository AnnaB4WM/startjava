import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        Random random = new Random();
        int guessNumber = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Ход первого игрока, введите число");
            int num = scanner.nextInt();
            System.out.println("Первый игрок ввел число " + num);
            if (num == guessNumber) {
                System.out.println("Вы победили");
                break;
            } else if (num > guessNumber) {
                System.out.println("Число " + num + " > того, что загадал компьютер!!");
            } else {
                System.out.println("Число " + num + " < того, что загадал компьютер!!");
            }

            System.out.println("Ход второго игрока, введите число");
            num = scanner.nextInt();
            System.out.println("Второй игрок ввел число " + num);
            if (num == guessNumber) {
                System.out.println("Вы победили");
                break;
            } else if (num > guessNumber) {
                System.out.println("Число " + num + " > того, что загадал компьютер!!");
            } else {
                System.out.println("Число " + num + " < того, что ввел компьютер!!");
            }
        }
    }
}