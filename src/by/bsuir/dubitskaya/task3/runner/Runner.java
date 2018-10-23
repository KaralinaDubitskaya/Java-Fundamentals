package by.bsuir.dubitskaya.task3.runner;

import by.bsuir.dubitskaya.scanner.InputScanner;
import by.bsuir.dubitskaya.task3.table.TableBuilder;
import by.bsuir.dubitskaya.task3.util.TanFunction;

import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        System.out.print("Enter a: ");
        double a = InputScanner.scanDouble();
        System.out.print("Enter b: ");
        double b = InputScanner.scanDouble();
        System.out.print("Enter h: ");
        double h = InputScanner.scanDouble();

        try {
            Map<Double, Double> values = TanFunction.getValues(a, b, h);
            System.out.println(TableBuilder.getTable(values));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
