package algorithmization.array_of_arrays;


public class Task_7 {
    public static void main(String[] args) {
        int n = 6;

        double[][] array = createArray(n);
        printArrayOfArray(array);
        System.out.println();
        System.out.println("Количество положительных элементов в массиве - " + findPozitivElements(array));

    }

    public static double[][] createArray(int n) {
        double[][] array = new double[n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                double a = ((i * i - j * j) / (double) n);
                array[i][j] = Math.sin(a);
            }
        }

        return array;
    }

    public static void printArrayOfArray(double[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf(array[i][j] + "  ");
            }
            System.out.println();
        }
    }


    public static int findPozitivElements(double[][] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
