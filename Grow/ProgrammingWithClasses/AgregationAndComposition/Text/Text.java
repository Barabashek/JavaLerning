package Grow.ProgrammingWithClasses.AgregationAndComposition.Text;

import java.util.ArrayList;
import java.util.List;

public class Text {

    private Word word;
    private List<Sentence> st;

    public Text(Word word, List<Sentence> st) {
        this.word = word;
        this.st = st;
    }

    public Text(Word word) {
        this.word = word;
    }

    public Text(Word word, Sentence sentence) {
        this.st = new ArrayList<>();
        this.st.add(sentence);
        this.word = word;
    }
    void addSentence(Sentence sentence){
        this.st.add(sentence);
    }
    void outputText(){
        this.st.forEach(sentence -> System.out.println(sentence));
    }
    void outputWord(){
        System.out.println(word);
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public Word getWord() {
        return word;
    }
}
