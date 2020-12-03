package strings_and_basics_of_text_processing.string_stringBuilder;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку ");
        String str = in.nextLine();

        StringBuilder newStr = new StringBuilder();
        newStr.append(str);

        System.out.println(deleteRepeating(newStr));

    }

    public static String deleteRepeating(StringBuilder str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                str.deleteCharAt(i);
                i--;
            }

            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    str.deleteCharAt(j);
                    j--;
                }
            }
        }

        return str.toString();
    }






}
