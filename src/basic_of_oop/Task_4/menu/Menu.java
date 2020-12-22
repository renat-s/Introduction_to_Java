package basic_of_oop.Task_4.menu;

import basic_of_oop.Task_4.entity.Treasure;
import basic_of_oop.Task_4.service.TreasureService;

import java.util.List;
import java.util.Scanner;

public class Menu {

    public void ShowMenu(List<Treasure> treasureList) {
        Scanner sc = new Scanner(System.in);
        TreasureService treasureService = new TreasureService();

        while (true) {
            System.out.print("\nВы попали в пещеру дакона" +
                    "\nПоказать все сокровища 1" +
                    "\nПоказать самое дорогое сокровище 2" +
                    "\nВыбрать сокровища на заданную сумму 3" +
                    "\nВыход из программы 0" +
                    "\nВыберите вариант: ");

            int choose = sc.nextInt();

            switch (choose) {
                case (1):
                    treasureService.showTreasureList(treasureList);
                    break;
                case (2):
                    Treasure treasure = treasureService.getMaxPriceTreasure(treasureList);
                    System.out.println("СОКРОВИЩЕ - " + treasure.getName() + ", СТОИМОСТЬ - " + treasure.getPrice());
                    break;
                case (3):
                    System.out.print("Введите сумму: ");
                    int amount = sc.nextInt();
                    List<Treasure> treasures = treasureService.getListForAmount(treasureList, amount);
                    if (treasures.isEmpty()) {
                        System.out.println("Слишком маленькая сумма.");
                    } else {
                        treasureService.showTreasureList(treasures);
                    }
                    break;
                case (0):
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

}
