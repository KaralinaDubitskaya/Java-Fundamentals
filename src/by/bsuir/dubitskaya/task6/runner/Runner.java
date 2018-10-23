package by.bsuir.dubitskaya.task6.runner;

import by.bsuir.dubitskaya.scanner.InputScanner;
import by.bsuir.dubitskaya.task6.util.MatrixGenerator;

public class Runner {
    public static void main(String[] args) {
        int n = 0;
        while (!(n > 0)) {
            System.out.print("Enter length of the array: ");
            n = InputScanner.scanInt();
        }

        System.out.print("Enter elements of the array: ");
        double[] array = InputScanner.scanDoubleArray(n);

        double[][] matrix;

        try {
            matrix = MatrixGenerator.getSquareMatrix(array);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (double[] row : matrix) {
            for (double value : row) {
                stringBuilder.append(value);
                stringBuilder.append(' ');
            }
            stringBuilder.append('\n');
        }
        System.out.println("Result matrix:");
        System.out.println(stringBuilder.toString());
    }
}
