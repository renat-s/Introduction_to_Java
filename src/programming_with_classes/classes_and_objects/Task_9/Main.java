package programming_with_classes.classes_and_objects.Task_9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BookLogic bookLogic = new BookLogic(new ArrayList<>());

        bookLogic.addBook("The Godfather","G.P. Putnam's Sons", "Mario Puzo", 1969, 500, 23, "Hard");
        bookLogic.addBook("Harry Potter and the Philosopher's Stone","Bloomsbury Publishing", "J. K. Rowling", 1997, 223,12, "Soft");
        bookLogic.addBook("Harry Potter and the Chamber of Secrets","Bloomsbury Publishing", "J. K. Rowling", 1998, 251,14, "Hard");

        System.out.println("Список книг:");
        bookLogic.printAllBook();
        System.out.println();

        System.out.println("Список книг под авторством J. K. Rowling");
        bookLogic.printAuthors("J. K. Rowling");
        System.out.println();

        System.out.println("Список книг издательства Bloomsbury Publishing");
        bookLogic.printPublishingHouse("Bloomsbury Publishing");
        System.out.println();

        System.out.println("Список книг изданных после 1950 г.");
        bookLogic.printBookYear(1950);

    }

}
