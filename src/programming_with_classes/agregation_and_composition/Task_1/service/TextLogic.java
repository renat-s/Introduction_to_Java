package programming_with_classes.agregation_and_composition.Task_1.service;

import programming_with_classes.agregation_and_composition.Task_1.entity.Sentence;
import programming_with_classes.agregation_and_composition.Task_1.entity.Text;

public class TextLogic {
    public static void printTextHead(Text text) {
        SentenceLogic.printSentence(text.getHead());
    }

    public static void addSentence(Text text, Sentence sentence) {
        text.getText().add(sentence);
    }

    public static void printText(Text text) {
        for (Sentence sentence:text.getText()) {
            SentenceLogic.printSentence(sentence);
        }
    }
}
