package by.bsuir.dubitskaya.task13.util;

import by.bsuir.dubitskaya.task12.util.Book;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        ProgrammerBook book = (ProgrammerBook) obj;
        return  (super.equals(obj) && Objects.equals(this.language, book.language) &&
                (this.level == book.level));
    }

    @Override
    public int hashCode() {
        return Objects.hash(level, language, super.hashCode());
    }

    @Override
    public String toString() {
        return super.toString() + ", language: " + language + ", level: " + level;
    }

    public int getLevel() {
        return level;
    }

    public String getLanguage() {
        return language;
    }

    public ProgrammerBook(String title, String author, int price, String language, int level, String isbn) {
        super(title, author, price, isbn);
        if ((language == null) || language.isEmpty()) {
            throw new IllegalArgumentException("Language shouldn't be empty");
        }

        this.language = language;
        this.level = level;
    }
}
