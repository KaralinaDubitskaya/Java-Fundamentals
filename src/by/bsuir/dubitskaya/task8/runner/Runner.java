package by.bsuir.dubitskaya.task8.runner;

import by.bsuir.dubitskaya.scanner.InputScanner;
import by.bsuir.dubitskaya.task8.util.SequenceMerger;

import java.util.ArrayList;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        int firstArrayLength = 0;
        while (!(firstArrayLength > 0)) {
            System.out.print("Enter length of the first array: ");
            firstArrayLength = InputScanner.scanInt();
        }

        System.out.print("Enter elements of the first array: ");
        double[] array1 = InputScanner.scanDoubleArray(firstArrayLength);

        int secondArrayLength = 0;
        while (!(secondArrayLength > 0)) {
            System.out.print("Enter length of the second array: ");
            secondArrayLength = InputScanner.scanInt();
        }

        System.out.print("Enter elements of the second array: ");
        double[] array2 = InputScanner.scanDoubleArray(secondArrayLength);

        Map<Double, ArrayList<Integer>> result = SequenceMerger.combineSequences(array1, array2);

        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<Double, ArrayList<Integer>> entry : result.entrySet()) {
            stringBuilder.append(entry.getKey()).append(" ").append(entry.getValue()).append("\n");
        }

        System.out.println("Merged array: ");
        System.out.print(stringBuilder.toString());
    }
}
