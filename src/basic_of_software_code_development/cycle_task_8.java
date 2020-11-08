package basic_of_software_code_development;

public class cycle_task_8 {
    public static void main(String[] args) {

        int a = 1235467;
        int b = 92898765;

        System.out.print("Совпадающие цифры в обоих числах: ");

        while (a > 0) {

            int c = a % 10;
            a = a / 10;
            int d = b;

            while (d > 0) {

                if (d % 10 == c) {
                    System.out.print(c + " ");
                    break;
                }
                d = d / 10;
            }
        }
    }
}
