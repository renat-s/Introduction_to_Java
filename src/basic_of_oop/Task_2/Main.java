package basic_of_oop.Task_2;

import basic_of_oop.Task_2.entity.Payment;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.printProducts();
        payment.addProduct("Coca-cola", 1.05);
        payment.addProduct("Fanta", 2.5);
        payment.addProduct("Sprite", 3.47);
        payment.calculatePrice();
        payment.printProducts();
        payment.printPrice();
    }
}
