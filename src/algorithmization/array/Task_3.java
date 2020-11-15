package algorithmization.array;
import util.Array;

public class Task_3 {
    public static void main(String[] args) {

        int[] array = new int[] {2,4,5,6,7,12,23,25,34,38,40,41,52,65,68,71,74,78,87,88,89,97,93};

        int pozitiveCount = checkPozInArray(array);
        int negativeCount = checkNegInArray(array);
        int zeroCount = checkZeroInArray(array);

        Array.printArray(array);
        System.out.println("Число положительных элементов:" + pozitiveCount);
        System.out.println("Число отрицательных элементов:" + negativeCount);
        System.out.println("Число нулевых элементов:" + zeroCount);
    }

    public static int checkZeroInArray(int[] array) {
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                counter++;
            }
        }

        return counter;
    }

    public static int checkNegInArray(int[] array) {
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                counter++;
            }
        }

        return counter;
    }

    public static int checkPozInArray(int[] array) {
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                counter++;
            }
        }

        return counter;
    }
}
