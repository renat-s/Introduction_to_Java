package basic_of_software_code_development;

public class cycle_task_5 {
    public static void main(String[] args) {

        int n = 10;
        double e = 0.01;
        double sum = 0;

        for (int i = 1; i <= Math.abs(n); i++) {
            double value = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (value >= e) {
                sum = sum + value;
            }
        }

        System.out.println(sum);
    }
}
