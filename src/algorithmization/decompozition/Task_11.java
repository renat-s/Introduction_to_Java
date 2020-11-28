package algorithmization.decompozition;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое натуральное число ");
        int number1 = in.nextInt();

        System.out.println("Введите второе натуральное число ");
        int number2 = in.nextInt();

        System.out.println("Кол-во цифр  первого числа = " + findArrLength(number1));
        System.out.println("Кол-во цифр  первого числа = " + findArrLength(number2));

        determineWhichNum(findArrLength(number1),findArrLength(number2));
    }

    public static int findArrLength(int number) {
        int counter = 0;

        while (number != 0) {
            counter++;
            number = number / 10;
        }

        return counter;
    }

    public static  void determineWhichNum( int counter1, int counter2){
        if ( counter1 > counter2 ){
            System.out.println("В первом числе цифр больше ");
        }else{
            System.out.println("Во втором числе цифр больше");
        }if (counter1 == counter2){
            System.out.println("Кол-во цифр числах одинаково");
        }
    }
}
