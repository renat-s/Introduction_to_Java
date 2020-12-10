package programming_with_classes.agregation_and_composition.Task_1.entity;

import java.util.ArrayList;

public class Text {
    private Sentence head;
    private ArrayList<Sentence> text;

    public Text() {
        text = new ArrayList<Sentence>();
    }

    public Text(Sentence head) {
        this.head = head;
        text = new ArrayList<Sentence>();
    }

    public Text(Sentence head, ArrayList<Sentence> text) {
        this.head = head;
        this.text = text;
    }

    public Sentence getHead() {
        return head;
    }

    public void setHead(Sentence head) {
        this.head = head;
    }

    public ArrayList<Sentence> getText() {
        return text;
    }

    public void setText(ArrayList<Sentence> text) {
        this.text = text;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((head == null) ? 0 : head.hashCode());
        result = prime * result + ((text == null) ? 0 : text.hashCode());

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

        Text other = (Text) obj;

        if (head == null) {
            if (other.head != null)
                return false;
        } else if (!head.equals(other.head))
            return false;

        if (text == null) {
            if (other.text != null)
                return false;
        } else if (!text.equals(other.text))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "Text [Заголовок = " + head + ", текст = " + text + "]";
    }
}
