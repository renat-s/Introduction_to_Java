package programming_with_classes.agregation_and_composition.Task_1;

import programming_with_classes.agregation_and_composition.Task_1.entity.Sentence;
import programming_with_classes.agregation_and_composition.Task_1.entity.Text;
import programming_with_classes.agregation_and_composition.Task_1.entity.Word;
import programming_with_classes.agregation_and_composition.Task_1.service.SentenceLogic;
import programming_with_classes.agregation_and_composition.Task_1.service.TextLogic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Word> sentence = new ArrayList<>();

        sentence.add(new Word("Hello"));
        sentence.add(new Word("Word!!!"));

        Sentence s = new Sentence(sentence);

        SentenceLogic.printSentence(s);

        SentenceLogic.addWord(new Word("again..."), s);

        SentenceLogic.printSentence(s);

        ArrayList<Word> sentence2 = new ArrayList<>();
        sentence2.add(new Word("It's"));
        sentence2.add(new Word("to"));
        sentence2.add(new Word("hard"));
        sentence2.add(new Word("to"));
        sentence2.add(new Word("be"));
        sentence2.add(new Word("lizard..."));
        Sentence s2 = new Sentence(sentence2);

        ArrayList<Word> headArr = new ArrayList<>();
        headArr.add(new Word("Be"));
        headArr.add(new Word("your"));
        headArr.add(new Word("Demon."));

        Sentence head = new Sentence(headArr);

        Text text = new Text(head);

        TextLogic.addSentence(text, s);
        TextLogic.addSentence(text, s2);
        TextLogic.printTextHead(text);
        TextLogic.printText(text);
    }
}
