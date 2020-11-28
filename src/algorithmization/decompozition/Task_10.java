package algorithmization.decompozition;

import util.Array;
import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число ");
        int number = in.nextInt();

        if (isNaturalNumber(number)) {
            System.out.println("Длина массива = " + findArrayLength(number));
            int[] array = addElements(number, findArrayLength(number));
            Array.printArray(array);
        } else {
            System.out.println("Неверно введенное число ");
        }
    }

    public static boolean isNaturalNumber(int number) {
        if (number <= 0) {
            return false;
        }

        return true;
    }


    public static int findArrayLength(int number) {
        int counter = 0;

        if (isNaturalNumber(number)) {
            while (number != 0) {
                counter++;
                number = number / 10;
            }
        }

        return counter;
    }

    public static int[] addElements(int number, int arrayLength) {
        int[] array = new int[arrayLength];

        while (number != 0) {
            for (int i = array.length - 1; i >= 0; i--) {
                int digit = number % 10;
                array[i] = digit;
                number = number / 10;
            }
        }

        return array;
    }
}
