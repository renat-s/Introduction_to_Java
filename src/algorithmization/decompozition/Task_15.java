package algorithmization.decompozition;

import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean isTrueNumber = false;

        while (!isTrueNumber) {
            isTrueNumber = true;

            System.out.println("Введите натуральное n значное число большее 10 ");
            int b = in.nextInt();
            if(b > 10) {
                System.out.println("Числа, цифры которых образуют возрастающую прогрессию:");

                for (int i = 2; i <= checkDegreeNumb(b); i++){
                    findNumbers(i, b);
                }
            } else {
                System.out.println("Вы ввели неверное число");
                isTrueNumber = false;
            }
        }
    }

    public static int checkDegreeNumb(int number) {
        int n = 1;

        if (100 < number && number < 1000) { n = 3; }
        if (1000 < number && number < 10000) { n = 4; }
        if (10000 < number && number < 100000) { n = 5; }
        if (100000 < number && number < 1000000) { n = 6; }
        if (1000000 < number && number < 10000000) { n = 7; }
        if (10000000 < number && number < 100000000) { n = 8; }

        return n;
    }

    public static int[] createArray(int number, int n) {
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[n - 1 - i] = number % 10;
            number = number / 10;
        }

        return array;
    }

    public static void findNumbers(int n, int b) {
        int a = (int) Math.pow(10, n - 1);
        int x;

        if (b > Math.pow(10, n)) {
            x = (int) (Math.pow(10, n) - 1);
        } else {
            x = b;
        }

        for (int i = a; i <= x; i++) {
            int[] array = createArray(i, n);

            int count = 0;
            for (int j = 1; j < n; j++) {
                if (array[j] == array[j - 1] + 1) {
                    count++;
                }
            }

            if (count == n - 1) {
                System.out.printf("[%d]", i);
            }
        }
    }
}
