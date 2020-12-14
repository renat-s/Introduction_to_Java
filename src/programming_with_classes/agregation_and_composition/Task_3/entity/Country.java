package programming_with_classes.agregation_and_composition.Task_3.entity;

import java.util.Arrays;

public class Country {
    private String countryName;
    private City capital;
    private Area[] area;

    public Country(String countryName, City capital, Area... area) {
        this.capital = capital;
        this.area = area;
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public Area[] getArea() {
        return area;
    }

    public void setArea(Area[] area) {
        this.area = area;
    }

    public int getQuantityOfAreas() {
        return area.length;
    }

    public int getSquareOfState() {
        int sumSquare = 0;
        for (Area i : area) {
            sumSquare += i.getSquareOfArea();

        }
        return sumSquare;
    }

    public String[] getAreaCityCentre() {
        String[] city = new String[area.length];
        for (int i = 0; i < area.length; i++) {
            city[i] = area[i].getAreaCityCentre().getCityName();
        }

        return city;
    }

    @Override
    public String toString() {
        return "Country{" +
                "capital=" + capital +
                ", area=" + Arrays.toString(area) +
                '}';
    }

}
