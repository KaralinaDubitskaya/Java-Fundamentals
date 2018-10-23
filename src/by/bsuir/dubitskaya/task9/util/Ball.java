package by.bsuir.dubitskaya.task9.util;

import java.util.Objects;

public class Ball {
    private double weight;
    private Color color;

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Invalid weight of the ball");
        }

        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
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

        Ball ball = (Ball) obj;
        return  (this.weight == ball.weight) && (this.color == ball.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, color);
    }

    @Override
    public String toString() {
        return getClass().getName() + "@weight: " + weight + ", color: " + color.toString();
    }

    public Ball(double weight, Color color) {
        if ((weight <= 0) || (color == null)) {
            throw new IllegalArgumentException("Invalid arguments. Unable to create an object");
        }

        this.weight = weight;
        this.color = color;
    }
}
