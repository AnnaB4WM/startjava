public class JaegerTest {

    public static void main(String[] args) {
        Jaeger сhernoAlpha = new Jaeger();
        сhernoAlpha.setModelName("Cherno Alpha");
        сhernoAlpha.setMark("Mark-1");
        сhernoAlpha.setOrigin("Russian");
        сhernoAlpha.setWeight(2.4f);
        сhernoAlpha.setHeight(85.3f);
        сhernoAlpha.setStrength(10);

        Jaeger saberAthena = new Jaeger("Saber Athena", "Mark-7", "Chinese", 76.9f, 1.6f, 7);

        System.out.println(сhernoAlpha);
        System.out.println(saberAthena);

        сhernoAlpha.drift();
        saberAthena.scanKaiju();
        saberAthena.useWeapon();
        сhernoAlpha.move();
    }
}