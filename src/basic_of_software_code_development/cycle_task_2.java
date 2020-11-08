package basic_of_software_code_development;

public class cycle_task_2 {
    public static void main(String[] args) {

        double x;
        double y;

        double a = 1.1;
        double b = 2.2;
        double h = 0.1;

        for (x = a; x <= b; x = x + h) {
            if (x > 2) {
                y = x;
                System.out.println(y);
            } else {
                y = -x;
                System.out.println(y);
            }
        }
    }
}
