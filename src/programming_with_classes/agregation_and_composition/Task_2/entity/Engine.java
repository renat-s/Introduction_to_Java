package programming_with_classes.agregation_and_composition.Task_2.entity;

public class Engine {
    private boolean powerStatus;

    public Engine() {
        this.powerStatus = false;
    }

    public boolean getPowerStatus() {
        return powerStatus;
    }

    public void setPowerStatus(boolean powerStatus) {
        this.powerStatus = powerStatus;
    }

    @Override
    public String toString() {
        return ("Engine{" + "powerStatus=" + powerStatus + '}');
    }
}
