package by.bsuir.dubitskaya.scanner;

import java.util.Scanner;

public class InputScanner {
    private static Scanner in = new Scanner(System.in);

    public static double scanDouble() {
        while (!in.hasNextDouble()) {
            in.next();
        }
        return in.nextDouble();
    }

    public static int scanInt() {
        while (!in.hasNextInt()) {
            in.next();
        }
        return in.nextInt();
    }

    public static int[] scanIntArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            while (!in.hasNextInt()) {
                in.next();
            }
            array[i] = in.nextInt();
        }
        return array;
    }
}
