package lesson2;

public class main {
    public static void main(String[] args) {
        System.out.println(N1(4,7));
        N2(2);
        System.out.println(N3(9));
        N4("XXX", 3);
        N5(800);
    }

    public static boolean N1(int a,int b) {
        if (10 <= a + b && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void N2(int a) {
        if (a >= 0) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
    }

    public static boolean N3(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void N4(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static void N5(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println("Vosokosny");
        } else {
            System.out.println("Ne visokosny");
        }
    }
}
