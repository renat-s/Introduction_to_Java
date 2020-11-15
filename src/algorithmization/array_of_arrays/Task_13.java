package algorithmization.array_of_arrays;

import util.Array;

public class Task_13 {
    public static void main(String[] args) {

        int numberOfLine = 6;
        int numberOfColumn = 10;

        int[][] array = Array.generateArrayOfArray(numberOfLine, numberOfColumn);
        Array.printArrayOfArray(array);
        System.out.println();
        int[][] array2 = sortColumnsInAscendingOrder(array,numberOfColumn);
        Array.printArrayOfArray(array2);
        System.out.println();
        int[][] array3 = sortColumnsInDescendingOrder(array, numberOfColumn);
        Array.printArrayOfArray(array3);

    }

    public static int[][] sortColumnsInAscendingOrder(int[][] array, int numberOfColumn) {
        for (int j = 0; j <numberOfColumn ; j++) {
            boolean sorted = false;
            int temp;

            while (!sorted) {
                sorted = true;

                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i][j] > array[i + 1][j]) {
                        sorted = false;
                        temp = array[i][j];
                        array[i][j] = array[i + 1][j];
                        array[i + 1][j] = temp;
                    }
                }
            }
        }

        return array;

    }

    public static int[][] sortColumnsInDescendingOrder(int[][] array, int numberOfColumn) {
        for (int j = 0; j < numberOfColumn; j++) {
            boolean sorted = false;
            int temp;

            while (!sorted) {
                sorted = true;

                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i][j] < array[i + 1][j]) {
                        sorted = false;
                        temp = array[i][j];
                        array[i][j] = array[i + 1][j];
                        array[i + 1][j] = temp;
                    }
                }
            }
        }

        return array;

    }
}
