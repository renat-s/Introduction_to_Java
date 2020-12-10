package programming_with_classes.classes_and_objects.Task_6;

public class Time {
    String FALSE_VALUE = "Недопустимое значение. Устанавливается значение по умолчанию \"0\".";

    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setHours(int hours) {
        if (hours > 24 || hours < 0) {
            System.out.println(FALSE_VALUE);
            this.hours = 0;
        } else {
            this.hours = hours;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes > 59 || minutes < 0) {
            System.out.println(FALSE_VALUE);
            this.minutes = 0;
        } else {
            this.minutes = minutes;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds > 59 || seconds < 0) {
            System.out.println(FALSE_VALUE);
            this.seconds = 0;
        } else {
            this.seconds = seconds;
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void editHours(int userHours) {
        if (userHours < 0) {
            int temp = getHours() * 3600 + getMinutes() * 60 + getSeconds() + userHours * 3600;

            if (temp < 0) {
                System.out.println("Время получается отрицательным");
                this.hours = temp/3600;
                this.minutes = (temp - getHours()*3600)/60;
                this.seconds = temp - getHours() * 3600 - getMinutes() * 60;
            } else {
                this.hours = temp/3600;
                this.minutes = (temp - getHours()*3600)/60;
                this.seconds = temp - getHours() * 3600 - getMinutes() * 60;
            }
        } else {
            this.hours = this.hours + userHours;
        }
    }

    public void editMinutes(int userMinutes) {
        if (userMinutes < 0) {
            int temp = getHours() * 3600 + getMinutes() * 60 + getSeconds() + userMinutes * 60;

            if (temp < 0) {
                System.out.println("Время получается отрицательным");
                this.hours = temp/3600;
                this.minutes = (temp - getHours()*3600)/60;
                this.seconds = temp - getHours() * 3600 - getMinutes() * 60;
            } else {
                this.hours = temp/3600;
                this.minutes = (temp - getHours()*3600)/60;
                this.seconds = temp - getHours() * 3600 - getMinutes() * 60;
            }
        } else {
            int number = (this.minutes + userMinutes) / 60;

            editHours(number);
            this.minutes = (this.minutes + userMinutes) - number * 60;
        }
    }

    public void editSeconds(int userSeconds) {
        if (userSeconds < 0) {
            int temp = getHours() * 3600 + getMinutes() * 60 + getSeconds() + userSeconds;

            if (temp < 0) {
                System.out.println("Время получается отрицательным");

                this.hours = (temp/3600);
                this.minutes = ((temp - getHours()*3600)/60);
                this.seconds = temp - getHours() * 3600 - getMinutes() * 60;
            } else {
                this.hours = (temp/3600);
                this.minutes = ((temp - getHours()*3600)/60);
                this.seconds = temp - getHours() * 3600 - getMinutes() * 60;
            }
        } else {
            int number = (this.seconds + userSeconds) / 60;

            editMinutes(number);
            this.seconds = (this.seconds + userSeconds) - number * 60;
        }
    }

    public void printTime() {
        System.out.println(getHours() + "ч. " + getMinutes() + "мин. " + getSeconds() + "сек.");
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }

}
