package algorithmization.array_of_arrays;

import util.Array;

public class Task_9 {
    public static void main(String[] args) {

        int size = 5;

        int[][] array = Array.generateArrayOfArray(size, size);
        Array.printArrayOfArray(array);
        System.out.println();
        int[] array2 = summ(array);
        Array.printArray(array2);
        System.out.println();
        int index = findIndexColumnWithMaxValue(array2) + 1;
        System.out.println(index + " столбец имеет максимальную сумму элементов.");

    }

    public static int[] summ(int[][] array) {
        int[] array2 = new int[array.length];
        int summ = 0;

        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                summ = summ + array[i][j];
            }
            array2[j] = summ;
            summ = 0;
        }

        return array2;
    }

    public static int findIndexColumnWithMaxValue(int[] array) {
        int index = 0;
        int temp = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > temp) {
                temp = array[i];
                index = i;
            }
        }

        return index;
    }
}
