package by.bsuir.dubitskaya.scanner;

import java.util.Scanner;

public class InputScanner {

    private Scanner in;

    public InputScanner() {
        in = new Scanner(System.in);
    }

    public double scanDouble() {
        while (!in.hasNextDouble()) {
            in.next();
        }

        return in.nextDouble();
    }

    public void close() {
        in.close();
    }
}
