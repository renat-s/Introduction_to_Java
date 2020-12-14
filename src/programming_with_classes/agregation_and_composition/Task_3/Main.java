package programming_with_classes.agregation_and_composition.Task_3;

import programming_with_classes.agregation_and_composition.Task_3.entity.Area;
import programming_with_classes.agregation_and_composition.Task_3.entity.City;
import programming_with_classes.agregation_and_composition.Task_3.entity.District;
import programming_with_classes.agregation_and_composition.Task_3.entity.Country;
import programming_with_classes.agregation_and_composition.Task_3.service.CountryService;

public class Main {
    public static void main(String[] args) {
        City cityMinsk = new City("Минск");

        City cityGrodno = new City("Гродно");

        City cityGomel = new City("Гомель");

        District districtMinsk = new District("Минский", 5000, cityMinsk);
        District districtJodino = new District("Жодинский ", 250);

        District districtGrodno = new District("Гродненский", 2000, cityGrodno);
        District districtGoja = new District("Гожский", 100);

        District districtGomel = new District("Гомельский", 3000, cityGomel);


        Area areaMinsk = new Area("Минская обл.", cityMinsk, districtMinsk, districtJodino);

        Area areaGrodno = new Area("Гродненская обл.", cityGrodno, districtGrodno, districtGoja);

        Area areaGomel = new Area("Гомельская обл.", cityGomel, districtGomel);

        Country country = new Country("Беларусь", cityMinsk, areaMinsk, areaGomel, areaGrodno);


        CountryService countryService = new CountryService(country);

        countryService.printTheCapital();
        countryService.printTheQuantityOfAreas();
        countryService.printCountrySquare();
        countryService.printAreaCityCentre();
    }
}

