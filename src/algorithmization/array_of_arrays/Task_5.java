package algorithmization.array_of_arrays;

import util.Array;

public class Task_5 {
    public static void main(String[] args) {

        int n = 8;
        int [][] array = createArray(n);
        Array.printArrayOfArray(array);
    }

    public static int[][] createArray(int n) {
        int[][] array = new int[n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = i + 1;
                if(j >= (n - i)) {
                    array[i][j] = 0;
                }
            }
        }

        return array;
    }

}
