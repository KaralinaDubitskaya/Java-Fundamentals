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

        final int UPPER_FIGURE_X1 = -4;
        final int UPPER_FIGURE_X2 = 4;
        final int UPPER_FIGURE_Y1 = 0;
        final int UPPER_FIGURE_Y2 = 5;

        final int LOWER_FIGURE_X1 = -6;
        final int LOWER_FIGURE_X2 = 6;
        final int LOWER_FIGURE_Y1 = -3;
        final int LOWER_FIGURE_Y2 = 0;

        Rectangle upperRectangle = new Rectangle(UPPER_FIGURE_X1, UPPER_FIGURE_X2, UPPER_FIGURE_Y1, UPPER_FIGURE_Y2);
        Rectangle lowerRectangle = new Rectangle(LOWER_FIGURE_X1, LOWER_FIGURE_X2, LOWER_FIGURE_Y1, LOWER_FIGURE_Y2);
        Figure figure = new Figure(upperRectangle, lowerRectangle);
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
