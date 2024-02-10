import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Random random = new Random();
        int guessNumber = random.nextInt(1);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Ход первого игрока, введите число: ");
            int num = scanner.nextInt();
            System.out.println("Игрок " + player1.getName() + " ввел число: " + num);
            if (num == guessNumber) {
                System.out.println("Победил игрок " + player1.getName() + "!!!");
                break;
            }
            if (num > guessNumber) {
                System.out.println("Число " + num + " > того, что загадал компьютер!!");
            } else {
                System.out.println("Число " + num + " < того, что загадал компьютер!!");
            }

            System.out.print("Ход второго игрока, введите число: ");
            num = scanner.nextInt();
            System.out.println("Игрок " + player2.getName() + " ввел число: " + num);
            if (num == guessNumber) {
                System.out.println("Победил игрок " + player2.getName() + "!!!");
                break;
            }
            if (num > guessNumber) {
                System.out.println("Число " + num + " > того, что загадал компьютер!!");
            } else {
                System.out.println("Число " + num + " < того, что ввел компьютер!!");
            }
        }
    }
}