package by.bsuir.dubitskaya.task2.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void isPointInRectangle() {
        Rectangle rectangle = new Rectangle(0, 10, -3, 7);

        assertTrue(rectangle.isPointInRectangle(new Point(1, 0)));
        assertTrue(rectangle.isPointInRectangle(new Point(0, -3)));
        assertFalse(rectangle.isPointInRectangle(new Point(0, -4)));
        assertThrows(IllegalArgumentException.class,
                () -> rectangle.isPointInRectangle(null));
    }
}