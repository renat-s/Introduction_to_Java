package algorithmization.sorted_array;

import util.Array;

public class Task_3 {
    public static void main(String[] args) {
        int sizeArray = 8;

        int[] array = Array.generateArray(sizeArray);
        Array.sortArray(array);
        Array.printArray(array);
        System.out.println();
        int[] array2 = sort(array);
        Array.printArray(array2);
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int maxIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    maxIndex = j;
                }
            }

            if (i != maxIndex) {
                int tmp = array[i];
                array[i] = array[maxIndex];
                array[maxIndex] = tmp;
            }
        }

        return array;
    }
}
