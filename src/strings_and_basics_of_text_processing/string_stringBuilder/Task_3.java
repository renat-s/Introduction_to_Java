package strings_and_basics_of_text_processing.string_stringBuilder;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово");
        StringBuilder str = new StringBuilder(in.nextLine());

        if (isPalindrome(str)) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }

    public static boolean isPalindrome(StringBuilder str) {
        if (str.toString().equals(str.reverse().toString())) {
            return true;
        }

        return false;
    }
}
