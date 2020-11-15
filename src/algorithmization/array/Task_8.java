package algorithmization.array;

import util.Array;

public class Task_8 {
    public static void main(String[] args) {

        int[] array = new int[] {-2,1,5,6,7,12,23,25,-2,38,40,41,52,65,68,7,74,-2,87,88,89,97,93};

        Array.printArray(array);
        int minInArray = getMinElementInArray(array);
        System.out.println(minInArray);
        int count = getCountMinElementsInArray(array, minInArray);
        int[] array2 = newArray(array, count, minInArray);
        Array.printArray(array2);

    }


    public static int getMinElementInArray(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public static int getCountMinElementsInArray(int[] array, int minElementInArray) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == minElementInArray) {
                count++;
            }
        }

        return count;
    }

    public static int[] newArray(int[] array, int count, int minElementInArray) {
        int[] array2 = new int[array.length - count];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != minElementInArray) {
                array2[index] = array[i];
                index++;
            }
        }

        return array2;
    }
}
