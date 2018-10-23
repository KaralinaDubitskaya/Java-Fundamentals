package by.bsuir.dubitskaya.task12.runner;

import by.bsuir.dubitskaya.task12.util.Book;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Book.setEdition(1000);

        Book book1 = new Book("1984","George Orwell",10,"978-1-56619-909-4");
        Book book2 = new Book("Jane Eyre","Charlotte Bronte", 14, "978-1-4028-9462-6");
        Book book3 = new Book("Three Men in a Boat","Jerome K. Jerome", 15,"978-1-86197-876-9");
        Book book4 = new Book(" The Picture of Dorian Gray", "Oscar Wilde",9,"9780136091813");
        Book book5 = new Book(" The Picture of Dorian Gray", "O. Wilde",11,"978-0-1360-9181-3");

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        for (Book book : books) {
            System.out.println(book.toString());
        }

        System.out.println("Book 1 and 2 are " + (book1.equals(book2) ? "" : "not ") + "equal");

        System.out.println("Book 1 hash code: " + book1.hashCode());
        System.out.println("Book 2 hash code: " + book2.hashCode());
        System.out.println("Book 3 hash code: " + book3.hashCode());
        System.out.println("Book 4 hash code: " + book4.hashCode());
        System.out.println("Book 5 hash code: " + book5.hashCode());

        System.out.println("Book 1 to book 2 compare result: " + book1.compareTo(book2));
        System.out.println("Book 2 to book 1 compare result: " + book2.compareTo(book1));
        System.out.println("Book 4 to book 5 compare result: " + book4.compareTo(book5));
    }
}
