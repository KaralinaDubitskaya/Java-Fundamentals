package by.bsuir.dubitskaya.task4.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimalityCheckerTest {

    @Test
    void isPrime() {
        assertFalse(PrimalityChecker.isPrime(1));
        assertTrue(PrimalityChecker.isPrime(2));
        assertTrue(PrimalityChecker.isPrime(5));
        assertFalse(PrimalityChecker.isPrime(10));
        assertFalse(PrimalityChecker.isPrime(1000000000));
        assertTrue(PrimalityChecker.isPrime(1000001137));
        assertThrows(IllegalArgumentException.class, () -> PrimalityChecker.isPrime(-1));
        assertThrows(IllegalArgumentException.class, () -> PrimalityChecker.isPrime(0));
    }
}