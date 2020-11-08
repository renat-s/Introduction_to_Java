package basic_of_software_code_development;

import java.math.BigInteger;

public class cycle_task_4 {
    public static void main(String[] args) {

        BigInteger a = BigInteger.valueOf(1);

        for (int i = 1; i <= 200; i++) {
            a = a.multiply(BigInteger.valueOf(i * i));
        }

        System.out.println("Произведение квадратов чисел от 1 до 200 равно " + a);
    }
}
