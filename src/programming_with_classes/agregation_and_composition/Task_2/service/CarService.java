package programming_with_classes.agregation_and_composition.Task_2.service;

import programming_with_classes.agregation_and_composition.Task_2.entity.Car;

public class CarService {
    private Car cars;

    public CarService(Car car) {
        this.cars = car;
    }

    public void printModel() {
        System.out.println(cars.getModel());
    }

    public void refuelGas() {
        cars.setGas(10);
    }

    public boolean isCheckGas() {
        if (cars.getGas() <= 0) {
            return true;
        }
        return false;
    }

    public boolean isMove() {
        return cars.checkEngineStart();
    }

    @Override
    public String toString() {
        return ("CarService{" + "cars=" + cars + '}');
    }
}
