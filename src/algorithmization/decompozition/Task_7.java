package algorithmization.decompozition;

public class Task_7 {
    public static void main(String[] args) {
        int n = 9;

        System.out.println("Сумма факториалов нечетных чисел в диапазоне [1-9] равна " + summOfFactorial(n));
    }

    public static int summOfFactorial(int n) {
        int summ = 0;

        for (int i = 1; i < n + 1; i = i + 2) {
            summ = summ + factorial(i);

        }

        return summ;
    }

    public static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }
}
