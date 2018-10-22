package by.bsuir.dubitskaya.task8.util;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class SequenceMergerTest {

    @Test
    void combineSequencesTest1() {
        assertEquals(new TreeMap<Double, ArrayList<Integer>>(),
                SequenceMerger.combineSequences(new double[0], new double[0]));
    }

    @Test
    void combineSequencesTest2() {
        double[] a = {1, 3, 6, 7};
        double[] b = {1, 2, 5, 6, 7, 8};

        ArrayList<Integer> indexes = new ArrayList<>();
        Map<Double, ArrayList<Integer>> result = new TreeMap<>();

        indexes.add(1);
        indexes.add(2);
        result.put(1.0, indexes);

        indexes = new ArrayList<>();
        indexes.add(2);
        result.put(2.0, indexes);

        indexes = new ArrayList<>();
        indexes.add(1);
        result.put(3.0, indexes);

        indexes = new ArrayList<>();
        indexes.add(2);
        result.put(5.0, indexes);

        indexes = new ArrayList<>();
        indexes.add(1);
        indexes.add(2);
        result.put(6.0, indexes);

        indexes = new ArrayList<>();
        indexes.add(1);
        indexes.add(2);
        result.put(7.0, indexes);

        indexes = new ArrayList<>();
        indexes.add(2);
        result.put(8.0, indexes);

        assertEquals(result, SequenceMerger.combineSequences(a, b));
    }

    @Test
    void combineSequencesTest3() {
        assertThrows(IllegalArgumentException.class, () -> SequenceMerger.combineSequences(null, new double[0]));
        assertThrows(IllegalArgumentException.class, () -> SequenceMerger.combineSequences(new double[0], null));
        assertThrows(IllegalArgumentException.class,
                () -> SequenceMerger.combineSequences(new double[] {1, 2, 0}, new double[] {1, 2, 4}));
        assertThrows(IllegalArgumentException.class,
                () -> SequenceMerger.combineSequences(new double[] {1, 2, 4}, new double[] {6, 2, 4}));
    }
}