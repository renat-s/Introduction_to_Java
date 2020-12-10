package programming_with_classes.classes_and_objects.Task_10;

public class Airline {
    private String destination;
    private int flightNumber;
    private String type;
    private String time;
    private String day;

    public Airline(String destination, int flightNumber, String type, String time, String day) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.type = type;
        this.time = time;
        this.day = day;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "пункт назначения = '" + destination + '\'' +
                ", номер рейса = " + flightNumber +
                ", тип самолета = '" + type + '\'' +
                ", время вылета = '" + time + '\'' +
                ", день недели = '" + day + '\'' +
                '}';
    }

}
