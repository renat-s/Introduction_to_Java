package strings_and_basics_of_text_processing.string_stringBuilder;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter word");
        String str = in.nextLine();

        System.out.println(count(str, 'a'));
    }

    public static int count (String str, char symb) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symb) {
                counter++;
            }
        }

        return counter;
    }



}
