package programming_with_classes.agregation_and_composition.Task_3.entity;

public class District {
    private City[] citiesInThisDistrict;
    private String nameOfDistrict;
    private int squareOfDistrict;

    public District(String nameOfDistrict, int squareOfDistrict, City... citiesInThisDistrict) {
        this.nameOfDistrict = nameOfDistrict;
        this.citiesInThisDistrict = citiesInThisDistrict;
        this.squareOfDistrict = squareOfDistrict;
    }

    public District(String nameOfDistrict, int squareOfDistrict) {
        this.nameOfDistrict = nameOfDistrict;
        this.squareOfDistrict = squareOfDistrict;
    }

    public City[] getCitiesInThisDistrict() {
        return citiesInThisDistrict;
    }

    public void setCitiesInThisDistrict(City... citiesInThisDistrict) {
        this.citiesInThisDistrict = citiesInThisDistrict;
    }

    public int getSquareOfDistrict() {
        return squareOfDistrict;
    }

    public void setSquareOfDistrict(int squareOfDistrict) {
        this.squareOfDistrict = squareOfDistrict;
    }

    public String getNameOfDistrict() {
        return nameOfDistrict;
    }

    public void setNameOfDistrict(String nameOfDistrict) {
        this.nameOfDistrict = nameOfDistrict;
    }

    @Override
    public String toString() {

        return ("District{" +
                ", citiesInThisDistrict=" + citiesInThisDistrict +
                '}');
    }
}
