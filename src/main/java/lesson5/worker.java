package lesson5;

public class worker {
     String name;
     String position;
     String email;
     String number;
     int salary;
     int age;

    public worker(String name, String position, String email, String number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("name: " + name + "; position: " + position + " email: " + email +
                " number: " + number + " salary: " + salary + " age: " + age);

    }
}
