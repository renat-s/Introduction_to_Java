package algorithmization.array_of_arrays;

import util.Array;

public class Task_4 {
    public static void main(String[] args) {
        int n = 12;

        int[][] array = generateArray(n);
        System.out.println();
        Array.printArrayOfArray(array);
    }

    public static int[][] generateArray(int n) {
        int[][] array = new int[n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + 1) % 2 != 0) {
                    array[i][j] = j + 1;
                } else {
                    array[i][j] = n - j;
                }
            }
        }

        return array;
    }

}
