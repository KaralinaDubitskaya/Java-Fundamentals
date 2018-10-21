package by.bsuir.dubitskaya.task13.runner;

import by.bsuir.dubitskaya.task13.util.ProgrammerBook;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ProgrammerBook.setEdition(1000);

        ProgrammerBook book1 = new ProgrammerBook("Clean Code","Robert C. Martin", 14,
                                                    "English", 3, "978-1-4028-9462-6");
        ProgrammerBook book2 = new ProgrammerBook("Code Complete","Steve McConnell", 15,
                                                    "English",4,"978-1-86197-876-9");
        ProgrammerBook book3 = new ProgrammerBook("Java. Эффективное программирование", "Джошуа Блох",
                                                    9, "Russian", 3,"9780136091813");
        ProgrammerBook book4 = new ProgrammerBook("Чистый код", "Роберт Мартин",9,
                                                    "Russian", 3,"9781402894626");

        ArrayList<ProgrammerBook> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        for (ProgrammerBook book : books) {
            System.out.println(book.toString());
        }

        System.out.println("Book 1 and 2 are " + (book1.equals(book2) ? "" : "not ") + "equal");

        System.out.println("Book 1 hash code: " + book1.hashCode());
        System.out.println("Book 2 hash code: " + book2.hashCode());
        System.out.println("Book 3 hash code: " + book3.hashCode());
        System.out.println("Book 4 hash code: " + book4.hashCode());

        System.out.println("Book 1 to book 2 compare result: " + book1.compareTo(book2));
        System.out.println("Book 2 to book 1 compare result: " + book2.compareTo(book1));
        System.out.println("Book 1 to book 4 compare result: " + book1.compareTo(book4));
    }
}
