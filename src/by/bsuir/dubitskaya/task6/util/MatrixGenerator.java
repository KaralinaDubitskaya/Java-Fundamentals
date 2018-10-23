package by.bsuir.dubitskaya.task6.util;

public class MatrixGenerator {
    public static double[][] getSquareMatrix(double[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array should'n be null");
        }

        double[][] matrix = new double[array.length][array.length];
        int index;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                index = (j + i) % array.length;
                matrix[i][j] = array[index];
            }
        }
        return matrix;
    }
}
