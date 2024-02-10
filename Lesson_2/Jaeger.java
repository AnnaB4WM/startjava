public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int strength;

    public Jaeger() {
    }

    public Jaeger(String modelName, String mark, String origin,
            float height, float weight, int strength) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    public String scanKaiju() {
        return "nothing";
    }

    public void move() {
        System.out.println("Вы двигаетесь вперед");
    }

    public void useWeapon() {
        System.out.println("Выбрать цель и выстрелить");
    }

    public String toString() {
        return "Jaeger: " + "\n" + "modelName - " + modelName + "\nmark - " + mark +
                "\norigin - " + origin + "\nheight - " + height +
                "\nweight - " + weight + "\nstrength - " + strength + "\n";
    }
}