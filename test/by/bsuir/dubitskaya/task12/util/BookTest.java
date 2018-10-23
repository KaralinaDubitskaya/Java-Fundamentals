package by.bsuir.dubitskaya.task12.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void compareTo() {
        Book book1 = new Book("1984","George Orwell",10,"978-1-56619-909-4");
        Book book2 = new Book(" The Picture of Dorian Gray", "Oscar Wilde",9,"978-1-56619-909-4");
        Book book3 = new Book(" The Picture of Dorian Gray", "Oscar Wilde",9,"9780136091813");
        Book book4 = new Book(" The Picture of Dorian Gray", "Oscar Wilde",9,"9780136091813");
        Book book5 = new Book(" The Picture of Dorian Gray", "O. Wilde",11,"978-0-1360-9181-3");

        assertEquals(0, book3.compareTo(book4));
        assertEquals(0, book3.compareTo(book5));
        assertEquals(-1, book3.compareTo(book2));
        assertEquals(1, book2.compareTo(book3));
        assertEquals(0, book1.compareTo(book2));
        assertThrows(IllegalArgumentException.class, null);
    }
}