package algorithmization.array;
import util.Array;

public class Task_4 {
    public static void main(String[] args) {

        int[] array = new int[] {2,4,5,6,7,12,23,25,34,38,40,41,52,65,68,71,74,78,87,88,89,97,93};

        Array.printArray(array);

        System.out.println("Индекс максимального элемента в массиве:" + findMaxIndex(array));
        System.out.println("Индекс минимального элемента в массиве:" + findMinIndex(array));

        int maxIndex = findMaxIndex(array);
        int minIndex = findMinIndex(array);
        int temp = array[maxIndex];

        array[maxIndex] = array[minIndex];
        array[minIndex] = temp;
        Array.printArray(array);

    }


    public static int findMaxIndex(int[] array) {
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public static int findMinIndex(int[] array) {
        int minIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }
}
