public class WolfTest {

    public static void main(String[] args) {
        Wolf polkan = new Wolf();
        polkan.setGender("мужской");
        polkan.setNickname("Полкан");
        polkan.setWeight(35.2);
        polkan.setAge(9);
        polkan.setColor("белый");
        System.out.println(polkan.getNickname() + ", " + polkan.getGender() + ", " + polkan.getWeight() +
                 ", " + polkan.getAge() + ", " + polkan.getColor());

        polkan.move();
        polkan.sit();
        polkan.run();
        polkan.howl();
        polkan.hunt();
    }
}