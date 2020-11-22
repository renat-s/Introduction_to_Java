package algorithmization.sorted_array;

import util.Array;

public class Task_4 {
    public static void main(String[] args) {
        int size = 10;
        int[] array = Array.generateArray(size);

        Array.printArray(array);
        Array.printArray(sort(array));
    }

    public static int[] sort(int[] array) {
        int count = 0;
        int temp = 0;
        boolean triger = true;

        while (triger) {
            triger = false;

            for (int i = 1; i < array.length; i++) {

                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    count++;
                    triger = true;
                }
            }
        }
        System.out.println();
        System.out.println("Количество итераций " + count);

        return array;

    }
}
