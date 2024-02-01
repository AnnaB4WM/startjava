public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("Угадай число от 0 до 100");
        int computerNumber = 77;
        int userNumber;

        do {
            for (userNumber = 1; userNumber <= 100; userNumber++)
                if(userNumber == computerNumber) {
                    System.out.println("Вы победили! Загаданное число - " + computerNumber);
                    break;
                } else if (userNumber < computerNumber) {
                   System.out.println("Число " + userNumber + " меньше того что загадал компьютер");
                } else if (userNumber > computerNumber) {
                    System.out.println("Число " + userNumber + " больше того что загадал компьютер");
                }
        } while (userNumber != computerNumber);
    }
}