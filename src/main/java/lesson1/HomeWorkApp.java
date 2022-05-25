package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println(2);
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 1;
        int b = 2;


        if (a + b >= 0) {
            System.out.println("Summa polojitelna");
        } else {
            System.out.println("Summa otricatelna");
        }
    }

    public static void printColor() {
        int  value = 55;

        if (value <= 0) {
            System.out.println("red");
        } else if(value > 100){
            System.out.println("green");
        } else {
            System.out.println("yellow");
        }
    }

    public static void compareNumbers() {
        int a = 1;
        int b = 2;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
