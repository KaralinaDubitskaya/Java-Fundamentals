package by.bsuir.dubitskaya.task15.util;

import by.bsuir.dubitskaya.task12.util.Book;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BookTitleAuthorComparatorTest {

    @Test
    void compare() {
        Book book1 = new Book("The Picture of Dorian Gray", "Oscar Wilde",19,"9780136091813");
        Book book2 = new Book("1984","George Orwell",10,"978-1-56619-909-4");
        Book book3 = new Book("Jane Eyre","Charlotte Bronte", 14, "978-1-4028-9462-6");
        Book book4 = new Book("Three Men in a Boat","Jerome K. Jerome", 15,"978-1-86197-876-9");
        Book book5 = new Book("The Picture of Dorian Gray", "O. Wilde",11,"978-0-1360-9181-3");
        Book book6 = new Book("The Ballad of Reading Gaol", "Oscar Wilde",12,"978-0-1360-9181-3");

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.sort(new BookTitleAuthorComparator());

        ArrayList<Book> result = new ArrayList<>();
        result.add(book2);
        result.add(book3);
        result.add(book6);
        result.add(book5);
        result.add(book1);
        result.add(book4);

        assertEquals(result, books);
    }
}