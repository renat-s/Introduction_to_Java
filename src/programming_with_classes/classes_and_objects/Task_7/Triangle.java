package programming_with_classes.classes_and_objects.Task_7;

public class Triangle {
    private Side firstSide;
    private Side secondSide;
    private Side thirdSide;

    public Triangle(Side fSide, Side sSide, Side tSide) {
        firstSide = fSide;
        secondSide = sSide;
        thirdSide = tSide;
    }

    public static Triangle createTriangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
        Side firstSide = new Side(firstPoint, secondPoint);
        Side secondSide = new Side(secondPoint, thirdPoint);
        Side thirdSide = new Side(firstPoint, thirdPoint);

        return new Triangle(firstSide, secondSide, thirdSide);
    }

    public double perimeter() {
        return firstSide.calculateSide() + secondSide.calculateSide() + thirdSide.calculateSide();
    }

    public double square() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - firstSide.calculateSide()) + (p - secondSide.calculateSide()) - (p - thirdSide.calculateSide()));
    }

    public Point medianPoint() {
        double x = (firstSide.getFirstPoint().getX() + firstSide.getSecondPoint().getX() + secondSide.getSecondPoint().getX()) / 3;
        double y = (firstSide.getFirstPoint().getY() + firstSide.getSecondPoint().getY() + secondSide.getSecondPoint().getY()) / 3;
        return new Point(x, y);
    }
}
