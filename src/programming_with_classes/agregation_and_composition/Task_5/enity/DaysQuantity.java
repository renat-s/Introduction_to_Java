package programming_with_classes.agregation_and_composition.Task_5.enity;

public enum DaysQuantity {
    ONE(1,20),
    TWO(2,40),
    SEVEN(7,150),
    FORTEEN(14,300),
    TWENTY_ONE(21,420),
    TWENTYE_IGHT(28,520);

    private int daysQuantity;
    private double daysQuantityPrice;


    DaysQuantity(int daysQuantity, double daysQuantityPrice) {
        this.daysQuantity = daysQuantity;
        this.daysQuantityPrice = daysQuantityPrice;
    }

    public int getDaysQuantity() {
        return daysQuantity;
    }

    public double getDaysQuantityPrice() {
        return daysQuantityPrice;
    }

    @Override
    public String toString() {
        return ("Количество дней отдыха: " + daysQuantity + ", Стоимость: " + daysQuantityPrice);
    }
}
