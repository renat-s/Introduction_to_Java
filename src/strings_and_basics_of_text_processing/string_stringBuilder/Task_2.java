package strings_and_basics_of_text_processing.string_stringBuilder;

public class Task_2 {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Hello word 321. Today is  2020 years.");
        System.out.println(str);
        System.out.println(insertSymb('a', 'b', str));
    }

    public static StringBuilder insertSymb(char symb, char newSymb, StringBuilder str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symb) {
                i++;
                str.insert(i, newSymb);
            }
        }

        return str;
    }


}
