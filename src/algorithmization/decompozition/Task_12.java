package algorithmization.decompozition;

import util.Array;
import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean isTrueNumber = false;

        while (!isTrueNumber) {
            isTrueNumber = true;

            System.out.println("Введите натуральное число К ");
            int k = in.nextInt();

            System.out.println("Введите натуральное число N, число N должно быть меньше K ");
            int n = in.nextInt();

            boolean isNatK = isNaturalNumber(k);
            boolean isNatN = isNaturalNumber(n);

            if(k > n){
                if ( isNatK && isNatN) {
                    Array.printArray(generateNumberForArray(k,n));
                } else {
                    System.out.println("Число не является натуральным \n");
                    isTrueNumber = false;
                }
            } else {
                System.out.println("Число N больше числа K \n");
                isTrueNumber = false;
            }
        }
    }

    public static int[] generateNumberForArray(int k, int n) {
        int[] array = new int[k/n + 1];
        int summ = 0;

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = n;
            summ += array[i];
        }

        array[array.length - 1] = k - summ;

        return array;
    }

    public static boolean isNaturalNumber(int number) {
        if (number <= 0) {
            return false;
        }

        return true;
    }
}
