package algorithmization.sorted_array;

import util.Array;

public class Task_2 {
    public static void main(String[] args) {
        int sizeArray1 = 7;
        int sizeArray2 = 9;

        int[] array = Array.generateArray(sizeArray1);
        int[] array2 = Array.generateArray(sizeArray2);
        Array.sortArray(array);
        Array.printArray(array);
        Array.sortArray(array2);
        Array.printArray(array2);
        System.out.println();
        int [] array3=unionArrays(array, array2, sizeArray1, sizeArray2);
        Array.printArray(array3);
        System.out.println();
        int [] array4 = Array.sortArray(array3);
        Array.printArray(array4);
    }

    public static int[] unionArrays(int[] array1, int[] array2, int sizeArray1, int sizeArray2) {
        int a = sizeArray1 + sizeArray2;
        int[] newArray = new int[a];

        for (int i = 0; i < a; i++) {
            if (i <= sizeArray1 - 1) {
                newArray[i] = array1[i];
            }
            if (i > sizeArray1-1 && i < a) {
                newArray[i] = array2[i - sizeArray1];
            }
        }

        return newArray;
    }
}
