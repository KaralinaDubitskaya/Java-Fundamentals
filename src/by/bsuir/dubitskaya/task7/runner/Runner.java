package by.bsuir.dubitskaya.task7.runner;

import by.bsuir.dubitskaya.scanner.InputScanner;
import by.bsuir.dubitskaya.task7.util.ShellSort;

public class Runner {
    public static void main(String[] args) {
        int n = 0;
        while (!(n > 0)) {
            System.out.print("Enter length of the array: ");
            n = InputScanner.scanInt();
        }

        System.out.print("Enter elements of the array: ");
        double[] array = InputScanner.scanDoubleArray(n);
        array = ShellSort.sort(array);

        StringBuilder stringBuilder = new StringBuilder();
        for (double element : array) {
            stringBuilder.append(element).append(" ");
        }

        System.out.print("Sorted array: ");
        System.out.print(stringBuilder.toString());
    }
}
