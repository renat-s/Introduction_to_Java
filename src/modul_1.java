import static java.lang.Math.*;

public class modul_1 {
    public static void main(String[] args) {

        int a = 6;
        int b = 23;
        int c = 12;
        int temp;

        System.out.println(((a-3)*b/2) + c);

        System.out.println((b+sqrt(pow(b,2) + 4*a*c))/2*a - pow(a,3)*c + pow(b,-2));

        double x = 1.2;
        double y = 2;
        System.out.println((sin(x)+cos(y))/(cos(x)-sin(y))*tan(x*y));

        double r = 999.956;
        temp = ((int)floor(r));
        System.out.println((r*1000-temp*1000) + floor(r)/1000);

        int t = 454730;
        System.out.println(t/3600 + "H " + t%3600/60 + "Min " + t%3600%60 + "S");


        double l = -2;
        double m = -2;
        if(-2 <= l & l < 2 & 0 <= m & m <= 4) {
            System.out.println("true");
        } else {
            if(-4 <= l & l < 4 & -3 <= m & m <= 0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

        double angle_x = 90;
        double angle_y = 90;

        if (angle_x + angle_y >= 180) {
            System.out.println("Такой треугольник не может существовать");
        } else {
            if (180 - angle_x - angle_y == 90 || angle_x == 90 || angle_y == 90) {
                System.out.println("Треугольник прямоугольный");
            } else {
                System.out.println("Обычный треугольник");
            }
        }




    }
}
