package algorithmization.decompozition;

import java.util.Random;

public class Task_6 {
    public static void main(String[] args) {
        Random r = new Random();

        int a = r.nextInt(100);
        int b = r.nextInt(100);
        int c = r.nextInt(100);

        System.out.println("Исходные числа: " + a + ", " + b + ", " + c);

        simplisityTest(a, b, c);
    }

    public static void simplisityTest(int a, int b, int c) {
        if (gcd(a, b) == 1) {

            if (gcd(b, c) == 1) {
                System.out.println("Данные числа являются взаимно простыми");

            } else {
                System.out.println("Данные числа не являются взаимно простыми");
            }

        } else {
            System.out.println("Данные числа не являются взаимно простыми");
        }
    }

    public static int gcd(int firstNumber, int secondNumber) {
        int t;

        while (secondNumber != 0) {
            t = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = t;
        }

        return Math.abs(firstNumber);
    }
}
