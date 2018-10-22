package by.bsuir.dubitskaya.task5.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingSubsequenceTest {

    @Test
    void getLength() {
        assertThrows(IllegalArgumentException.class, () -> LongestIncreasingSubsequence.getLength(null));
        assertEquals(0, LongestIncreasingSubsequence.getLength(new int[0]));
        assertEquals(1, LongestIncreasingSubsequence.getLength(new int[] {2}));
        assertEquals(3, LongestIncreasingSubsequence.getLength(new int[] {1, 2, 3}));
        assertEquals(3, LongestIncreasingSubsequence.getLength(new int[] {4, 1, 2, 3}));
        assertEquals(3, LongestIncreasingSubsequence.getLength(new int[] {1, 2, 3, 0}));
        assertEquals(2, LongestIncreasingSubsequence.getLength(new int[] {4, 2, 3, 1}));
        assertEquals(3, LongestIncreasingSubsequence.getLength(new int[] {3, 2, 4, 5}));
    }
}