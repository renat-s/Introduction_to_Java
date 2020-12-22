package basic_of_oop.Task_4;

import basic_of_oop.Task_4.entity.Treasure;
import basic_of_oop.Task_4.menu.Menu;
import basic_of_oop.Task_4.storage.TreasureCSVStorage;
import basic_of_oop.Task_4.storage.TreasureStorage;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        TreasureStorage treasureStorage = new TreasureCSVStorage();
        List<Treasure> treasureList = treasureStorage.loadTreasureList();

        if (treasureList != null) {
            Menu menu = new Menu();
            menu.ShowMenu(treasureList);
        } else {
            System.out.println("Произошла ошибка при загрузке данных. Приложение остановлено.");
        }

    }

}
