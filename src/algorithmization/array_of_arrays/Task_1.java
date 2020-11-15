package algorithmization.array_of_arrays;

import util.Array;

public class Task_1 {
    public static void main(String[] args) {

        int numberOfLines = 4;
        int numberOfColumns = 7;

        int[][] array = Array.generateArrayOfArray(numberOfLines, numberOfColumns);
        Array.printArrayOfArray(array);
        System.out.println();
        printNewArray(array, numberOfLines);

    }


    public static void printNewArray(int[][] array, int numberOfLines) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((j + 1) % 2 != 0 && array[0][j] > array[numberOfLines - 1][j]) {
                    System.out.printf("%-5d ", array[i][j]);
                }
            }
            System.out.println();
        }
    }
}
