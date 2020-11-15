package algorithmization.array_of_arrays;

import util.Array;

public class Task_2 {
    public static void main(String[] args) {

        int numberOfLines = 5;
        int numberOfColumns = 5;

        int[][] array = Array.generateArrayOfArray(numberOfLines,numberOfColumns);
        Array.printArrayOfArray(array);
        System.out.println();
        printDiagonalOfArray(array);

    }

    public static void printDiagonalOfArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    System.out.printf("%3d", array[i][j]);
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
