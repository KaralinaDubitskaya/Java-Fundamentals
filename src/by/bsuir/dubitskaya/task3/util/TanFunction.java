package by.bsuir.dubitskaya.task3.util;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TanFunction {
    public static Map<Double, Double> getValues(double start, double end, double step) {
        if (!Double.isFinite(start) || !Double.isFinite(end) || !Double.isFinite(step)) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        if (start > end) {
            throw new IllegalArgumentException("The start coordinate couldn't be greater than the end coordinate.");
        }
        if (step <= 0) {
            throw new IllegalArgumentException("Step must be some positive number.");
        }

        Map<Double, Double> values = new TreeMap<Double, Double>();
        for (double x = start; x <= end; x += step) {
            values.put(x, Math.tan(x));
        }
        return values;
    }

}
