package algorithmization.array_of_arrays;

import util.Array;

public class Task_3 {
    public static void main(String[] args) {

        int numberOfLine = 7;
        int numberOfColumn = 6;
        int line = 3;
        int column = 4;

        int[][] array = Array.generateArrayOfArray(numberOfLine,numberOfColumn);
        Array.printArrayOfArray(array);
        System.out.println();
        printLine(array, line);
        System.out.println();
        printColumn(array, column);

    }



    public static void printLine(int[][] array, int k) {
        System.out.println("Строка номер " + k);
        for (int j = 0; j < array[k].length; j++) {
            System.out.printf("%-5d", array[k-1][j]);
        }
        System.out.println();
    }

    public static void printColumn(int[][] array, int p) {
        System.out.println("Столбец номер " + p);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][p-1]);
        }
        System.out.println();
    }
}
