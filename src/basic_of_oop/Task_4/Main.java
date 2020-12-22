package basic_of_oop.Task_4;

import basic_of_oop.Task_4.entity.Cave;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Cave cave = new Cave("Cave");

        int choice;
        do {
            System.out.println("What do you want?");
            System.out.println("1. Watch all treasures");
            System.out.println("2. Choosing the most expensive treasure");
            System.out.println("3. Choosing treasures for given amount");
            System.out.print("Enter: ");
            choice = in.nextInt();
        } while (choice < 1 || choice > 3);

        cave.generateCave();
        switch (choice) {
            case 1:
                cave.showTreasures();
                break;
            case 2:
                double max = cave.findMax();
                System.out.println(max);
                break;
            case 3:
                System.out.print("Enter value: ");
                double price = in.nextDouble();
                cave.findByPrice(price);
                break;
            default:
                break;
        }

    }

}
