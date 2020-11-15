package algorithmization.array_of_arrays;

import util.Array;

public class Task_10 {
    public static void main(String[] args) {

        int size = 10;

        int[][] array = Array.generateArrayOfArray(size,size);
        Array.printArrayOfArray(array);
        System.out.println();
        printMainDiagonal(array);

    }


    public static void printMainDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j & array[i][j] > 0) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }
}
