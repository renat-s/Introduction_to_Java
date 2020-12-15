package programming_with_classes.agregation_and_composition.Task_5.enity;

public enum TourType {
    REST("Отдых", 500),
    EXCURSIONS("Экскурсии", 250),
    TREATMENT("Лечение", 700),
    SHOPPING("Шопинг", 400),
    CRUISE("Круиз", 450);

    private String tourType;
    private double tourTypePrice;

    TourType(String tourType, double tourTypePrice) {
        this.tourType = tourType;
        this.tourTypePrice = tourTypePrice;
    }

    public String getTourType() {
        return tourType;
    }

    public double getTourTypePrice() {
        return tourTypePrice;
    }

    @Override
    public String toString() {
        return ("Тип отдыха: " + tourType + ", Стоимость: " + tourTypePrice);
    }
}
