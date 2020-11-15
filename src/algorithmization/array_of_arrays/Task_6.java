package algorithmization.array_of_arrays;

import util.Array;

public class Task_6 {
    public static void main(String[] args) {

        int n = 10;

        int[][] array = createArray(n);
        Array.printArrayOfArray(array);
    }

    public static int[][] createArray(int size) {
        int[][] array = new int[size][size];

        for (int i = 0; i < array.length / 2; i++) {
            for (int j = i; j < array[i].length; j++) {
                if (j < array[i].length - i) {
                    array[i][j] = 1;
                }
            }
        }

        for (int i = size - 1; i >= array[i].length / 2; i--) {
            for (int j = size - i - 1; j <= i; j++) {
                array[i][j] = 1;
            }
        }

        return array;
    }

}
