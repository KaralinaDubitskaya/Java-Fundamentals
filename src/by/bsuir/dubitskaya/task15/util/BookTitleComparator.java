package by.bsuir.dubitskaya.task15.util;

import by.bsuir.dubitskaya.task12.util.Book;

import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        if ((book1 == null) || (book2 == null)) {
            throw new IllegalArgumentException("Illegal argument: book shouldn't be null");
        }

        return book1.getTitle().compareTo(book2.getTitle());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }
        return getClass() == obj.getClass();
    }

    @Override
    public int hashCode() {
        return getClass().getName().hashCode();
    }

    @Override
    public String toString() {
        return getClass().getName();
    }
}
