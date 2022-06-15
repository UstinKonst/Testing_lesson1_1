package less7;

public class Plate {

    int f = 0;
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n, boolean full) {
        if (n > food) {
            System.out.println("Malo edy");
            f = 0;
        } else {
            food -= n;
            f = 1;
        }
    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public void addEat(int e) {
        food += e;
    }
}

