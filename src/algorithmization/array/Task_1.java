package algorithmization.array;
import util.Array;

public class Task_1 {
    public static void main(String[] args) {

        int k = 4;
        int[] array = new int[] {2,4,5,6,7,12,23,25,34,38,40,41,52,65};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                sum = sum + array[i];
            }
        }

        Array.printArray(array);
        System.out.println();
        System.out.println("Сумма элементов кратных " + k + " равна " + sum);

    }

}
