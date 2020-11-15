package algorithmization.array_of_arrays;

import util.Array;

public class Task_15 {
    public static void main(String[] args) {

        int numberOfLine = 6;
        int numberOfColumn = 7;

        int[][] array = Array.generateArrayOfArray(numberOfLine, numberOfColumn);
        Array.printArrayOfArray(array);
        System.out.println();
        int maxElement = findMaxElement(array);
        System.out.println(maxElement);
        System.out.println();
        int[][] array2 = changeElements(array, maxElement);
        Array.printArrayOfArray(array2);

    }

    public static int findMaxElement(int[][] array) {
        int maxElement = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                }
            }
        }

        return maxElement;
    }

    public static int[][] changeElements(int[][] array, int maxElement) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    array[i][j] = maxElement;
                }
            }
        }

        return array;
    }
}
