package Grow.ProgrammingWithClasses.ClassesAndObjects.Task09;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BookHouse bk = new BookHouse(new ArrayList<>());
        bk.bookADD("Thinking Java", "Bruce Eckel", "Prentice Hall", 2006, 1167, 150.50, "Hard cover");
        bk.bookADD("Java Effective", "Joshua Bloch", "Addison-Wesley", 2019, 453, 99.90, "Hard cover");
        bk.bookADD("Spring in Action", "Craig Walls", "Manning Publications Co.",2013,500 ,49.99,"Hard cover");
        bk.bookADD("PYTHON in easy steps", "Mike McGrath", "Publisher: In Easy Steps", 2013, 192, 35.45, "Soft cover");
        bk.bookADD("Python for kids", "Jason R. Briggs", "No Starch Press, Inc.", 2017, 302, 39.50, "Soft cover");

        System.out.println("Book by Jason R. Briggs");
        ArrayList<Book> booksAuthor = bk.getAuthorsBook("Jason R. Briggs");
        for (Book book : booksAuthor)
            System.out.println(book);

        System.out.println();
        System.out.println("Book published by Manning Publications Co.");
        ArrayList<Book> booksPublishing = bk.getPublishingBook("Manning Publications Co.");
        for (Book book : booksPublishing)
            System.out.println(book);

        System.out.println();
        System.out.println("Books released after 2013");
        ArrayList<Book> booksReleasedDate = bk.getYearOfPublishing(2013);
        for (Book book : booksReleasedDate)
            System.out.println(book);
    }
}
