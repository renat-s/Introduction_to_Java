package basic_of_oop.Task_4.service;

import basic_of_oop.Task_4.entity.Treasure;

import java.util.ArrayList;
import java.util.List;

public class TreasureService {

    public void showTreasureList(List<Treasure> treasures) {
        System.out.printf("| %-32s | %-10s |\n", "СОКРОВИЩЕ", "СТОИМОСТЬ");
        for (int i = 0; i < 49; i++) {
            System.out.print('-');
        }
        System.out.println();

        for(Treasure treasure : treasures) {
            System.out.printf("| %-32s | %4d монет |\n", treasure.getName(), treasure.getPrice());
        }
        for (int i = 0; i < 49; i++) {
            System.out.print('-');
        }
        System.out.println();

    }

    public Treasure getMaxPriceTreasure(List<Treasure> treasures) {
        int max = treasures.get(0).getPrice();
        Treasure treasure = new Treasure();

        for (Treasure tr : treasures) {
            if (tr.getPrice() > max) {
                max = tr.getPrice();
                treasure = tr;
            }
        }

        return treasure;
    }

    public List<Treasure> getListForAmount(List<Treasure> treasures, int amount) {
        List<Treasure> list = new ArrayList<>();

        for (Treasure treasure : treasures) {
            if (treasure.getPrice() <= amount) {
                list.add(treasure);
                amount -= treasure.getPrice();
            }
        }

        return list;
    }
}
