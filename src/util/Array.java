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
            array[i] = r.nextInt(50);
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

    public static int[] sortArray(int[] array) {
        boolean isSorted = false;
        int temp;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

        return array;
    }

    public static int[] removeDuplicatesInArray(int[] array) {
        boolean[] mask = new boolean[array.length];
        int removeCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (!mask[i]) {
                int tmp = array[i];

                for (int j = i + 1; j < array.length; j++) {
                    if (tmp == array[j]) {
                        mask[j] = true;
                        removeCount++;
                    }
                }
            }
        }

        int[] result = new int[array.length - removeCount];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (!mask[i]) {
                result[j++] = array[i];
            }
        }

        return result;
    }

}
