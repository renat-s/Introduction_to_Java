package strings_and_basics_of_text_processing.string_stringBuilder;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку ");
        String str = in.nextLine();

        System.out.println(countSentence(str));
    }

    public static int countSentence (String str) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.' || str.charAt(i) == '!' || str.charAt(i) == '?') {
                counter++;
            }
        }

        return counter;
    }
}
