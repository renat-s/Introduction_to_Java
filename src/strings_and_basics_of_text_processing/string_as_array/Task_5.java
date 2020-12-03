package strings_and_basics_of_text_processing.string_as_array;

public class Task_5 {
    public static void main(String[] args) {
        String str = "Hello       word    321. Today is    2020 years.          ";
        System.out.println(str);

        System.out.println(editString(str));
    }

    public static int firstSymb(String str) {
        int firstSymbNumb = 0;

        char[] strChar = str.toCharArray();
        while (strChar[firstSymbNumb] == ' ') {
            firstSymbNumb++;
        }

        return firstSymbNumb;
    }

    public static String editString(String str) {

        char[] strChar = str.toCharArray();
        int i = firstSymb(str);
        str = "";
        for (   ; i < strChar.length - 1; i++) {
            if (strChar[i] == ' ' && strChar[i + 1] != ' ') {
                str += strChar[i];
            } else if (strChar[i] != ' ') {
                str += strChar[i];
            }
        }

        return str;
    }
}
