package programming_with_classes.agregation_and_composition.Task_2.entity;

public class Wheels {
    private int firstWheel = Wheel.FIRST_WHEEL.ordinal();
    private int secondWheel = Wheel.SECOND_WHEEL.ordinal();
    private int thirdWheel = Wheel.THIRD_WHEEL.ordinal();
    private int fourthWheel = Wheel.FOURTH_WHEEL.ordinal();
    private int spareWheel = Wheel.SPARE_WHEEL.ordinal();

    public Wheels() {
    }

    public int getFirstWheel() {
        return firstWheel;
    }

    private void setFirstWheel(int firstWheel) {
        this.firstWheel = firstWheel;
    }

    public int getSecondWheel() {
        return secondWheel;
    }

    private void setSecondWheel(int secondWheel) {
        this.secondWheel = secondWheel;
    }

    public int getThirdWheel() {
        return thirdWheel;
    }

    private void setThirdWheel(int thirdWheel) {
        this.thirdWheel = thirdWheel;
    }

    public int getFourthWheel() {
        return fourthWheel;
    }

    private void setFourthWheel(int fourthWheel) {
        this.fourthWheel = fourthWheel;
    }

    public void changeWheel(int numberOfWheel) {
        switch (numberOfWheel) {
            case 1:
                System.out.println(Wheel.FIRST_WHEEL.getTitle() + " заменено на запасное");
                setFirstWheel(spareWheel);
                break;
            case 2:
                System.out.println(Wheel.SECOND_WHEEL.getTitle() + " заменено на запасное");
                setSecondWheel(spareWheel);
                break;
            case 3:
                System.out.println(Wheel.THIRD_WHEEL.getTitle() + " заменено на запасное");
                setThirdWheel(spareWheel);
                break;
            case 4:
                System.out.println(Wheel.FOURTH_WHEEL.getTitle() + " заменено на запасное");
                setFourthWheel(spareWheel);
                break;
            default:
                System.out.println("Требуется ввести номер колеса от 1 до 4");
        }
    }

}
