package programming_with_classes.agregation_and_composition.Task_5.enity;

import programming_with_classes.agregation_and_composition.Task_5.service.TravelService;

public class Voucher {
    private TravelService travelService;
    private double price;

    public Voucher(TravelService travelService) {
        this.travelService = travelService;

    }

    public void setPrice(double price) {
        this.price = travelService.getPrice();
    }

    public double getPrice() {
        price = travelService.getPrice() + (travelService.getDaysQuantity().getDaysQuantity() * 400);
        return price;
    }

    @Override
    public String toString() {
        return ("Страна: " + travelService.getCountry().getCountryName() + "\n" +
                "Тип тура: " + travelService.getTourType().getTourType() + "\n" +
                "Кол-во дней: " + travelService.getDaysQuantity().getDaysQuantity() + "\n" +
                "Вид транспорта: " + travelService.getTransportType().getTransportType() + "\n" +
                "Тип питания: " + travelService.getNutritionType().getNutritionType() + "\n" +
                "Стоимость тура: " + getPrice() + "\n");
    }
}
