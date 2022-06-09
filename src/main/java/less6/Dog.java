package less6;

public class Dog extends Animal {
    int dogMaxRun = 500;
    int dogMaxSwim = 10;


    @Override
    public void run(int distance) {
        super.run(distance);
        if (distance > 0 && distance < dogMaxRun) {
            System.out.println("dog run: " + distance + " m");
        } else if (distance >= dogMaxRun){
            System.out.println("too much distance");
        } else {
            System.out.println("enter the correct number");
        }
    }

    @Override
    public void swim(int distance) {
        super.swim(distance);
        if (distance > 0 && distance < dogMaxSwim) {
            System.out.println("dog swim: " + distance + " m");
        } else if (distance >= dogMaxSwim){
            System.out.println("too much distance");
        } else {
            System.out.println("enter the correct number");
        }
    }

}
