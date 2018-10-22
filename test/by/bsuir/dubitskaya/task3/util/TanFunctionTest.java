package by.bsuir.dubitskaya.task3.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TanFunctionTest {

    @Test
    void getValues() {
        assertThrows(IllegalArgumentException.class, () -> TanFunction.getValues(Double.NaN, 0, 1));
        assertThrows(IllegalArgumentException.class, () -> TanFunction.getValues(3, Double.NaN, 1));
        assertThrows(IllegalArgumentException.class, () -> TanFunction.getValues(1, 4, Double.NaN));
        assertThrows(IllegalArgumentException.class, () -> TanFunction.getValues(1, 4, 0));
        assertThrows(IllegalArgumentException.class, () -> TanFunction.getValues(1, 4, -4));
        assertThrows(IllegalArgumentException.class, () -> TanFunction.getValues(1, -4, 1));
        assertEquals((Double) 0.0, TanFunction.getValues(0, 1, 1).get(0.0));
        assertEquals((Double) Math.tan(1), TanFunction.getValues(0, 1, 1).get(1.0));
    }
}