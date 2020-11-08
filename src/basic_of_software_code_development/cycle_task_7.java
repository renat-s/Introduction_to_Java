package basic_of_software_code_development;

import java.util.Scanner;

public class cycle_task_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальное значение промежутка:");
        int m = scanner.nextInt();
        System.out.println("Введите конечное число промежутка:");
        int n = scanner.nextInt();
        System.out.print("Список всех делителей данного числового промежутка: ");

        for (int i = m; i <= n; i++) {
            System.out.println("\nДелители числа " + i);
            boolean t = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                    t = true;
                }
            }
            if (!t) {
                System.out.println("Делителей нет");
            }
        }
    }
}
