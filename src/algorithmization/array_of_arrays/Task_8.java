package algorithmization.array_of_arrays;

import util.Array;
import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {

        int numberOfLine = 4;
        int numberOfColumn = 7;

        int[][] array = Array.generateArrayOfArray(numberOfLine, numberOfColumn);
        Array.printArrayOfArray(array);
        int[][] array2 = changeColumns(array);
        Array.printArrayOfArray(array2);

    }

    public static int[][] changeColumns(int[][] array) {
        int temp = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер первого столбца: ");
        int a = sc.nextInt() - 1;
        System.out.println("Введите номер второго стобца: ");
        int b = sc.nextInt() - 1;

        for (int i = 0; i < array.length; i++) {
            temp = array[i][a];
            array[i][a] = array[i][b];
            array[i][b] = temp;
        }

        return array;
    }

}