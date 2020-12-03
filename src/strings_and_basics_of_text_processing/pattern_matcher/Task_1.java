package strings_and_basics_of_text_processing.pattern_matcher;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task_1 {
    public static void main(String[] args) {
        String str = "Классы StringBuffer и StringBuilder в Java используются когда возникает необходимость " +
                "сделать много изменений в строке символов.\n" +
                "В отличие от строк, объекты типа StringBuffer и StringBuilder могут быть изменены снова и снова " +
                "оставляя после себя множество новых неиспользуемых объектов.\n" +
                "В Java StringBuilder был введен начиная с Java 5. Основное различие между StringBuffer и StringBuilder " +
                "является то, что методы StringBuilder не являются безопасными для потоков (несинхронизированные).\n" +
                "Рекомендуется использовать StringBuilder всякий раз, когда это возможно, потому что он быстрее, " +
                "чем StringBuffer в Java. Однако, если необходима безопасность потоков наилучшим вариантом являются " +
                "объекты StringBuffer.";

        int answer = choiceTask(str);

        if (answer == 1) {
            sortByParagraphs(str);
        }

        if (answer == 2) {
            sortByWords(str);
        }

        if (answer == 3) {
            sortByLexem(str);
        }

    }

    public static int choiceTask(String str) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите нужный вариант:\n"
                + "1) Отсортировать абзацы по количеству предложений.\n"
                + "2) Отсортировать слова в предложении по длине.\n"
                + "3) Отсортировать лексемы.");

        int answer = 0;
        boolean result = false;

        while (!result) {
            System.out.print("Введи свой ответ: ");
            answer = in.nextInt();
            if (answer < 1 || answer > 3) {
                System.out.println("Ответ должен быть от 1 до 3");
            } else {
                result = true;
            }
        }

        return  answer;
    }

    public static void sortByLexem(String str) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите символ: ");
        String letter = in.nextLine();

        String[] paragraphs = str.split("\n");
        for (String paragraph : paragraphs) {
            String[] sentences = splitSentence(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWords(sentence);

                for (int k = words.length - 1; k >= 0; k--) {
                    for (int m = 0; m < k; m++) {
                        int countRight = 0;
                        int countLeft = 0;
                        for (int n = 0; n < words[m].length(); n++) {
                            if (String.valueOf(words[m].charAt(n)).compareToIgnoreCase(letter) == 0) {
                                countLeft++;
                            }
                        }
                        for (int n = 0; n < words[m + 1].length(); n++) {
                            if (String.valueOf(words[m + 1].charAt(n)).compareToIgnoreCase(letter) == 0) {
                                countRight++;
                            }
                        }
                        if (countLeft < countRight) {
                            String tmp = words[m];
                            words[m] = words[m + 1];
                            words[m + 1] = tmp;
                        } else if (countLeft == countRight) {
                            String[] forCompare = {words[m], words[m + 1]};
                            Arrays.sort(forCompare);
                            words[m] = forCompare[0];
                            words[m + 1] = forCompare[1];
                        }
                    }
                }
                for (String word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void sortByWords(String str) {
        String[] sentence = splitSentence(str);

        for (String s : sentence) {
            String[] words = splitWords(s);
            s = "";
            int[] lengthWords = new int[words.length];

            for (int i = 0; i < lengthWords.length; i++) {
                lengthWords[i] = words[i].length();
            }

            for (int i = 0; i < lengthWords.length; i++) {
                for (int j = lengthWords.length - 1; j > i; j--) {
                    if (lengthWords[i] > lengthWords[j]) {
                        int tmpInt = lengthWords[i];

                        lengthWords[i] = lengthWords[j];
                        lengthWords[j] = tmpInt;

                        String tmpStr = words[i];
                        words[i] = words[j];
                        words[j] = tmpStr;
                    }
                }
                s = s + words[i] + " ";
            }
            System.out.println(s);
        }
    }


    public static void sortByParagraphs(String str) {
        String[] paragraphs = str.split("\n");
        int numberParagraphs = paragraphs.length;
        int[] lengthParagraphs = new int[numberParagraphs];

        for (int i = 0; i < lengthParagraphs.length; i++) {
            lengthParagraphs[i] = splitSentence(paragraphs[i]).length;
        }

        for (int i = 0; i < lengthParagraphs.length; i++) {
            for (int j = lengthParagraphs.length - 1; j > i; j--) {
                if (lengthParagraphs[i] > lengthParagraphs[j]) {
                    String tmpStr = paragraphs[i];
                    paragraphs[i] = paragraphs[j];
                    paragraphs[j] = tmpStr;

                    int tmpInt = lengthParagraphs[i];
                    lengthParagraphs[i] = lengthParagraphs[j];
                    lengthParagraphs[j] = tmpInt;
                }
            }
            System.out.println(paragraphs[i]);
        }
    }

    public static String[] splitWords(String str) {
        Pattern p = Pattern.compile("\\s*\\s|,|;|:");
        return p.split(str);
    }

    public static String[] splitSentence(String str) {
        Pattern p = Pattern.compile("\\.*[.!?]\\s*");
        return p.split(str);
    }
}
