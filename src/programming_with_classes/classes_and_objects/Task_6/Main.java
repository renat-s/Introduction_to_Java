package programming_with_classes.classes_and_objects.Task_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ENTER_NEG_TIME = "Если хотите уменьшить время, вводите отрицательное значение.";
        Time time = new Time();

        Scanner in = new Scanner(System.in);
        boolean isTrueNumber = false;

//        while (!isTrueTime) {
//            isTrueTime = true;
            System.out.println("Введите время:");

            System.out.println("1. Введите сколько часов.");
            time.setHours(in.nextInt());

            System.out.println("2. Введите сколько минут.");
            time.setMinutes(in.nextInt());

            System.out.println("3. Введите сколько секунд.");
            time.setSeconds(in.nextInt());

        time.printTime();
//        }

        while (!isTrueNumber) {
            isTrueNumber = true;

            System.out.println("\nВыберите необходимый вариант:\n" +
                    "1. Скорректировать время.\n" +
                    "2. Изменить время на заданное количество часов.\n" +
                    "3. Изменить время на заданное количество минут.\n" +
                    "4. Изменить время на заданное количество секунд.");

            int number = in.nextInt();

            switch (number) {
                case 1 :
                    System.out.println("1. Введите сколько часов.");
                    time.setHours(in.nextInt());

                    System.out.println("2. Введите сколько минут.");
                    time.setMinutes(in.nextInt());

                    System.out.println("3. Введите сколько секунд.");
                    time.setSeconds(in.nextInt());

                    time.printTime();
                    isTrueNumber = false;
                    break;

                case 2 :
                    System.out.println("\nВведите количество часов на которое нужно изменить время.\n" + ENTER_NEG_TIME);
                    time.editHours(in.nextInt());
                    break;

                case 3 :
                    System.out.println("\nВведите количество минут на которое нужно изменить время.\n" + ENTER_NEG_TIME);
                    time.editMinutes(in.nextInt());
                    break;

                case 4 :
                    System.out.println("\nВведите количество секунд на которое нужно изменить время.\n" + ENTER_NEG_TIME);
                    time.editSeconds(in.nextInt());
                    break;

                default : System.out.println("\nВы ввели неверное значение.");
                    isTrueNumber = false;

            }
        }
        time.printTime();
    }

}
