package basic_of_software_code_development;

public class cycle_task_3 {
    public static void main(String[] args) {

        int z = 0;

        for (int i = 1; i <= 100; i++) {
            z = (int)(z + Math.pow(i, 2));
        }
        System.out.println("Сумма квадратов первых ста чисел равна " + z);
    }
}
