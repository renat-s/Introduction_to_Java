package programming_with_classes.agregation_and_composition.Task_3.entity;

import java.util.Arrays;

public class Area {
    private District[] districts;
    private City areaCityCentre;
    private String areaName;

    public Area(String areaName, City areaCityCentre, District... districts) {
        this.areaCityCentre = areaCityCentre;
        this.districts = districts;
        this.areaName = areaName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    public City getAreaCityCentre() {
        return areaCityCentre;
    }

    public void getAreaCityCentre(City areaCityCentre) {
        this.areaCityCentre = areaCityCentre;
    }

    public int getSquareOfArea() {
        int sumSquare = 0;

        for (District i : districts) {
            sumSquare += i.getSquareOfDistrict();
        }
        return sumSquare;
    }

    @Override
    public String toString() {
        return "Area{" +
                "districts=" + Arrays.toString(districts) +
                ", areaCityCentre=" + areaCityCentre +
                '}';
    }
}
