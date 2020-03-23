package Grow.ProgrammingWithClasses.ClassesAndObjects.Task09;

import java.util.ArrayList;

public class BookHouse {
    ArrayList<Book> books;

    public BookHouse(ArrayList<Book> books) {
        this.books = books;
    }
    public void bookADD(String title, String author, String publishing, int publishYear, int numberOfPages, double price, String bindingType){
        books.add(new Book(title, author, publishing, publishYear, numberOfPages, price, bindingType));
    }

    public ArrayList<Book> getAuthorsBook(String author){
        ArrayList<Book> authors = new ArrayList<>();
        for (Book book : this.books){
            if (book.getAuthor().equalsIgnoreCase(author)){
                authors.add(book);
            }
        }
        return authors;
    }

    public ArrayList<Book> getPublishingBook(String publishing){
        ArrayList<Book> publishings = new ArrayList<>();
        for (Book book : this.books){
            if (book.getPublishing().equalsIgnoreCase(publishing)){
                publishings.add(book);
            }
        }
        return publishings;
    }

    public ArrayList<Book> getYearOfPublishing(int publishingYear){
        ArrayList<Book> yearOfPublishing = new ArrayList<>();
        for (Book book : this.books){
            if (book.getPublishYear() >= publishingYear){
                yearOfPublishing.add(book);
            }
        }
        return yearOfPublishing;
    }
    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
