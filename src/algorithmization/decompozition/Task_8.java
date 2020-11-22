package algorithmization.decompozition;

import util.Array;

public class Task_8 {
    public static void main(String[] args) {
        int n = 21;
        int k = 2;
        int m = 13;

        int[] array = Array.generateArray(n);
        System.out.println("Исходный массив");
        Array.printArray(array);
        System.out.println("Суммы трех последовательно расположенных элементов с индексами от к = " + k + " до m = " + m);
        summ(array, k, m);

    }

    public static void summ(int[] array, int k, int m) {
        for (int i = k - 1; i <= m - 2; i = i + 3) {
            int summ = array[i] + array[i + 1] + array[i + 2];
            System.out.printf("%d + %d + %d = %d", array[i], array[i + 1], array[i + 2], summ);
            System.out.println();
        }
    }

}
