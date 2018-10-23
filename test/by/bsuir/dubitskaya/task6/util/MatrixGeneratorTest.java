package by.bsuir.dubitskaya.task6.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixGeneratorTest {

    @Test
    void getSquareMatrix() {
        assertThrows(IllegalArgumentException.class, () -> MatrixGenerator.getSquareMatrix(null));
        double[][] result = new double[0][0];
        assertArrayEquals(result, MatrixGenerator.getSquareMatrix(new double[0]));
        result = new double[][]{{1}};
        assertArrayEquals(result, MatrixGenerator.getSquareMatrix(new double[] {1}));
        result = new double[][]{{1, 2, 3, 4}, {2, 3, 4, 1}, {3, 4, 1, 2}, {4, 1, 2, 3}};
        assertArrayEquals(result, MatrixGenerator.getSquareMatrix(new double[] {1, 2, 3, 4}));
    }
}