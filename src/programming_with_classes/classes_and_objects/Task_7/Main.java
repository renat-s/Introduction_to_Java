package programming_with_classes.classes_and_objects.Task_7;

public class Main {
    public static void main(String[] args) {
        Point a = new Point(1, 2);
        Point b = new Point(5, 7);
        Point c = new Point(-2, -7);

        Triangle triangle = Triangle.createTriangle(a, b, c);

        double perimeter = triangle.perimeter();
        System.out.println("Периметр: " + perimeter);
        double square = triangle.square();
        System.out.println("Площадь: " + square);

        Point median = triangle.medianPoint();

        System.out.println("Точка пересечения медиан:\nx: " + median.getX() + " y: " + median.getY());

    }


}
