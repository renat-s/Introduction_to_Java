package programming_with_classes.agregation_and_composition.Task_3.entity;

public class City {
    private String cityName;

    public City(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return ("City{" +
                "cityName='" + cityName + '\'' +
                '}');
    }
}
