package lesson5;

public class main {
    public static void main(String[] args) {
        worker[] workers = new worker[5];
        workers[0] = new worker("Ivan", "Engineer", "ivivan@mailbox.com", "89216573561", 30000, 42);
        workers[1] = new worker("Boris", "Menedger", "boris@mailbox.com", "89217481084", 20000, 20);
        workers[2] = new worker("Vasiliy", "Junior", "vas@mailbox.com", "89211110982", 10000, 18);
        workers[3] = new worker("Masha", "Director", "mash@mailbox.com", "89218495610", 40000, 30);
        workers[4] = new worker("Konstantin", "Boss", "kost@mailbox.com", "89219999999", 50000, 50);

        for (worker arr : workers ) {
            if (arr.age > 40 ) {
                arr.info();
            }
        }
    }
}
