public class MyFirstGame {

    public static void main(String[] args) {
        int computerNumber = 50;
        int myNumber = 10;

        System.out.println("Угадай число");
        while(myNumber != computerNumber) {
            if (myNumber > computerNumber) {
                System.out.println("Вы ввели число = " + myNumber + " > чем то, что ввел компьютер!!");
                myNumber--;
            } if (myNumber < computerNumber) {
                System.out.println("Вы ввели число = " + myNumber + " < чем то, что ввел компьютер!!");
                myNumber++;
            }
        }
        System.out.println("Вы угадали!!! Загаданное число " + computerNumber);
        System.out.println("Вы победили!!!");
    }
}
