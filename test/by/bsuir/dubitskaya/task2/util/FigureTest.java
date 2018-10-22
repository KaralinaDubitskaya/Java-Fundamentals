package by.bsuir.dubitskaya.task2.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FigureTest {

    @Test
    void isPointInFigure() {
        Rectangle upperRectangle = new Rectangle(-4, 4, 0, 5);
        Rectangle bottomRectangle = new Rectangle(-6, 6, -3, 0);
        Figure figure = new Figure(upperRectangle, bottomRectangle);

        assertTrue(figure.isPointInFigure(new Point(0, 2)));
        assertTrue(figure.isPointInFigure(new Point(2, -2)));
        assertTrue(figure.isPointInFigure(new Point(-3, 0)));
        assertFalse(figure.isPointInFigure(new Point(-7, 2)));
        assertFalse(figure.isPointInFigure(new Point(-3, 7)));
        assertFalse(figure.isPointInFigure(new Point(7, 7)));
        assertThrows(IllegalArgumentException.class, () -> figure.isPointInFigure(null));
    }
}