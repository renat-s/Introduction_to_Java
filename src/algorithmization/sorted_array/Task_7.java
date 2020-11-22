package algorithmization.sorted_array;

import util.Array;

public class Task_7 {
    public static void main(String[] args) {

        int sizeArray = 5;
        int sizeArray2 = 6;
        int[] array = Array.generateArray(sizeArray);
        int[] array2 = Array.generateArray(sizeArray2);

        Array.sortArray(array);
        Array.sortArray(array2);
        Array.printArray(array);
        Array.printArray(array2);

        System.out.println("Индексы элементов, для последовательной вставки элементов второй"
                + " последовательности "
                + " в новую последовательность размером " + (sizeArray2 + sizeArray)
                + ", образующейся от слияния двух неубывающих последовательностей.");
        Array.printArray(findIndex(array, array2));

    }

    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (key < array[middle]) {
                high = middle - 1;

            } else {
                if (key > array[middle]) {
                    low = middle + 1;
                } else {
                    return middle;
                }
            }
        }

        return low;
    }

    public static int[] findIndex(int[] array1, int[] array2) {
        int[] indexes = new int[array2.length];
        int counter = 0;

        for (int i = 0; i < array2.length; i++) {
            indexes[i] = binarySearch(array1, array2[i]) + counter;
            counter++;

        }

        return indexes;
    }
}
