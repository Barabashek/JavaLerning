package Grow.ProgrammingWithClasses.AgregationAndComposition.Text;

public class Sentence {

    private String someSentence;

    public Sentence(String someSentence) {
        this.someSentence = someSentence;
    }

    public String getSomeSentence() {
        return someSentence;
    }

    public void setSomeSentence(String someSentence) {
        this.someSentence = someSentence;
    }

    public String toString(){return someSentence;}
}
