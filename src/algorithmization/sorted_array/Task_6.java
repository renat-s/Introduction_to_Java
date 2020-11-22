package algorithmization.sorted_array;

import util.Array;

public class Task_6 {
    public static void main(String[] args) {

        int[] array = Array.generateArray(10);

        Array.printArray(array);
        Array.printArray(sort(array));
    }

    public static int[] sort(int[] array){
        int index = 0;

        while (index <= array.length - 2) {
            if (array[index] <= array[index + 1]) {
                index++;

            } else {
                int tmp = array[index];

                array[index] = array[index + 1];
                array[index + 1] = tmp;

                if (index != 0) {
                    index--;
                }
            }
        }

        return array;
    }

}
