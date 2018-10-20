package by.bsuir.dubitskaya.task8.util;

import java.util.*;

public class SequenceMerger {

    public static Map<Double, ArrayList<Integer>> combineSequences(double[] firstArray, double[] secondArray) {
        if ((firstArray == null) || (secondArray == null)) {
            throw new IllegalArgumentException("Sequences shouldn't be null");
        }
        if (!isArraySorted(firstArray) || !isArraySorted(secondArray)) {
            throw new IllegalArgumentException("Sequences should be sorted");
        }

        final ArrayList<Integer> firstArrayIndex = new ArrayList<>();
        firstArrayIndex.add(1);
        final ArrayList<Integer> secondArrayIndex = new ArrayList<>();
        secondArrayIndex.add(2);
        final ArrayList<Integer> arraysIndexes = new ArrayList<>();
        arraysIndexes.add(1);
        arraysIndexes.add(2);

        if (firstArray.length == 0) {
            return doubleArrayToSequenceMap(firstArray, firstArrayIndex);
        }
        if (secondArray.length == 0) {
            return doubleArrayToSequenceMap(secondArray, secondArrayIndex);
        }

        TreeMap<Double, ArrayList<Integer>> result = new TreeMap<>();

        int i = 0;
        int j = 0;

        while ((i < firstArray.length) && (j < secondArray.length)) {
            if (firstArray[i] == secondArray[j]) {
                result.put(firstArray[i], arraysIndexes);
                i++;
                j++;
            } else if (firstArray[i] < secondArray[j]) {
                result.put(firstArray[i], firstArrayIndex);
                i++;
            } else {
                result.put(secondArray[j], secondArrayIndex);
                j++;
            }
        }
        while (i < firstArray.length) {
            result.put(firstArray[i], firstArrayIndex);
            i++;
        }
        while (j < secondArray.length) {
            result.put(secondArray[j], secondArrayIndex);
            j++;
        }
        return result;
    }

    private static boolean isArraySorted(double[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }

    private static Map<Double, ArrayList<Integer>> doubleArrayToSequenceMap(double[] array, ArrayList<Integer> arrayIndex) {
        if ((array == null) || (arrayIndex == null)) {
            throw new IllegalArgumentException("Arguments shouldn't be null");
        }

        TreeMap<Double, ArrayList<Integer>> result = new TreeMap<>();
        for (double value : array) {
            result.put(value, arrayIndex);
        }
        return result;
    }
}
