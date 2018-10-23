package by.bsuir.dubitskaya.task2.util;

import java.util.Objects;

public class Figure {

    private Rectangle upperRectangle;
    private Rectangle bottomRectangle;

    public Figure(Rectangle upperRectangle, Rectangle bottomRectangle) {
        if ((upperRectangle == null) || (bottomRectangle == null)) {
            throw new IllegalArgumentException("Arguments shouldn't be null");
        }

        this.upperRectangle = upperRectangle;
        this.bottomRectangle = bottomRectangle;
    }

    public void setUpperRectangle(Rectangle upperRectangle) {
        this.upperRectangle = upperRectangle;
    }

    public Rectangle getUpperRectangle() {
        return this.upperRectangle;
    }

    public void setBottomRectangle(Rectangle bottomRectangle) {
        this.bottomRectangle = bottomRectangle;
    }

    public Rectangle getBottomRectangle() {
        return bottomRectangle;
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

        Figure figure = (Figure) obj;
        return (this.bottomRectangle == figure.bottomRectangle) && (this.upperRectangle == figure.upperRectangle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(upperRectangle, bottomRectangle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName()).append("@ upper rectangle: (")
                                       .append(upperRectangle.toString())
                                       .append(", bottom rectangle: ")
                                       .append(bottomRectangle.toString());
        return sb.toString();
    }

    public boolean isPointInFigure(Point point) {
        return bottomRectangle.isPointInRectangle(point) || upperRectangle.isPointInRectangle(point);
    }
}
