package by.bsuir.dubitskaya.task9.util;

import java.util.ArrayList;
import java.util.Arrays;

public class Basket {
    private ArrayList<Ball> balls;

    public void putBall(Ball ball) {
        if (ball == null) {
            throw new IllegalArgumentException("Ball shouldn't be null");
        }

        balls.add(ball);
    }

    public void putBalls(Ball... balls) {
        if (balls == null) {
            throw new IllegalArgumentException("Ball shouldn't be null");
        }

        this.balls.addAll(Arrays.asList(balls));
    }

    public Ball popBall() {
        return balls.remove(balls.size() - 1);
    }

    public ArrayList<Ball> getBalls() {
        return new ArrayList<>(balls);
    }

    public boolean isEmpty() {
        return balls.isEmpty();
    }

    public double getWeight() {
        double weight = 0;
        for (Ball ball : this.balls) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public int countBallsWithColor(Color color) {
        int count = 0;
        for (Ball ball : this.balls) {
            if (ball.getColor() == color) {
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Basket basket = (Basket) obj;
        return  (this.balls.equals(basket.balls));
    }

    @Override
    public int hashCode() {
        return balls.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName()).append("@balls: \n");
        for (Ball ball : balls) {
            sb.append("    ").append(ball.toString()).append('\n');
        }
        return sb.toString();
    }

    public Basket () {
        this.balls = new ArrayList<>();
    }

    public Basket (Ball... balls) {
        this.balls = new ArrayList<>();
        this.balls.addAll(Arrays.asList(balls));
    }
}
