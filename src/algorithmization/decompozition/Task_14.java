package algorithmization.decompozition;

import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isTrueNumber = false;

        while (!isTrueNumber) {
            isTrueNumber = true;

            System.out.println("Введите число К (число должно быть больше 0) ");
            int k = sc.nextInt();

            if(k > 0) {
                showArmstrongNumber(k);
            } else {
                System.out.println("Вы ввели неверное число \n");
                isTrueNumber = false;
            }
        }
    }

    public static void showArmstrongNumber(int k) {
        int sum = 0;

        for (int i = 1; i < k ; i++) {
            sum = i;
            if (isArmstrongNumber(i)){
                System.out.printf("%-2d ", i);
            }
        }
    }


    public static int findCounter(int number) {
        int counter = 0;

        while (number != 0) {
            counter++;
            number = number / 10;
        }

        return counter;
    }

    public static boolean isArmstrongNumber(int number) {
        int digitSum = 0;
        int degree = findCounter(number);
        int numberBuff = number;

        while (numberBuff != 0) {
            int digit = numberBuff % 10;

            numberBuff = numberBuff / 10;
            digitSum += (int) Math.pow(digit, degree);
        }

        if (number == digitSum) {
            return true;
        }

        return false;
    }
}
