package algorithmization.decompozition;

import util.Array;
import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean isTrueNumber = false;

        while (!isTrueNumber) {
            isTrueNumber = true;

            System.out.println("Введите число ");
            int n = in.nextInt();

            if (n > 2) {
                int[] array = fillArray(n);
                int[][] newArray = fillArrayBuff(array);
                Array.printArrayOfArray(newArray);

            } else {
                System.out.println("Введеное число должно быть больше двух \n");
                isTrueNumber = false;
            }
        }
    }

    public static int[] fillArray(int n) {
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = n;
            n++;
        }

        return array;
    }

    public static boolean isNumberSimple(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findQuantityOfPairNum(int[] array) {
        int counterOfPairNums = 0;

        for (int i = 0; i < array.length - 2; i++) {
            if (isNumberSimple(array[i]) && isNumberSimple(array[i + 2])) {
                counterOfPairNums++;
            }
        }

        return counterOfPairNums;
    }

    public static int[][] fillArrayBuff(int[] arr) {
        int countParNum = findQuantityOfPairNum(arr);
        int j = 0;
        int[][] arrayBuff = new int[countParNum][2];

        for (int i = 0; i < arr.length - 2; i++) {
            if (isNumberSimple(arr[i]) && isNumberSimple(arr[i + 2])) {
                arrayBuff [j][0] = arr[i];
                arrayBuff [j][1] = arr[i + 2];
                j++;
            }
        }

        return arrayBuff;
    }

}

