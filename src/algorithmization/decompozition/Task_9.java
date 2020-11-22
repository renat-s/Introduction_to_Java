package algorithmization.decompozition;

public class Task_9 {
    public static void main(String[] args) {
        int x = 5;
        int y = 4;
        int z = 3;
        int t = 6;

        double s = square(x, y, z, t);
        System.out.print("Площадь данного четырехугольника равна " + s);
    }

    public static int squareRectTriangle(int x, int y) {
        return (x * y) / 2;
    }

    public static double diagonal(int x, int y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static double squareTriangle(int z, int t, double diagonal) {
        double halfP = (t + z + diagonal) / 2;
        return Math.sqrt(halfP * (halfP - z) * (halfP - t) * (halfP - diagonal));
    }

    public static double square(int x, int y, int z, int t) {
        return squareRectTriangle(x, y) + squareTriangle(z, t, diagonal(x, y));
    }

}
