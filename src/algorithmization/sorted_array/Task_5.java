package algorithmization.sorted_array;

import util.Array;

public class Task_5 {
    public static void main(String[] args) {

        int size = 20;
        int[] array = Array.generateArray(size);

        Array.printArray(array);
        int[] filteredArray = Array.removeDuplicatesInArray(array);
        Array.printArray(filteredArray);
        Array.printArray(sort(filteredArray));
    }

    public static int[] sort (int[] array) {
        for (int i = 1; i < array.length; i++) {
            int index = binarySearch(array, array[i], i - 1);
            int tmp = array[i];

            for (int j = i; j > index; j--) {
                array[j] = array[j - 1];
            }

            array[index] = tmp;
        }

        return array;
    }

    public static int binarySearch(int[] array, int numberSearch, int lastIndex) {
        int firstIndex = 0;
        int middleIndex;
        while (firstIndex <= lastIndex) {
            middleIndex = (firstIndex + lastIndex) / 2;
            if (array[middleIndex] < numberSearch) {
                firstIndex = middleIndex + 1;
            } else if (array[middleIndex] > numberSearch) {
                lastIndex = middleIndex - 1;
            }
        }

        middleIndex = (firstIndex + lastIndex + 1) / 2;

        return middleIndex;
    }

}
