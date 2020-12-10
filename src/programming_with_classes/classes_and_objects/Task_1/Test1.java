package programming_with_classes.classes_and_objects.Task_1;

public class Test1 {
    private int firstNumber;
    private int secondNumber;

    public Test1(int firstNumber, int secondNumber) {
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

    public void print() {
        System.out.println("1st number: " + getFirstNumber() + "\n2nd number: " + getSecondNumber());
    }

    public int getSum() {
        return firstNumber + secondNumber;
    }

    public int getMax() {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }
}
