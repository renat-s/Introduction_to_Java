package algorithmization.array;

import util.Array;

public class Task_5 {
    public static void main(String[] args) {

        int[] array = new int[] {2,1,5,6,7,12,23,25,-2,38,40,41,52,65,68,7,74,78,87,88,89,97,93};

        Array.printArray(array);
        printElements(array);
    }

    public static void printElements(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.printf(array[i] + " ");
            }
        }
    }

}
