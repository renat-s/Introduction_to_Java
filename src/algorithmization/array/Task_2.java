package algorithmization.array;
import util.Array;

public class Task_2 {
    public static void main(String[] args) {

        int[] array = new int[] {2,4,5,6,7,12,23,25,34,38,40,41,52,65,68,71,74,78,87,88,89,97,93};
        int z = 67;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                count++;
            }
        }
        Array.printArray(array);
        System.out.println();
        System.out.println("Количество замен: " + count);
    }

}
