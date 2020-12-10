package programming_with_classes.agregation_and_composition.Task_1.entity;

import java.util.ArrayList;

public class Sentence {
    private ArrayList<Word> sentence;

    public Sentence() {

    }

    public Sentence(ArrayList<Word> sentence) {
        this.sentence = sentence;
    }

    public ArrayList<Word> getSentence() {
        return sentence;
    }

    public void setSentence(ArrayList<Word> sentence) {
        this.sentence = sentence;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((sentence == null) ? 0 : sentence.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Sentence other = (Sentence) obj;

        if (sentence == null) {
            if (other.sentence != null)
                return false;
        } else if (!sentence.equals(other.sentence))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "Sentence [предложение = " + sentence + "]";
    }

}
