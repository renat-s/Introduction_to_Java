package algorithmization.decompozition;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = in.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = in.nextInt();
        System.out.print("НОД данных чисел равен: " + gcd(firstNumber, secondNumber)
                + "\nНОК данных чисел равен: " + lcm(firstNumber, secondNumber));
    }

    public static int lcm(int firstNumber, int secondNumber) {
        int lcm = (firstNumber * secondNumber) / (gcd(firstNumber, secondNumber));

        return Math.abs(lcm);
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
