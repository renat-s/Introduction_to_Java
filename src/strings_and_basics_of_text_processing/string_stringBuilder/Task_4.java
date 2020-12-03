package strings_and_basics_of_text_processing.string_stringBuilder;

public class Task_4 {
    public static void main(String[] args) {

        String str = "информатика";
        System.out.println(str);
        System.out.println(makeWord(str));
    }

    public static String makeWord(String str) {
        String word = "";

        word = word.concat(String.valueOf(str.charAt(str.indexOf('т'))));
        word = word.concat(String.valueOf(str.charAt(str.indexOf('о'))));
        word = word.concat(String.valueOf(str.charAt(str.indexOf('р'))));
        word = word.concat(String.valueOf(str.charAt(str.indexOf('т'))));

        return word;
    }
}
