package strings_and_basics_of_text_processing.string_as_array;

public class Task_2 {
    public static void main(String[] args) {
        String word = "word";
        String letter = "letter";

        String str = "Say the word and you'll be free\n" +
                "Say the word and be like me\n" +
                "Say the word I'm thinking of\n" +
                "Have you heard the word is love?";
        System.out.println(str);
        System.out.println();
        System.out.println(changeWord(str, word,letter));
    }

    public static String changeWord(String str, String changeWord, String toChangeWord) {
        char[] strChar = str.toCharArray();
        char[] changeWordChar = changeWord.toCharArray();
        String newString = "";

        for (int i = 0; i < strChar.length; i++) {
            boolean flag = false;
            for (int j = 0; j < changeWordChar.length; j++, i++) {
                if (strChar[i] == changeWordChar[j]) {
                    flag = true;
                } else {
                    flag = false;
                    i -= j;
                    break;
                }
            }
            if (flag) {
                newString += toChangeWord;
                i--;
            } else {
                newString += strChar[i];
            }
        }
        return newString;
    }

}
