package basic_of_oop.Task_4.entity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Cave {
    private String name;
    private ArrayList<Treasure> treasures = new ArrayList<Treasure>();

    public Cave(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void generateCave() {
        try (FileReader fr = new FileReader("C:\\\\Workspace\\\\5_Basics_of_OOP_task04\\\\src\\\\treasures.txt")){
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                String[] data = line.split(" ");
                treasures.add(new Treasure(data[0], Double.valueOf(data[1]),""));
                line = reader.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public double findMax() {
        double max = treasures.get(0).getPrice();

        for (Treasure treasure:treasures) {
            if (treasure.getPrice() > max) {
                max = treasure.getPrice();
            }
        }

        return max;
    }


    public void showTreasures() {
        for (Treasure treasure:treasures) {
            System.out.println("name - " + treasure.getName() + " price - " + treasure.getPrice());
        }
    }

    private void sort(ArrayList<Treasure> tr) {
        for (int i = tr.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (tr.get(j).getPrice() < tr.get(j + 1).getPrice()) {
                    Treasure tmp = tr.get(j);
                    tr.set(j, tr.get(j+1));
                    tr.set(j + 1, tmp);
                }
            }
        }
    }

    private void showTreasures(ArrayList<Treasure> tr) {
        for (Treasure t:tr) {
            System.out.println("name - " + t.getName() + " price - " + t.getPrice());
        }
    }

    public void findByPrice(double price) {
        ArrayList<Treasure> tr = treasures;
        ArrayList<Treasure> outTr = new ArrayList<Treasure>();
        ArrayList<Treasure> outTr2 = new ArrayList<Treasure>();

        double sum = 0;
        double sum2 = 0;
        int counter = 0;

        sort(tr);

        while (true) {
            if (sum + tr.get(counter).getPrice() <= price) {
                sum += tr.get(counter).getPrice();
                outTr.add(tr.get(counter));
                counter++;
            } else {
                if (sum2 + tr.get(counter).getPrice() <= price) {
                    sum2 += tr.get(counter).getPrice();
                    outTr2.add(tr.get(counter));
                }
                counter++;
            }

            if (counter == tr.size()) {
                break;
            }
        }

        if (sum2 > sum) {
            showTreasures(outTr2);
        } else {
            showTreasures(outTr);
        }
    }

}
