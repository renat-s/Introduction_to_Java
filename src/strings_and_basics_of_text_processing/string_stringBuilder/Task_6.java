package strings_and_basics_of_text_processing.string_stringBuilder;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter word");
        String str = in.nextLine();

        StringBuilder newStr = new StringBuilder(str);

        System.out.println(doubleString(newStr));
        System.out.println(str);
    }

    public static StringBuilder doubleString(StringBuilder str) {

        for (int i = 0; i < str.length(); i++) {
            str.insert(i, str.charAt(i));
            i++;
        }

        return str;
    }

}
