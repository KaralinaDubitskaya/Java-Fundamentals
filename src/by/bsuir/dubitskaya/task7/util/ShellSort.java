package by.bsuir.dubitskaya.task7.util;

public class ShellSort {
    public static double[] sort(double[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array should'n be null");
        }

        int i = 0;
        double temp;

        while (i < array.length - 1) {
            if (array[i] <= array[i + 1]) {
                i++;
            } else {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if (i > 0) {
                    i--;
                }
            }
        }

        return array;
    }
}
