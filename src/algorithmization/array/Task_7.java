package algorithmization.array;

import util.Array;

public class Task_7 {
    public static void main(String[] args) {

        int[] array = new int[] {2,1,5,6,7,12,23,25,-2,38,40,41,52,65,68,7,74,78,87,88,89,97,93};

        Array.printArray(array);
        int[] array2 = createNewArray(array);
        Array.printArray(array2);
        System.out.printf(getMaxElementInArray(array2) + " ");

    }

    public static int[] createNewArray(int[] array) {
        int[] array2 = new int[array.length / 2];

        for (int i = 0; i < array.length / 2; i++) {
            array2[i] = array[i] + array[array.length - 1 - i];
        }

        return array2;
    }

    public static int getMaxElementInArray(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}
