package algorithmization.array_of_arrays;

import util.Array;

public class Task_12 {
    public static void main(String[] args) {

        int numberOfLine = 5;
        int numberOfColumn = 9;

        int[][] array = Array.generateArrayOfArray(numberOfLine, numberOfColumn);
        Array.printArrayOfArray(array);
        System.out.println();
        int[][] array2 = sortArrayInAscendingOrder(array);
        Array.printArrayOfArray(array2);
        System.out.println();
        int[][]array3=sortArrayInDescendingOrder(array);
        Array.printArrayOfArray(array3);

    }

    public static int[][] sortArrayInAscendingOrder(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isSorted = false;
            int temp;

            while (!isSorted) {
                isSorted = true;

                for (int j = 0; j < array[i].length - 1; j++) {
                    if (array[i][j] > array[i][j + 1]) {
                        isSorted = false;
                        temp = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = temp;
                    }
                }
            }
        }

        return array;
    }

    public static int[][] sortArrayInDescendingOrder(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isSorted = false;
            int temp;

            while (!isSorted) {
                isSorted = true;

                for (int j = 0; j < array[i].length - 1; j++) {
                    if (array[i][j] < array[i][j + 1]) {
                        isSorted = false;
                        temp = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = temp;
                    }
                }
            }
        }

        return array;
    }
}
