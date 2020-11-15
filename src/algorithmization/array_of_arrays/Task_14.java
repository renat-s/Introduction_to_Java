package algorithmization.array_of_arrays;

import util.Array;

public class Task_14 {
    public static void main(String[] args) {

        int m = (int) (Math.random() * 10 + 1);
        int n = (int) (Math.random() * 10 + 1);

        int[][] array = createArray(m, n);
        Array.printArrayOfArray(array);;

    }

    public static int[][] createArray(int m, int n) {
        int[][] array = new int[m][n];

        if (m < n) {
            System.out.println("Сгенерирована матрица размером " + m + " на " + n + "."
                    + " На матрице данных размеров не выполнимо условие задачи ");
        } else {
            for (int j = 0; j < n; j++) {

                for (int i = 0; i < j + 1; i++) {
                    array[i][j] = 1;
                }
            }
        }

        return array;
    }

}
