import java.io.IOException;

class Books{
    String title;
    String author;
}

public class Training {
    public static void main(String[] args)throws IOException {

        Books[] myBooks = new Books[3];

        int x = 0;
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        myBooks[0].title = "Grape of Java";
        myBooks[1].title = "Java Gatsby";
        myBooks[2].title = "Java recipe book";

        myBooks[0].author = "Боб";
        myBooks[1].author = "Сью";
        myBooks[2].author = "Ян";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(", автор ");
            System.out.println(myBooks[x].author);
            x++;

        }
    }
}
