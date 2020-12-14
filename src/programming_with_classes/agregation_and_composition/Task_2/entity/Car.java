package programming_with_classes.agregation_and_composition.Task_2.entity;

public class Car {
    private String model;
    private int gas = 0;

    private Engine engine;
    private Wheels wheels;


    public Car(String model, Engine engine, Wheels wheels) {
        this.model = model;
        this.engine = engine;
        this.wheels = wheels;

    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setGas(int gas) {
        if (gas < 0) {
            System.out.println("Значение не может быть отрицательным");
            this.gas = 0;
        } else {
            this.gas = gas;
        }
    }

    public int getGas() {
        return gas;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public boolean checkEngineStart() {
        if (gas > 0) {
            engine.setPowerStatus(true);
        }
        return engine.getPowerStatus();
    }

    @Override
    public String toString() {
        return ("Car{" +
                "model='" + model + '\'' +
                ", gas=" + gas +
                ", engine=" + engine +
                ", wheels=" + wheels +
                '}');
    }
}
