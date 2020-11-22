package algorithmization.decompozition;

import util.Array;

public class Task_4 {
    public static void main(String[] args) {

        int[] massX = {145, 7, 72, 24, 50, 0};
        int[] massY = {30, 8, 54, 32, 50, -2};

        System.out.println("Массив координат Х: ");
        Array.printArray(massX);
        System.out.println("Массив координат Y: ");
        Array.printArray(massY);
        double maxDistance = maxDistanceBetweenPoints(massX, massY);
        System.out.print("Максимальное расстояние между двумя точка равно ");
        System.out.printf("%.3f", maxDistance);
    }

    public static double maxDistanceBetweenPoints ( int[] arrayX, int[] arrayY){

        double[] distance = new double[arrayX.length];
        double[] temp = new double[arrayX.length];

        for (int j = 0; j < arrayX.length; j++) {

            for (int i = 0; i < arrayX.length - 1; i++) {
                double dist;

                dist = Math.sqrt(Math.pow(arrayX[i + 1] - arrayX[j], 2) + Math.pow(arrayY[i + 1] - arrayY[j], 2));
                temp[i] = dist;
            }

            distance[j] = findMax(temp);
        }

        return findMax(distance);
    }

    public static double findMax(double[] temp) {
        double max = temp[0];

        for (int i = 1; i < temp.length; i++) {
            if (temp[i] > max) {
                max = temp[i];
            }
        }

        return max;
    }

}
