package strings_and_basics_of_text_processing.string_stringBuilder;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку ");
        String str = in.nextLine();

        System.out.println("Количество больших букв: " + countUpper(str)
                + "\nКоличество маленьких букв: " + countLower(str));
    }

    public static int countUpper(String text) {
        int counterUpper = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                counterUpper++;
            }
        }

        return counterUpper;
    }

    public static int countLower(String text) {
        int counterLower = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLowerCase(text.charAt(i))) {
                counterLower++;
            }
        }

        return counterLower;
    }
}
