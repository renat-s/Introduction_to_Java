package programming_with_classes.classes_and_objects.Task_2;

public class Test2 {
    private int firstNumber;
    private int secondNumber;

    public Test2() {
        firstNumber = 666;
        secondNumber = 13;
    }

    public Test2(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

}
