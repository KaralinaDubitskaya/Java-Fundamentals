package by.bsuir.dubitskaya.task2.util;

import java.util.Objects;

public class Rectangle {
    private Point leftUpperCorner;
    private Point rightBottomCorner;

    public Point getLeftUpperCorner() {
        return leftUpperCorner;
    }

    public void setLeftUpperCorner(Point leftUpperCorner) {
        this.leftUpperCorner = leftUpperCorner;
    }

    public Point getRightBottomCorner() {
        return rightBottomCorner;
    }

    public void setRightBottomCorner(Point rightBottomCorner) {
        this.rightBottomCorner = rightBottomCorner;
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

        Rectangle rectangle = (Rectangle) obj;
        return (this.leftUpperCorner == rectangle.leftUpperCorner) &&
               (this.rightBottomCorner == rectangle.rightBottomCorner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leftUpperCorner, rightBottomCorner);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName()).append("@ left upper corner: (").append(leftUpperCorner.getX())
                .append(", ").append(leftUpperCorner.getY())
                .append("@ right bottom corner: (").append(rightBottomCorner.getX())
                .append(", ").append(rightBottomCorner.getY());
        return sb.toString();
    }

    public Rectangle(double leftX, double rightX, double bottomY, double upperY) {
        if ((leftX > rightX) || (upperY < bottomY)) {
            throw new IllegalArgumentException("Invalid coordinates of the rectangle");
        }

        leftUpperCorner = new Point(leftX, upperY);
        rightBottomCorner = new Point(rightX, bottomY);
    }

    public boolean isPointInRectangle(Point point) {
        if (point == null) {
            throw new IllegalArgumentException("The argument couldn't be null");
        }

        double x = point.getX();
        double y = point.getY();

        return (point.getX() >= leftUpperCorner.getX())
                && (point.getY() >= rightBottomCorner.getY())
                && (point.getX() <= rightBottomCorner.getX())
                && (point.getY() <= leftUpperCorner.getY());
    }
}
