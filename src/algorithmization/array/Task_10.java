package algorithmization.array;
import util.Array;

public class Task_10 {
    public static void main(String[] args) {

        int[] array = new int[] {2,1,5,6,2,12,-3,23,25,2,38,-3,40,41,5,-3,52,65,68,7,74,2,78,87,5,88,89,97,93};

        Array.printArray(array);
        System.out.println();
        Array.printArray(getNewArray(array));
    }

    public static int[] getNewArray(int[] array) {
        for (int i = 1; i < array.length; i = i + 2) {
            array[i] = 0;
        }

        return array;
    }
}
