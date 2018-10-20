package by.bsuir.dubitskaya.task2.util;

public class Figure {

    private static final int UPPER_PART_X1 = -4;
    private static final int UPPER_PART_X2 = 4;
    private static final int UPPER_PART_Y1 = 0;
    private static final int UPPER_PART_Y2 = 5;

    private static final int LOWER_PART_X1 = -6;
    private static final int LOWER_PART_X2 = 6;
    private static final int LOWER_PART_Y1 = -3;
    private static final int LOWER_PART_Y2 = 0;
    
    public boolean isPointInFigure(Point point) {
        double x = point.getX();
        double y = point.getY();

        boolean isInUpperPart = (x >= UPPER_PART_X1) && (x <= UPPER_PART_X2) &&
                                (y >= UPPER_PART_Y1) && (y <= UPPER_PART_Y2);
        boolean isInLowerPart = (x >= LOWER_PART_X1) && (x <= LOWER_PART_X2) &&
                                (y >= LOWER_PART_Y1) && (y <= LOWER_PART_Y2);

        return (isInLowerPart || isInUpperPart);
    }

}
