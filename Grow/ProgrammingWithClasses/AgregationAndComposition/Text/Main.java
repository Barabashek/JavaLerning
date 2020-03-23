package Grow.ProgrammingWithClasses.AgregationAndComposition.Text;

public class Main {
    public static void main(String[] args) {
        Word word = new Word("Per fines boni et mali");
        String string = "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusantium doloremque\n"+
                        " laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis et quasi\n"+
                        " architecto beatae vitae dicta sunt, explicabo. Nemo enim ipsam voluptatem, quia voluptas sit,\n"+
                        " aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos, qui ratione\n"+
                        " voluptatem sequi nesciunt, neque porro quisquam est, qui dolorem ipsum, quia dolor sit,\n"+
                        " amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt,\n"+
                        " ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis\n"+
                        " nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur?";
        Sentence sentence = new Sentence(string);
        Text text = new Text(word, sentence);

        String string1 = "This book is about Hibernate; our focus is on using Hibernate as a provider of the\n" +
                "Java Persistence API. We cover basic and advanced features and describe some ways\n" +
                "to develop new applications using Java Persistence. Often, these recommendations\n" +
                "aren’t specific to Hibernate. Sometimes they’re our own ideas about the best ways to\n" +
                "do things when working with persistent data, explained in the context of Hibernate.";

        String string2 = "The best way to learn Hibernate isn’t necessarily linear. We understand that you\n" +
                "may want to try Hibernate right away. If this is how you’d like to proceed, skip to the\n" +
                "next chapter and set up a project with the “Hello World” example. We recommend\n" +
                "that you return here at some point as you go through this book; that way, you’ll be prepared\n" +
                "and have all the background concepts you need for the rest of the material.";

        text.addSentence(new Sentence(string1));
        text.addSentence(new Sentence(string2));

        text.outputWord();
        text.outputText();
    }
}
