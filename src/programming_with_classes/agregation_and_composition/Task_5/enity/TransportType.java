package programming_with_classes.agregation_and_composition.Task_5.enity;

public enum TransportType {
    AIRPLANE("Самолет", 200),
    BUS("Автобус", 50),
    TRAIN("Поезд", 100),
    SHIP("Корабль", 150);

    private String transportType;
    private double transportTypePrice;

    TransportType(String transportType, double transportTypePrice) {
        this.transportType = transportType;
        this.transportTypePrice = transportTypePrice;
    }

    public String getTransportType() {
        return transportType;
    }

    public double getTransportTypePrice() {
        return transportTypePrice;
    }

    @Override
    public String toString() {
        return ("Тип транспорта: " + transportType + ", Стоимость: " + transportTypePrice);
    }
}
