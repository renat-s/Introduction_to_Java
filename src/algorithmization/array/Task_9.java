package algorithmization.array;

import util.Array;

public class Task_9 {
    public static void main(String[] args) {

        int[] array = new int[] {0,1,5,6,2,12,-3,23,25,2,38,-3,40,41,5,-3,52,65,68,7,74,2,78,87,5,88,89,97,93};

        Array.printArray(array);

        System.out.println("Минимальное значение наиболее часто встречающегося элемента в массиве равно "
                + getMinInDublicateElement(getIndexMaxDublicateElementInArray(getArrayCountDublicateElements(array)),array));

    }

    public static int getMinInDublicateElement(int[] arrayWithIndexMaxDublicateElement, int[] array) {
        int min = array[arrayWithIndexMaxDublicateElement[0]];
        if (arrayWithIndexMaxDublicateElement[1] != 0) {
            for (int i = 0; i < arrayWithIndexMaxDublicateElement.length; i++) {
                if (min > array[arrayWithIndexMaxDublicateElement[i]]) {
                    min = array[arrayWithIndexMaxDublicateElement[i]];
                }
            }

            return min;
        }

        return array[arrayWithIndexMaxDublicateElement[0]];
    }


    public static int[] getArrayCountDublicateElements(int[] array) {
        int[] newArray = new int[array.length];
        int count = 0;

        for (int j = 0; j < array.length; j++) {
            for (int i = j + 1; i < array.length; i++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
            newArray[j] = count;
            count = 0;
        }

        return newArray;
    }

    public static int[] getIndexMaxDublicateElementInArray(int[] array) {
        int[] maxIndex = new int[10];
        int max = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[max] < array[i]) {
                max = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[max] == array[i]) {
                maxIndex[count] = i;
                count++;
            }
        }

        return maxIndex;
    }
}
