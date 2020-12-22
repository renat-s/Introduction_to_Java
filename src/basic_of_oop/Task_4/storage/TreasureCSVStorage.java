package basic_of_oop.Task_4.storage;

import basic_of_oop.Task_4.entity.Treasure;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TreasureCSVStorage implements TreasureStorage{

    private final String workDir = System.getProperty("user.dir");
    private final File file = new File(workDir + "/src/basic_of_oop/temp/resource/treasures.csv");
    private final String lineSeparator = System.getProperty("line.separator");
    private final String separator = ",";

    @Override
    public void saveTreasureList(List<Treasure> treasures) {

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            for(Treasure treasure : treasures) {
                bw.write(treasure.getName() + separator + treasure.getPrice() + lineSeparator);
            }
            bw.flush();
        } catch (IOException exc) {
            exc.printStackTrace();
        }

    }

    @Override
    public List<Treasure> loadTreasureList() {
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            List<Treasure> treasures = new ArrayList<>();
            String line = "";
            while((line = br.readLine()) != null) {
                String[] strTemp = line.split(separator);
                Treasure treasure = new Treasure(strTemp[0], Integer.parseInt(strTemp[1]),"");
                treasures.add(treasure);
            }

            return treasures;

        } catch (IOException exc) {
            exc.printStackTrace();
            return null;
        }
    }
}
