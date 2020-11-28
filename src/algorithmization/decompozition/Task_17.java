package algorithmization.decompozition;

import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean isTrueNumber = false;

        while (!isTrueNumber) {
            isTrueNumber = true;

            System.out.println("Введите натуральное число ");
            int number = in.nextInt();

            if (number > 0) {
                System.out.println("Кол-во действий: " + findQuantityOfTrying(number));
            } else {
                isTrueNumber = false;
                System.out.println("Вы ввели неверное число");
            }
        }
    }

    public static int findSumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }

        return sum;
    }

    public static int findQuantityOfTrying(int number) {
        int counter = 0;

        while (number != 0) {
            number = number - findSumOfDigits(number);
            counter++;
        }

        return counter;
    }
}
