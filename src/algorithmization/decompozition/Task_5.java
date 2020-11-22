package algorithmization.decompozition;

import util.Array;

public class Task_5 {
    public static void main(String[] args) {

        int sizeArray = 10;
        int [] array = Array.generateArray(sizeArray);
        System.out.println("Исходный массив:");
        Array.printArray(array);
        System.out.print("Второе по величине значение в массиве равно ");
        System.out.println(findPenultimateElement(sortInAscendingOrder(array)));

    }

    public static int[] sortInAscendingOrder(int[] array) {
        boolean isSorted = false;
        int temp;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

        return array;
    }

    public static int findPenultimateElement(int[] array) {
        return array[array.length - 2];
    }

}
