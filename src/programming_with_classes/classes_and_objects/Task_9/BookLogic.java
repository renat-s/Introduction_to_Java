package programming_with_classes.classes_and_objects.Task_9;

import java.util.ArrayList;

public class BookLogic {
    private ArrayList<Book> books;

    public BookLogic(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(String name, String publishingHouse, String author, int year, int numberOfPages, int cost,  String bindingType) {
        this.books.add(new Book(name, publishingHouse, author, year, numberOfPages, cost, bindingType));
    }

    public void printAllBook() {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    public void printAuthors(String author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book.toString());
            }
        }
    }

    public void printPublishingHouse(String publishingHouse) {
        for (Book book : books) {
            if (book.getPublishingHouse().equals(publishingHouse)) {
                System.out.println(book.toString());
            }
        }
    }

    public void printBookYear(int year) {
        for (Book book : books) {
            if (book.getYear() >= year) {
                System.out.println(book.toString());
            }
        }
    }

}
