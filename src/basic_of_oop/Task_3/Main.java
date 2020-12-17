package basic_of_oop.Task_3;

import basic_of_oop.Task_3.entity.Calendar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar calendar = new Calendar();

        boolean checkMarker = false;
        while (!checkMarker) {
            checkMarker = true;
            boolean holiday = false;
            boolean weekEnd = false;

            System.out.println("Введите день, месяц, год который хотите добавить в календарь. ");
            System.out.print("Введите день: ");
            int day = sc.nextInt();

            System.out.print("Введите месяц: ");
            int month = sc.nextInt();

            System.out.print("Введите год: ");
            int year = sc.nextInt();

            System.out.println("\nПометить этот день как: " +
                    "\nЕсли праздничный введите 1" +
                    "\nЕсли выходной введите 2" +
                    "\nЕсли рабочий введите 3");
            int choose = sc.nextInt();

            switch (choose) {
                case (1) : holiday = true; break;
                case (2) : weekEnd = true; break;
                default: System.out.println("День помечен как рабочий."); break;
            }

            calendar.addDay(day, month, year, holiday, weekEnd);

            System.out.println();
            System.out.println("Внести еще одну дату в календарь? y/n ");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("y")) {
                checkMarker = false;
            }
        }

        calendar.displayCalendar();
        calendar.displayHolidays();
        calendar.displayWeekEnd();
    }
}
