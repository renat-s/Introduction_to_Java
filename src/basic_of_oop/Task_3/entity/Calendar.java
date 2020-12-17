package basic_of_oop.Task_3.entity;

import java.util.ArrayList;

public class Calendar {
    private ArrayList<Day> days = new ArrayList<Day>();
    private ArrayList<Day> holidays = new ArrayList<Day>();
    private ArrayList<Day> weeksEnd = new ArrayList<Day>();

    class Day {
        private int date;
        private int month;
        private int year;
        private boolean holiday;
        private boolean weekEnd;

        Day(int date, int month, int year, boolean holiday, boolean weekEnd) {
            this.date = date;
            this.month = month;
            this.year = year;
            this.holiday = holiday;
            this.weekEnd = weekEnd;
        }

        public void setWeekEnd(boolean weekEnd) {
            this.weekEnd = weekEnd;
        }

        public void setDate(int date) {
            this.date = date;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void setHoliday(boolean holiday) {
            this.holiday = holiday;
        }

        public int getDate() {
            return date;
        }

        public int getMonth() {
            return month;
        }

        public int getYear() {
            return year;
        }

        public boolean isHoliday() {
            return holiday;
        }

        public boolean isWeekEnd() {
            return weekEnd;
        }
    }

    private void addToCalendar(int day, int month, int year, boolean holiday, boolean weekEnd) {
        Day userDay = new Day(day, month, year, holiday, weekEnd);
        days.add(userDay);
        if (holiday) {
            holidays.add(userDay);
        }
        if (weekEnd) {
            weeksEnd.add(userDay);
        }
    }

    public void addDay(int day, int month, int year, boolean holiday, boolean weekEnd) {
        if (month % 2 == 0) {
            if (month == 2) {
                if (day > 29 || day < 1) {
                    System.out.println("ошибка в дате " + "\"" + day + "." + month + "." + year + "\".");
                } else {
                    addToCalendar(day, month, year, holiday, weekEnd);
                }
            } else if (day > 30 || day < 0) {
                System.out.println("ошибка в дате " + "\"" + day + "." + month + "." + year + "\".");
            } else {
                addToCalendar(day, month, year, holiday, weekEnd);
            }
        } else {
            if (day > 31 || day < 0) {
                System.out.println("ошибка в дате " + "\"" + day + "." + month + "." + year + "\".");
            } else {
                addToCalendar(day, month, year, holiday, weekEnd);
            }
        }
    }

    public void displayCalendar() {
        System.out.println("\nКалендарь: ");
        for(Day day : days) {
            String answer;
            if (day.isHoliday()) {
                answer = "Праздник";
            } else {
                if (day.isWeekEnd()) {
                    answer = "Выходной";
                } else {
                    answer = "Рабочий день";
                }
            }
            System.out.println(day.getDate() + "." + day.getMonth() + "." + day.getYear() + " - " + answer);
        }
    }

    public void displayHolidays() {
        if (!holidays.isEmpty()){
            System.out.println("\nПраздник:");
            for (Day holiday : holidays) {
                System.out.println(holiday.getDate() + "." + holiday.getMonth() + "." + holiday.getYear());
            }
        }
    }

    public void displayWeekEnd() {
        if (!weeksEnd.isEmpty()){
            System.out.println("\nВыходной:");
            for (Day weekEnd : weeksEnd) {
                System.out.println(weekEnd.getDate() + "." + weekEnd.getMonth() + "." + weekEnd.getYear());
            }
        }
    }
}
