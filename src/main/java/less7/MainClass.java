package less7;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Barsik", 10);
        cats[1] = new Cat("Pushok", 120);
        cats[2] = new Cat("Chernysh", 50);
        Plate plate = new Plate(100);
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            plate.info();
        }
        for (int i = 0; i < cats.length; i++) {
            cats[i].infoFull();
        }
        plate.addEat(60);
        plate.info();
    }
}

