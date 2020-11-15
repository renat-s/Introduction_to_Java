package algorithmization.sorted_array;

import util.Array;

public class Task_1 {
    public static void main(String[] args) {
        int size1 = 7;
        int size2 = 9;
        int k = 3;

        int[] array = Array.generateArray(size1);
        Array.printArray(array);

        int[] array2 = Array.generateArray(size2);
        Array.printArray(array2);
        System.out.println("Число К равно " + k);

        int[] array3 = unionArrays(array, array2, k);
        Array.printArray(array3);

    }

    public static int[] unionArrays(int[] array1, int[] array2, int k) {
        int a = array1.length + array2.length;
        int[] array3 = new int[a];

        for (int i = 0; i <= a; i++) {

            if (i <= k - 1) {
                array3[i] = array1[i];
            }

            if (i > k - 1 && i <= k - 1 + array2.length) {
                array3[i] = array2[i - k];
            }

            if (i > k - 1 + array2.length && i < a) {
                array3[i] = array1[i - array2.length];
            }
        }

        return array3;
    }
}
