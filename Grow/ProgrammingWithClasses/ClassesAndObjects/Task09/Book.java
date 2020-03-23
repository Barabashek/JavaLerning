package Grow.ProgrammingWithClasses.ClassesAndObjects.Task09;

//Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами
//и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

public class Book {
    private int id;
    String title;
    String author;
    String publishing;
    int publishYear;
    int numberOfPages;
    double price;
    String bindingType;

    private static int ID = 1;

    public Book(String title, String author, String publishing, int publishYear, int numberOfPages, double price, String bindingType) {
        this.id = ID++;
        this.title = title;
        this.author = author;
        this.publishing = publishing;
        this.publishYear = publishYear;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishing() {
        return publishing;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }
    @Override
    public String toString(){
        return  "Book {" +
                "id = " + id +
                "; title = " + title +
                "; author = " + author +
                "; year of publishing = " + publishYear +
                "; publishing = " + publishing +
                "; number of page = " + numberOfPages +
                "; price = " + price +
                "; binding type = " + bindingType + "}";
    }
}

