package util;

import java.util.Random;

public class Array {

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printArrayOfArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%-5d ", array[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] generateArray(int arraySize) {
        Random r = new Random();
        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10);
        }

        return array;
    }

    public static int[][] generateArrayOfArray(int numberOfLines, int numberOfColumns) {
        int[][] array = new int[numberOfLines][numberOfColumns];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                Random r = new Random();
                array[i][j] = r.nextInt(200);
            }
        }

        return array;
    }



}
