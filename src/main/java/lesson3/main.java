package lesson3;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        N1();
        System.out.println(" ");
        N2();
        System.out.println(" ");
        N3();
        System.out.println(" ");
        N4();
        System.out.println(" ");
        System.out.println(Arrays.toString(N5(10,5)));
        System.out.println(" ");
        N6();
        System.out.println(" ");
        System.out.println((N7(new int[] {5,10,15,30})));
    }
    public static void N1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void N2() {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length ; i++) {
                arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void N3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void N4() {
        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (i == j || arr[arr.length-1-i] == arr[j] ) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] N5(int len, int initialValue) {
        int[] arr = new int[len];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void N6() {
        int[] arr = {30, 4, 65, 16, 44};
        int x = 0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > x) {
                x = arr[i];
            }
        }
        int y = x;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < y) {
                y = arr[i];
            }
        }
        System.out.println("max:"+x+" mim:"+y);
    }

    public static boolean N7(int[] arr) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < arr.length ; i++) {
            x += arr[i];
            for (int j = 0; j < arr.length - 1 - i; j++) {
                y += arr[arr.length - 1 - j];
            }
            if (x == y) {
                return true;
            }
            y = 0;
        }
        return false;
    }
}
