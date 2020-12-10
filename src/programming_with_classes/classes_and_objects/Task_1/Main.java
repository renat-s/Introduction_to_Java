package programming_with_classes.classes_and_objects.Task_1;

public class Main {
    public static void main(String[] args) {
        Test1 test = new Test1(11, 10);
        test.print();
        System.out.println("Максимальное число: " + test.getMax());
        System.out.println("Сумма: " + test.getSum());

        test.setFirstNumber(3);
        test.setSecondNumber(7);

        System.out.println();
        test.print();
        System.out.println("Максимальное число: " + test.getMax());
        System.out.println("Сумма: " + test.getSum());
    }

}
