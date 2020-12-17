package basic_of_oop.Task_2.entity;

import java.util.ArrayList;

public class Payment {
    private double price;
    private ArrayList<Product> products = new ArrayList<Product>();

    public class Product {
        private String name;
        private double price;

        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }

    public void addProduct(String name, double price) {
        if (price < 0) {
            System.out.println("Невозможно добавить этот товар.");
        } else {
            Product prod = new Product(name, price);
            products.add(prod);
        }
    }

    public void calculatePrice() {
        for (Product prod : products) {
            price += prod.getPrice();
        }
    }

    public void printProducts() {
        if (products.isEmpty()) {
            System.out.println("Товаров нет.");
        } else {
            for (Product prod : products) {
                System.out.println("Товар: " + prod.getName() + " Стоимость: " + prod.getPrice());
            }
        }
    }

    public void printPrice() {
        System.out.println("Суммарная стоимость: " + price);
    }
}
