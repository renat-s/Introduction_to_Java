package programming_with_classes.agregation_and_composition.Task_2.entity;

public enum Wheel {
    SPARE_WHEEL ("запасное колесо"),
    FIRST_WHEEL ("первое колесо"),
    SECOND_WHEEL ("второе колесо"),
    THIRD_WHEEL ("третье колесо"),
    FOURTH_WHEEL ("четвертое колесо");

    private String title;

    Wheel(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return ("Wheel{" +
                "wheels=" + title +
                '}');
    }
}
