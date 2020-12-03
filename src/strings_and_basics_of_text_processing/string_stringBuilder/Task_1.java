package strings_and_basics_of_text_processing.string_stringBuilder;

public class Task_1 {
    public static void main(String[] args) {
        String str = "Hello       word    321. Today is    2020 years          .";
        System.out.println(str);
        System.out.println("Максимальное число пробелов - " + findMaxSpace(str));
    }

    public static int findMaxSpace(String str) {
        int counter = 0;
        int maxSpace = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                counter++;
            } else {
                if (maxSpace < counter) {
                    maxSpace = counter;
                }

                counter = 0;
            }
        }

        return maxSpace;
    }
}
