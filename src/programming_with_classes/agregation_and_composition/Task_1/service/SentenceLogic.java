package programming_with_classes.agregation_and_composition.Task_1.service;

import programming_with_classes.agregation_and_composition.Task_1.entity.Sentence;
import programming_with_classes.agregation_and_composition.Task_1.entity.Word;

public class SentenceLogic {
    public static void printSentence(Sentence sentence) {
        for (Word word:sentence.getSentence()) {
            System.out.print(word.getWord() + " ");
        }
        System.out.println();
    }

    public static void addWord(Word word, Sentence sentence) {
        sentence.getSentence().add(word);
    }

}
