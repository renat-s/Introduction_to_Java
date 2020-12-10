package programming_with_classes.classes_and_objects.Task_7;

public class Side {
    private Point firstPoint;
    private Point secondPoint;

    public Side(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    double calculateSide() {
        return Math.sqrt(Math.pow(firstPoint.getX() - firstPoint.getY(), 2) + Math.pow(secondPoint.getX() - secondPoint.getY(), 2));
    }
}
