package programming_with_classes.agregation_and_composition.Task_2;

import programming_with_classes.agregation_and_composition.Task_2.entity.Car;
import programming_with_classes.agregation_and_composition.Task_2.entity.Engine;
import programming_with_classes.agregation_and_composition.Task_2.entity.Wheels;
import programming_with_classes.agregation_and_composition.Task_2.service.CarService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car vw = new Car("VW", new Engine(), new Wheels());

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Audi", new Engine(), new Wheels()));
        cars.add(new Car("BMW", new Engine(), new Wheels()));
        cars.add(new Car("Subaru", new Engine(), new Wheels()));
        cars.add(vw);

        for (int i = 0; i < cars.size(); i++) {
            CarService carService = new CarService(cars.get(i));
            carService.printModel();
        }

        Wheels vwWheels = vw.getWheels();
        vwWheels.changeWheel(2);
    }

}
