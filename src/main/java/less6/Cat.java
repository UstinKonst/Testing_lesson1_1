package less6;

public class Cat extends Animal {
    int catMaxRun = 200;

    @Override
    public void run(int distance) {
        super.run(distance);
        if (distance > 0 && distance < catMaxRun) {
            System.out.println("cat run: " + distance + " m");
        } else if (distance >= catMaxRun){
            System.out.println("too much distance");
        } else {
            System.out.println("enter the correct number");
        }
    }

    @Override
    public void swim(int distance) {
        super.swim(distance);
        System.out.println("cat can't swim");
    }
}
