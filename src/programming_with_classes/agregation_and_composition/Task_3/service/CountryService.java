package programming_with_classes.agregation_and_composition.Task_3.service;

import programming_with_classes.agregation_and_composition.Task_3.entity.Country;

import java.util.Arrays;

public class CountryService {
    private Country country;

    public CountryService(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void printTheCapital() {
        System.out.println("Столица государства " + country.getCountryName() + " " + country.getCapital().getCityName() + ".");
    }

    public void printTheQuantityOfAreas() {
        System.out.println("В государстве " + country.getCountryName() + " " + country.getQuantityOfAreas() + " областей.");
    }

    public void printCountrySquare() {
        System.out.println("Площадь государства " + country.getCountryName() + " составляет " + country.getSquareOfState() + " кв.км");
    }

    public void printAreaCityCentre() {
        System.out.println("Областные центры государства " + country.getCountryName() + " "
                + Arrays.toString(country.getAreaCityCentre()));
    }

    @Override
    public String toString() {
        return String.format("StateAction{" +
                "country=" + country +
                '}');
    }
}
