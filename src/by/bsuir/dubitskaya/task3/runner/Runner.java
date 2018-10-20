package by.bsuir.dubitskaya.task3.runner;

import by.bsuir.dubitskaya.scanner.InputScanner;
import by.bsuir.dubitskaya.task3.table.TableBuilder;
import by.bsuir.dubitskaya.task3.util.TanFunction;

import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        InputScanner in = new InputScanner();
        System.out.print("Enter a: ");
        double a = in.scanDouble();
        System.out.print("Enter b: ");
        double b = in.scanDouble();
        System.out.print("Enter h: ");
        double h = in.scanDouble();
        in.close();

        try {
            Map<Double, Double> values = TanFunction.getValues(a, b, h);
            System.out.println(TableBuilder.getTable(values));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
