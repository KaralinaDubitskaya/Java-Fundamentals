package by.bsuir.dubitskaya.task5.runner;

import by.bsuir.dubitskaya.scanner.InputScanner;
import by.bsuir.dubitskaya.task5.util.LongestIncreasingSubsequence;

public class Runner {
    public static void main(String[] args) {
        int n = 0;
        while (!(n > 0)) {
            System.out.print("Enter length of the array: ");
            n = InputScanner.scanInt();
        }

        System.out.print("Enter elements of the array: ");
        int[] array = InputScanner.scanIntArray(n);

        try {
            int result = LongestIncreasingSubsequence.getLenght(array);
            System.out.print("Max length of the increasing subsequence: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
