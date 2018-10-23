package by.bsuir.dubitskaya.task7.util;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ShellSortTest {

    @Test
    void sort() {
        assertThrows(IllegalArgumentException.class, () -> ShellSort.sort(null));
        double[] result = new double[0];
        assertArrayEquals(result, ShellSort.sort(new double[0]));
        result = new double[] {1};
        assertArrayEquals(result, ShellSort.sort(new double[] {1}));
        result = new double[] {1, 2, 3, 4};
        assertArrayEquals(result, ShellSort.sort(new double[] {4, 3, 2, 1}));

        final int arrayLen = 10000;
        result = new double[arrayLen];
        for (int i = 0; i < arrayLen; i++) {
            result[i] = i;
        }
        double[] array = new double[arrayLen];
        for (int i = arrayLen - 1; i >= 0; i--) {
            array[i] = i;
        }
        assertArrayEquals(result, ShellSort.sort(array));
    }
}