package by.bsuir.dubitskaya.task2.util;

import java.util.Objects;

public class Point {
    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
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

        Point point = (Point) obj;
        return  (this.x == point.x) && (this.y == point.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" + "x: " + x + ", y: " + y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
