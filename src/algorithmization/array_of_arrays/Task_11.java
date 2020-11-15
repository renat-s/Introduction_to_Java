package algorithmization.array_of_arrays;

import util.Array;

public class Task_11 {
    public static void main(String[] args) {
        int numberOfLine = 10;
        int numberOfColumn = 20;
        int n = 5;

        int[][] array = createArray(numberOfLine, numberOfColumn);
        Array.printArrayOfArray(array);
        System.out.println();
        int[] array2 = countNInLine(array, n);
        printNumberOfLinesWithManyElements(array2, n);

    }

    public static int[][] createArray(int quantityOfLines, int quantityOfColumns) {
        int[][] array = new int[quantityOfLines][quantityOfColumns];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 16);
            }
        }

        return array;
    }

    public static int[] countNInLine(int[][] array, int n) {
        int[] array2 = new int[array.length];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == n) {
                    count++;
                }
                array2[i] = count;
            }
            count = 0;
        }

        return array2;
    }

    public static void printNumberOfLinesWithManyElements(int[] array, int n) {
        boolean temp = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 3) {
                System.out.println((i + 1) + " строка массива содержит элемент со значением `" + n + "` три или более раз");
                temp = false;
            }

        }
        if (temp){
            System.out.println("Массив не содержит строк, со значением `" + n + "` встречающегося три или более раз");
        }
    }
}
