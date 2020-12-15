package programming_with_classes.agregation_and_composition.Task_5.enity;

public enum Country {
    THAILAND("Тайланд", 500),
    RUSSIA("Россия", 250),
    SINGAPURE("Сингапур", 700),
    SPAIN("Испания", 400),
    GERMANY("Германия", 450),
    UKRAIN("Украина", 150);

    private String countryName;
    private double countryPrice;

    Country(String countryName, double countryPrice) {
        this.countryName = countryName;
        this.countryPrice = countryPrice;

    }

    public String getCountryName() {
        return countryName;
    }

    public double getCountryPrice() {
        return countryPrice;
    }

    @Override
    public String toString() {
        return ("Страна:" + " - " + countryName + ", Стоимость: " + countryPrice);
    }
}
