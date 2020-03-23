package Grow.ProgrammingWithClasses.AgregationAndComposition.Text;

// Создать объект класса Текст, используя классы Предложение, Слово.
// Методы: дополнить текст, вывести на консоль текст, заголовок текста.

public class Word {
    private String someWord;

    public Word(String someWord) {
        this.someWord = someWord;
    }

    public String toString(){
        return someWord;
    }

    public String getSomeWord() {
        return someWord;
    }

    public void setSomeWord(String someWord) {
        this.someWord = someWord;
    }
}
