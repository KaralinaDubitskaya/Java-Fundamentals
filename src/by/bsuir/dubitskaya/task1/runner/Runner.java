package by.bsuir.dubitskaya.task1.runner;

import by.bsuir.dubitskaya.scanner.InputScanner;
import by.bsuir.dubitskaya.task1.util.Function;

public class Runner {

    public static void main(String[] args) {
        InputScanner in = new InputScanner();

        System.out.print("Enter x: ");
        double x = in.scanDouble();

        System.out.print("Enter y: ");
        double y = in.scanDouble();

        in.close();

        System.out.print(Function.solve(x, y));
    }
}
