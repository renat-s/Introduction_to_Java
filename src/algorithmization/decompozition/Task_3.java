package algorithmization.decompozition;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a: ");
        int sideTriangle = in.nextInt();

        System.out.print("Площадь равностороннего шестиугольника со стороной " + sideTriangle + " равна "
                + 6 * squareTriangle(sideTriangle));
    }

    public static float squareTriangle(int side) {
        return (float) (Math.pow(side, 2) * Math.sqrt(3)) / 4;
    }
}

