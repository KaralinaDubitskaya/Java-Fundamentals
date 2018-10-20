package by.bsuir.dubitskaya.task4.runner;

import by.bsuir.dubitskaya.scanner.InputScanner;
import by.bsuir.dubitskaya.task4.util.PrimalityChecker;

public class Runner {
    public static void main(String[] args) {
        int n = 0;
        while (!(n > 0)) {
            System.out.print("Enter length of the array: ");
            n = InputScanner.scanInt();
        }

        System.out.print("Enter elements of the array: ");
        int[] array = InputScanner.scanIntArray(n);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (PrimalityChecker.isPrime(array[i])) {
                stringBuilder.append(i + 1).append(" ");
            }
        }

        String indexes = stringBuilder.toString();
        if (indexes.length() != 0) {
            System.out.print("Indexes of the prime numbers: ");
            System.out.print(indexes);
        } else {
            System.out.print("The array hasn't prime numbers");
        }

    }
}
