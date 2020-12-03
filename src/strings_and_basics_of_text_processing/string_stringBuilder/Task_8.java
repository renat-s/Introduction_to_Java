package strings_and_basics_of_text_processing.string_stringBuilder;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слова через пробел ");
        String str = in.nextLine();

        System.out.println(findMaxWord(str));
    }

    public static String findMaxWord(String str) {
        int counter = 0;
        int maxWordLength = 0;
        int j = -1;
        String maxWord = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || i == str.length()-1) {
                if(i == str.length()-1) {
                    counter++;
                    i++;
                }
                if (maxWordLength < counter) {
                    maxWordLength = counter;
                    maxWord = str.substring(j + 1, i);
                }
                counter = 0;
                j = i;
            } else {
                counter++;
            }
        }

        return maxWord;
    }
}
