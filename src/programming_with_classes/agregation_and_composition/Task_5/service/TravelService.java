package programming_with_classes.agregation_and_composition.Task_5.service;

import programming_with_classes.agregation_and_composition.Task_5.enity.*;

public class TravelService {
    private Country[] countries = Country.values();;
    private TourType[] tourTypes = TourType.values();
    private TransportType[] transportTypes = TransportType.values();
    private NutritionType[] nutritionTypes = NutritionType.values();
    private DaysQuantity[] daysQuantities = DaysQuantity.values();

    private Country country;
    private TourType tourType;
    private TransportType transportType;
    private NutritionType nutritionType;
    private DaysQuantity daysQuantity;

    private double price;

    public TravelService() {
    }

    public Country[] getCountries() {
        return countries;
    }

    public TourType[] getTourTypes() {
        return tourTypes;
    }

    public TransportType[] getTransportTypes() {
        return transportTypes;
    }

    public NutritionType[] getNutritionTypes() {
        return nutritionTypes;
    }

    public void setCountries(Country[] countries) {
        this.countries = countries;
    }

    public void setTourTypes(TourType[] tourTypes) {
        this.tourTypes = tourTypes;
    }

    public void setTransportTypes(TransportType[] transportTypes) {
        this.transportTypes = transportTypes;
    }

    public void setNutritionTypes(NutritionType[] nutritionTypes) {
        this.nutritionTypes = nutritionTypes;
    }

    public Country getCountry() {
        return country;
    }

    public TourType getTourType() {
        return tourType;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public NutritionType getNutritionType() {
        return nutritionType;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setTourType(TourType tourType) {
        this.tourType = tourType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public void setNutritionType(NutritionType nutritionType) {
        this.nutritionType = nutritionType;
    }

    public DaysQuantity[] getDaysQuantities() {
        return daysQuantities;
    }

    public void setDaysQuantities(DaysQuantity[] daysQuantities) {
        this.daysQuantities = daysQuantities;
    }

    public DaysQuantity getDaysQuantity() {
        return daysQuantity;
    }

    public void setDaysQuantity(DaysQuantity daysQuantity) {
        this.daysQuantity = daysQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printInfo(Object[] object) {
        for (Object i : object) {
            System.out.println(i.toString());
        }
    }

    public void selectCountry(String stringCountry) {
        for (Country country : getCountries()) {
            if (country.getCountryName().equalsIgnoreCase(stringCountry)) {
                setCountry(country);
                setPrice(country.getCountryPrice() + getPrice());
            }
        }
    }

    public void selectTour(String tour) {
        for (TourType tourType : getTourTypes()) {
            if (tourType.getTourType().equalsIgnoreCase(tour)) {
                setTourType(tourType);
                setPrice(tourType.getTourTypePrice() + getPrice());
            }
        }
    }

    public void selectTransport(String transport) {
        for (TransportType transportType : transportTypes) {
            if (transportType.getTransportType().equalsIgnoreCase(transport)) {
                setTransportType(transportType);
                setPrice(transportType.getTransportTypePrice() + getPrice());
            }
        }
    }

    public void selectNutrition(String nutrition) {
        for (NutritionType nutritionType : nutritionTypes) {
            if (nutritionType.getNutritionType().equalsIgnoreCase(nutrition)) {
                setNutritionType(nutritionType);
                setPrice(nutritionType.getNutritionTypePrice() + getPrice());
            }
        }
    }

    public void selectDayQuantities(int days) {
        for (DaysQuantity day : daysQuantities) {
            if (days == day.getDaysQuantity()) {
                setDaysQuantity(day);
                setPrice(day.getDaysQuantityPrice() + getPrice());
            }
        }
    }

    public TourType[] sortTour() {
        TourType temp;
        double price1 = 0;
        double price2 = 0;
        TourType[] sortTour = new TourType[tourTypes.length];

        for (int i = tourTypes.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                price1 = tourTypes[j].getTourTypePrice();
                price2 = tourTypes[j + 1].getTourTypePrice();
                if (price1 > price2) {
                    temp = tourTypes[j];
                    tourTypes[j] = tourTypes[j + 1];
                    tourTypes[j + 1] = temp;
                }
            }
            sortTour = tourTypes;
        }
        return sortTour;
    }

}
