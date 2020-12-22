package basic_of_oop.Task_4.storage;

import basic_of_oop.Task_4.entity.Treasure;

import java.util.List;

public interface TreasureStorage {
    public void saveTreasureList(List<Treasure> treasures);

    public List<Treasure> loadTreasureList();
}
