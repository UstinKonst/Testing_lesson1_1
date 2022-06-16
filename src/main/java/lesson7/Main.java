package lesson7;

import less6.Animal;
import less6.Cat;
import less6.Dog;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal dog2 = new Dog();

        cat.run(100);
        cat.swim(15);
        dog.run(550);
        dog2.swim(5);


    }
}
