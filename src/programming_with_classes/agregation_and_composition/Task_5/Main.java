package programming_with_classes.agregation_and_composition.Task_5;

import programming_with_classes.agregation_and_composition.Task_5.enity.*;
import programming_with_classes.agregation_and_composition.Task_5.service.TravelService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TravelService travelService = new TravelService();

        Country[] countries = Country.values();
        TourType[] tourTypes = TourType.values();
        TransportType[] transportTypes = TransportType.values();
        NutritionType[] nutritionTypes = NutritionType.values();
        DaysQuantity[] daysQuantities = DaysQuantity.values();

        travelService.printInfo(tourTypes);
        System.out.println("Сделайте выбор типа отдыха: ");
        boolean checkMarker = false;
        while (!checkMarker) {
            checkMarker = true;
            String tour = sc.nextLine();
            travelService.selectTour(tour);
            if (travelService.getTourType() == null) {
                checkMarker = false;
                System.out.println("Вы ввели неверное значение");
            }
        }

        System.out.println();

        travelService.printInfo(countries);
        System.out.println("Сделайте выбор страны: ");
        checkMarker = false;
        while (!checkMarker) {
            checkMarker = true;
            String country = sc.nextLine();
            travelService.selectCountry(country);
            if (travelService.getCountry() == null) {
                checkMarker = false;
                System.out.println("Вы ввели неверное значение");
            }
        }

        System.out.println();

        travelService.printInfo(transportTypes);
        System.out.println("Сделайте выбор транспорта: ");
        checkMarker = false;
        while (!checkMarker) {
            checkMarker = true;
            String transport = sc.nextLine();
            travelService.selectTransport(transport);
            if (travelService.getTransportType() == null) {
                checkMarker = false;
                System.out.println("Вы ввели неверное значение");
            }
        }

        System.out.println();

        travelService.printInfo(nutritionTypes);
        System.out.println("Сделайте выбор типа питания: ");
        checkMarker = false;
        while (!checkMarker) {
            checkMarker = true;
            String nutrition = sc.nextLine();
            travelService.selectNutrition(nutrition);
            if (travelService.getNutritionType() == null) {
                checkMarker = false;
                System.out.println("Вы ввели неверное значение");
            }
        }

        System.out.println();

        travelService.printInfo(daysQuantities);
        System.out.println("Введите кол-во дней отдыха: ");
        checkMarker = false;
        while (!checkMarker) {
            checkMarker = true;
            int days = sc.nextInt();
            travelService.selectDayQuantities(days);
            if (travelService.getDaysQuantity() == null) {
                checkMarker = false;
                System.out.println("Вы ввели неверное значение");
            }
        }

        Voucher voucher = new Voucher(travelService);
        System.out.println(voucher.toString());

    }
}
