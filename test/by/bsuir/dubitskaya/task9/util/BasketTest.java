package by.bsuir.dubitskaya.task9.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {
    private Basket basket = new Basket();

    @BeforeEach
    void setUp() {
        basket.putBall(new Ball(10.0, Color.BLUE));
        basket.putBall(new Ball(11.0, Color.RED));
        basket.putBall(new Ball(12.2, Color.BLUE));
        basket.putBall(new Ball(7.5, Color.BLUE));
        basket.putBall(new Ball(9.3, Color.PURPLE));
    }

    @Test
    void getWeight() {
        assertEquals(50.0, basket.getWeight());
    }

    @Test
    void countBallsWithColor() {
        assertEquals(3, basket.countBallsWithColor(Color.BLUE));
    }
}