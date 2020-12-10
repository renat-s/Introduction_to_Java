package programming_with_classes.classes_and_objects.Task_5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Счетчик без параметров.");
        Counter counterWithout = new Counter();

        counterWithout.decrease();
        System.out.println("Декремент: " + counterWithout.getNow());
        counterWithout.increase();
        System.out.println("Инкремент: " + counterWithout.getNow());

        System.out.println("Счетчик с параметрами.");
        Counter counterWith = new Counter(7, 17, 16);
        counterWith.increase();
        System.out.println("Инкремент: " + counterWith.getNow());
        counterWith.increase();
        System.out.println("Инкремент: " + counterWith.getNow());
        counterWith.increase();
        System.out.println("Инкремент: " + counterWith.getNow());
        counterWith.decrease();
        System.out.println("Декремент: " + counterWith.getNow());
        counterWith.decrease();
        System.out.println("Декремент: " + counterWith.getNow());

    }

}
