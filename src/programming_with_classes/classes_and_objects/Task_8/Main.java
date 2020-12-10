package programming_with_classes.classes_and_objects.Task_8;

public class Main {
    public static void main(String[] args) {
        Customer[] customers = new Customer[3];

        customers[0] = new Customer(1, "Толкачев", "Александр", "Игоревич", 112314, 121543);
        customers[1] = new Customer(2, "Томашев", "Дмитрий", "Сергеевич", 147321, 782134);
        customers[2] = new Customer(3, "Солдатов", "Кирилл", "Александрович", 743747, 143012);

        CustomerLogic customerLogic = new CustomerLogic(customers);

        customerLogic.sort();

        customerLogic.printCustomer();
        System.out.println();
        customerLogic.interval(100, 666666);
    }


}
