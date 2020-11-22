package algorithmization.sorted_array;

public class Task_8_temp {
    public static void main(String[] args) {
        int[] numerators = {5, 7, 10, 12};
        int[] denominators = {12, 30, 18, 5};

        int lcm = denominators[0];
        for (int i = 1; i < denominators.length; i++) {
            lcm = (lcm * denominators[i]) / gcd(lcm, denominators[i]);
        }

        System.out.println(lcm);

        for (int i = 0; i < numerators.length; i++) {
            numerators[i] = numerators[i] * (lcm / denominators[i]);
            System.out.print(numerators[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < numerators.length; i++) {
            for (int j = numerators.length - 1; j > i; j--) {
                if (numerators[i] > numerators[j]) {
                    int tmp = numerators[i];
                    numerators[i] = numerators[j];
                    numerators[j] = tmp;
                }
            }
        }

        for (int i = 0; i < numerators.length; i++) {
            System.out.print(numerators[i] + " ");
        }
    }

    public static int gcd(int firstNumber, int secondNumber) {
        while (firstNumber - secondNumber != 0) {
            if (firstNumber > secondNumber) {
                firstNumber -= secondNumber;
            } else {
                secondNumber -= firstNumber;
            }
        }

        return firstNumber;
    }

}
