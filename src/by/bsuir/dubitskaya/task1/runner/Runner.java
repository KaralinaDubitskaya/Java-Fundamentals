package by.bsuir.dubitskaya.task1.runner;

import by.bsuir.dubitskaya.scanner.InputScanner;
import by.bsuir.dubitskaya.task1.util.Function;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter x: ");
        double x = InputScanner.scanDouble();
        System.out.print("Enter y: ");
        double y = InputScanner.scanDouble();
        System.out.print(Function.solve(x, y));
    }
}
