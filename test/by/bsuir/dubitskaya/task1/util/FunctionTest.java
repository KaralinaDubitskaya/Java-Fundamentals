package by.bsuir.dubitskaya.task1.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionTest {

    @Test
    void solve() {
        assertEquals(0.5, Function.solve(0, 0));
        assertEquals(-0.5, Function.solve(-1, 1));
        assertEquals(1.0 / (4 - 4.0 / 17) + 2, Function.solve(2, -2));
    }
}