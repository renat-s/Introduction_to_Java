package basic_of_oop.Task_4.entity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class Cave {
    private static final long serialVersionUID = -1825054065303802842L;

    private ArrayList<Treasure> treasures = new ArrayList<Treasure>();

    public Cave() {
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(ArrayList<Treasure> treasures) {
        this.treasures = treasures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cave cave = (Cave) o;
        return Objects.equals(treasures, cave.treasures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(treasures);
    }

    @Override
    public String toString() {
        return "Cave{" +
                "treasures=" + treasures +
                '}';
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

//    public void findByPrice(double price) {
//        ArrayList<Treasure> tr = treasures;
//        ArrayList<Treasure> outTr = new ArrayList<Treasure>();
//        ArrayList<Treasure> outTr2 = new ArrayList<Treasure>();
//
//        double sum = 0;
//        double sum2 = 0;
//        int counter = 0;
//
//        sort(tr);
//
//        while (true) {
//            if (sum + tr.get(counter).getPrice() <= price) {
//                sum += tr.get(counter).getPrice();
//                outTr.add(tr.get(counter));
//                counter++;
//            } else {
//                if (sum2 + tr.get(counter).getPrice() <= price) {
//                    sum2 += tr.get(counter).getPrice();
//                    outTr2.add(tr.get(counter));
//                }
//                counter++;
//            }
//
//            if (counter == tr.size()) {
//                break;
//            }
//        }
//
//        if (sum2 > sum) {
//            showTreasures(outTr2);
//        } else {
//            showTreasures(outTr);
//        }
//    }

}
