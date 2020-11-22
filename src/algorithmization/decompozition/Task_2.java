package algorithmization.decompozition;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int firstNumber = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int secondNumber = in.nextInt();
        System.out.print("Enter 3rd number: ");
        int thirdNumber = in.nextInt();
        System.out.print("Enter 4th number: ");
        int fourthNumber = in.nextInt();

        int firstGCD = gcd(firstNumber, secondNumber);
        int secondGCD = gcd(thirdNumber, fourthNumber);

        System.out.println("НОД данных чисел равен: " + gcd(firstGCD, secondGCD));
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
