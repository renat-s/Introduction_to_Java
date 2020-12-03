package strings_and_basics_of_text_processing.string_as_array;

public class Task_3 {
    public static void main(String[] args) {
        String str = "Hello word 321. Today is 2020 years";
        System.out.println(str);
        System.out.println("В строке " + count(str) + " цифр");
    }

    public static boolean isDigitSymbol(char symb) {
        if (symb >= '0' && symb <= '9') {
            return true;
        }

        return false;
    }

    public static int count (String str) {
        int counter = 0;
        char[] strChar = str.toCharArray();

        for (int i = 0; i < strChar.length; i++) {
            if (isDigitSymbol(strChar[i])) {
                counter++;
            }
        }

        return counter;
    }

}
