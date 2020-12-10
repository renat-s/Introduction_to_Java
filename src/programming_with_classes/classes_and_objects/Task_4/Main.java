package programming_with_classes.classes_and_objects.Task_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Train[] trains = new Train[5];
        trains[0] = new Train("Homel", 123123, "12:00");
        trains[1] = new Train("Brest", 131313, "09:00");
        trains[2] = new Train("Minsk", 621325, "08:00");
        trains[3] = new Train("Oslo", 152343, "05:00");
        trains[4] = new Train("Amsterdam", 123457, "23:25");

        Scanner in = new Scanner(System.in);
        boolean isTrueNumber = false;

        System.out.println("Список поездов:");
        for (Train train:trains) {
            train.printTrain();
        }

        while (!isTrueNumber) {
            isTrueNumber = true;

            System.out.println("\nВыберите необходимый вариант:\n" +
                    "1. Сортировка поездов по номеру.\n" +
                    "2. Сортировка поездов по пункту назначения.\n" +
                    "3. Вывод информации о поезде.");

            int number = in.nextInt();

            switch (number) {
                case 1 :
                    Train.sortTrainNumber(trains);
                    System.out.println("Сортировка по номеру поезда.");
                    for (Train train:trains) {
                        train.printTrain();
                    }
                    break;

                case 2 :
                    Train.sortDestination(trains);
                    System.out.println("\nСортировка по пнкту назначения.");
                    for (Train train:trains) {
                        train.printTrain();
                    }
                    break;

                case 3 :
                    System.out.println("Введите номер поезда:");

                    int trainNumber = in.nextInt();

                    boolean checkTrainNumber = false;
                    while (!checkTrainNumber) {
                        for (Train train:trains){
                            if (train.getTrainNumber() == trainNumber) {
                                checkTrainNumber = true;
                                break;
                            }
                        }
                        if (!checkTrainNumber) {
                            System.out.println("Поезда с таким номером нет.");
                            System.out.println("Введите номер поезда:");
                        }
                    }

                    System.out.println("\nИнформация о поезде.");

                    for (Train train:trains) {
                        if(train.getTrainNumber() == trainNumber) {
                            train.printTrain();
                        }
                    }
                    break;

                default : System.out.println("\nВы ввели неверное значение.");
                    isTrueNumber = false;

            }
        }
    }

}
