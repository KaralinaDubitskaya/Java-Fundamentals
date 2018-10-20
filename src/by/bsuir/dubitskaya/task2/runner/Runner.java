package by.bsuir.dubitskaya.task2.runner;

import by.bsuir.dubitskaya.task2.util.*;
import by.bsuir.dubitskaya.scanner.InputScanner;

import java.lang.reflect.Field;

public class Runner {

    public static void main(String[] args) {
        InputScanner in = new InputScanner();
        System.out.print("Enter x: ");
        double x = in.scanDouble();
        System.out.print("Enter y: ");
        double y = in.scanDouble();
        in.close();

        Figure figure = new Figure();
        Point point = new Point(x, y);

        String result;
        if (figure.isPointInFigure(point)) {
            result = "The point is in the figure";
        }
        else {
            result = "The point is out of the figure";
        }
        System.out.println(result);
    }

}
