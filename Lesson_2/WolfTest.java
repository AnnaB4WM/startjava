public class WolfTest {

    public static void main(String[] args) {
        Wolf polkan = new Wolf();
        polkan.gender = "мужской";
        polkan.nickname = "Полкан";
        polkan.weight = 35.2;
        polkan.age = 3;
        polkan.color = "белый";
        System.out.println("Волк по кличке " + polkan.nickname + ", пол "+
                polkan.gender + ", его вес " + polkan.weight + ", ему " +
                polkan.age + " года" + ", его окрас " + polkan.color);

        polkan.move();
        polkan.sit();
        polkan.run();
        polkan.howl();
        polkan.hunt();
    }
}