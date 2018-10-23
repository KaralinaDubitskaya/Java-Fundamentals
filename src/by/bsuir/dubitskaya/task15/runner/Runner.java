package by.bsuir.dubitskaya.task15.runner;

import by.bsuir.dubitskaya.task12.util.Book;
import by.bsuir.dubitskaya.task15.util.*;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Book.setEdition(1000);

        Book book1 = new Book("1984","George Orwell",10,"978-1-56619-909-4");
        Book book2 = new Book("Jane Eyre","Charlotte Bronte", 14, "978-1-4028-9462-6");
        Book book3 = new Book("Three Men in a Boat","Jerome K. Jerome", 15,"978-1-86197-876-9");
        Book book4 = new Book("The Picture of Dorian Gray", "Oscar Wilde",19,"9780136091813");
        Book book5 = new Book("The Picture of Dorian Gray", "O. Wilde",11,"978-0-1360-9181-3");
        Book book6 = new Book("The Picture of Dorian Gray", "Oscar Wilde",12,"978-0-1360-9181-3");

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        for (Book book : books) {
            System.out.println(book.toString());
        }

        System.out.println("Books sorted by title: ");
        books.sort(new BookTitleComparator());
        for (Book book : books) {
            System.out.println(book.toString());
        }

        System.out.println("Books sorted by title and author: ");
        books.sort(new BookTitleAuthorComparator());
        for (Book book : books) {
            System.out.println(book.toString());
        }

        System.out.println("Books sorted by author and title: ");
        books.sort(new BookAuthorTitleComparator());
        for (Book book : books) {
            System.out.println(book.toString());
        }

        System.out.println("Books sorted by author, title and price: ");
        books.sort(new BookAuthorTitlePriceComparator());
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
