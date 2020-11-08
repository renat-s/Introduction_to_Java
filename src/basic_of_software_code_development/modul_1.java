package basic_of_software_code_development;

import static java.lang.Math.*;

public class modul_1 {
    public static void main(String[] args) {

        int a = 6;
        int b = 23;
        int c = 12;
        int d = 35;
        int temp;

        //task 1
        System.out.println(((a-3)*b/2) + c);

        //task 2
        System.out.println((b+sqrt(pow(b,2) + 4*a*c))/2*a - pow(a,3)*c + pow(b,-2));

        //task 3
        double x = 1.2;
        double y = 2;
        System.out.println((sin(x)+cos(y))/(cos(x)-sin(y))*tan(x*y));

        //task 4
        double r = 999.956;
        temp = ((int)floor(r));
        System.out.println((r*1000-temp*1000) + floor(r)/1000);

        //task 5
        int t = 454730;
        System.out.println(t/3600 + "H " + t%3600/60 + "Min " + t%3600%60 + "S");

        //task 6
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

        //task 1
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

        //task 2
        System.out.println("a = " + a + "; b = " + b + "; c = " + c + "; d = " + d);
        if(a < b) {
            if(c < d){
                if(a < c){
                    System.out.println("MAX = " + c);
                } else {
                    System.out.println("MAX = " + a);
                }
            } else {
                if(a < d) {
                    System.out.println("MAX = " + d);
                } else {
                        System.out.println("MAX = " + a);
                }
            }
        } else {
            if(c < d){
                if(b < c){
                    System.out.println("MAX = " + c);
                } else {
                    System.out.println("MAX = " + b);
                }
            } else {
                if(b < d) {
                    System.out.println("MAX = " + d);
                } else {
                     System.out.println("MAX = " + b);
                }
            }

        }

        //task 3
        double x1 = -2;
        double y1 = 5;
        double x2 = 4;
        double y2 = 3;
        double x3 = 16;
        double y3 = -1;
        if ((x2 - x1) / (x3 - x1) == (y2 - y1) / (y3 - y1)) {
            System.out.println("Точки принадлежат одной прямой");
        } else {
            System.out.println("Точки не принадлежат одной прямой");
        }

        //task 4
        double brick_a = 10;
        double brick_b = 11;
        double brick_x = 1;
        double brick_y = 12;
        double brick_z = 13;


        if ((brick_a > brick_x) && (brick_b > brick_y) || (brick_a > brick_y) && (brick_b > brick_x) || (brick_a > brick_x) && (brick_b > brick_z) || (brick_a > brick_z && (brick_b > brick_x)) || (brick_a > brick_y) && (brick_b > brick_z)
                || (brick_a > brick_z) && (brick_b > brick_y)) {
            System.out.println("Кирпич проходит в отверстие");
        }

        else {
            System.out.println("Кирпич не проходит в отверстие");
        }


        //task 5
        if (x <= 3) {
            System.out.println(x * x - 3 * x + 9);
        } else {
            System.out.println(1 / (x * x * x + 6));
        }

    }
}
