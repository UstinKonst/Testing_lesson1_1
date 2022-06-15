package less7;

public class Cat {
    private String name;
    private int appetite;

    private boolean full = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        System.out.println(name + " nachal est");
        p.decreaseFood(appetite,full);
        if (p.f == 1) {
            full = true;
        }
    }
    public void infoFull() {
        if (full == true) {
            System.out.println(name + " poel");
        } else {
            System.out.println(name + " ne poel");
        }
    }
}

