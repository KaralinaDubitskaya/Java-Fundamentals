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
        final int prime = 31;
        double result = 1;
        result = prime * result + level;
        result = prime * result + language.hashCode();
        result = prime * result + super.hashCode();
        return (int) result;
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

    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        if ((language == null) || language.isEmpty()) {
            throw new IllegalArgumentException("Language shouldn't be empty");
        }

        this.language = language;
        this.level = level;
    }
}
