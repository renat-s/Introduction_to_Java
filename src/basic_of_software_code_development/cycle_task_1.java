package basic_of_software_code_development;

import java.util.Scanner;

public class cycle_task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое положительное число:");

        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Вы ввели некорректное число, повторите ввод:");
        }

        int a = scanner.nextInt();
        int z = 0;

        for (int i = 1; i < a; i++) {
            z = z + i;
        }
        System.out.println(" Сумма цифр от 1 до " + a + " равна " + z);
    }
}
