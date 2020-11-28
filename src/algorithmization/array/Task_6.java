package algorithmization.array;
import util.Array;

public class Task_6 {
    public static void main(String[] args) {

        int[] array = new int[] {2,1,5,6,7,12,23,25,-2,38,40,41,52,65,68,7,74,78,87,88,89,97,93};

        Array.printArray(array);
        int sum = summ(array);
        System.out.print("Сумма чисел, порядковые номера которых являются простыми числами равна " + sum);
    }

    public static int summ(int[] array) {
        int sum = 0;

        for (int i = 2; i < array.length; i++) {
            if (isNumberSimple(i)) {
                sum = sum + array[i];
            }
        }

        return sum;
    }

    public static boolean isNumberSimple(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
