package programming_with_classes.classes_and_objects.Task_10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AirlineLogic planes = new AirlineLogic(new ArrayList<>());

        planes.addPlane("Gomel", 666666, "Boeing 747", "12:00", "Wed");
        planes.addPlane("Minsk", 777777, "Boeing 767", "09:00", "Fri");
        planes.addPlane("Oslo", 555555, "Airbus A300", "23:00", "Mon");
        planes.addPlane("Berlin", 111111, "Airbus A310", "04:27", "Sun");
        planes.addPlane("Amsterdam", 444444, "Boeing 747", "12:05", "Fri");
        planes.addPlane("Chicago", 111111, "Airbus A310", "08:00", "Mon");

        System.out.println("Список рейсов:");
        planes.printAirLine();
        System.out.println();

        System.out.println("Список рейсов для заданного пункта назначения Berlin:");
        planes.printDestination("Berlin");
        System.out.println();

        System.out.println("Список рейсов для заданного дня Fri:");
        planes.printDay("Fri");
        System.out.println();

        System.out.println("Список рейсов для заданного дня Mon и времени после 07.00:");
        planes.printDayAfterTime("Mon", "07:00");
    }
}
