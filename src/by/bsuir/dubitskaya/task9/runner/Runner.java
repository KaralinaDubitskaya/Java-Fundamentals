package by.bsuir.dubitskaya.task9.runner;

import by.bsuir.dubitskaya.task9.util.Ball;
import by.bsuir.dubitskaya.task9.util.Basket;
import by.bsuir.dubitskaya.task9.util.Color;

public class Runner {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.putBall(new Ball(12.1, Color.BLUE));
        basket.putBall(new Ball(6.4, Color.RED));
        basket.putBall(new Ball(8.7, Color.YELLOW));
        basket.putBall(new Ball(14.3, Color.BLUE));
        basket.putBall(new Ball(7.0, Color.WHITE));
        basket.putBall(new Ball(8.2, Color.BLUE));
        basket.putBall(new Ball(10.9, Color.BLUE));
        basket.putBall(new Ball(11.6, Color.PURPLE));
        basket.putBall(new Ball(10.4, Color.GREEN));

        System.out.print(basket);
        System.out.print("Number of blue balls: " + basket.countBallsWithColor(Color.BLUE));
    }
}
