package programming_with_classes.classes_and_objects.Task_10;

import java.util.ArrayList;

public class AirlineLogic {
    ArrayList<Airline> planes;

    public AirlineLogic(ArrayList<Airline> planes) {
        this.planes = planes;
    }

    public void addPlane(String destination, int flightNumber, String type, String time, String day) {
        planes.add(new Airline(destination, flightNumber, type, time, day));
    }

    public void printAirLine() {
        for (Airline plane:planes) {
            System.out.println(plane.toString());
        }
    }

    public void printDestination(String userDestination) {
        for (Airline plane:planes) {
            if (plane.getDestination().equals(userDestination)) {
                System.out.println(plane.toString());
            }
        }
    }

    public void printDay(String userDay) {
        for (Airline plane:planes) {
            if (plane.getDay().equals(userDay)) {
                System.out.println(plane.toString());
            }
        }
    }

    public void printDayAfterTime(String userDay, String userTime) {
        for (Airline plane:planes) {
            if (plane.getDay().equals(userDay)) {
                if (plane.getTime().compareTo(userTime) > 0) {
                    System.out.println(plane.toString());
                }
            }
        }
    }

}
