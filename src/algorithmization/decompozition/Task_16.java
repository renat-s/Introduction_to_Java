package algorithmization.decompozition;

import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean isTrueNumber = false;

        while (!isTrueNumber) {
            isTrueNumber = true;
            System.out.println("Введите натуральное число от 1 до 100000000");
            int b = in.nextInt();

            if(99999999 > b && b > 1) {
                System.out.print("Cумма чисел, которые содержат только нечетные цифры равна ");
                long summ = 0;

                for (int i = 1; i <= checkDegreeNumb(b); i++){
                    summ = summ + findNumbersSum(i, b);
                }

                System.out.println(summ);
                System.out.println("Количество четных цифр равно " + findEvenDigits(summ));
            } else {
                System.out.println("Вы ввели неверное число");
                isTrueNumber = false;
            }
        }
    }

    public static int checkDegreeNumb(int number) {
        int n = 1;

        if (1 < number && number < 10) { n = 1; }
        if (10 < number && number < 100) { n = 2; }
        if (100 < number && number < 1000) { n = 3; }
        if (1000 < number && number < 10000) { n = 4; }
        if (10000 < number && number < 100000) { n = 5; }
        if (100000 < number && number < 1000000) { n = 6; }
        if (1000000 < number && number < 10000000) { n = 7; }
        if (10000000 < number && number < 100000000) { n = 8; }

        return n;
    }

    public static int[] createArray(int number, int n) {
        int[] mass = new int[n];

        for (int i = 0; i < n; i++) {
            mass[n - 1 - i] = number % 10;
            number = number / 10;
        }

        return mass;
    }

    public static long findNumbersSum(int n, int b) {
        int a = (int) Math.pow(10, n - 1);
        int x;
        long summ = 0;

        if (b > Math.pow(10, n)) {
            x = (int) (Math.pow(10, n) - 1);
        } else {
            x = b;
        }

        for (int i = a; i <= x; i++) {
            int[] array = createArray(i, n);
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (array[j] % 2 == 0) {
                    count++;
                }
            }

            if (count == n - 1) {
                summ = summ + i;
            }
        }

        return summ;
    }

    public static int findEvenDigits(long number) {
        int counter = 0;
        while (number != 0) {
            long digit = number % 10;
            if (digit % 2 == 0) {
                counter++;
            }
            number = number / 10;
        }
        return counter;
    }
}
