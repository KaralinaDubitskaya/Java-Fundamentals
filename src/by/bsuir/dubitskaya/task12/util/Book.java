package by.bsuir.dubitskaya.task12.util;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

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

        Book book = (Book) obj;
        return  (Objects.equals(this.title, book.title) && Objects.equals(this.author, book.author) &&
        (this.price == book.price));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        double result = 1;
        result = prime * result + price;
        result = prime * result + edition;
        result = prime * result + title.hashCode();
        result = prime * result + author.hashCode();
        return (int) result;
    }

    @Override
    public String toString() {
        return getClass().getName() + "@title: " + title + ", author: " + author + ", price: " + price + ", edition: "
                + edition;
    }

    public static void setEdition(int edition) {
        if (edition <= 0) {
            throw new IllegalArgumentException("Edition should be positive number");
        }

        Book.edition = edition;
    }

    public static int getEdition() {
        return Book.edition;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }

        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public Book(String title, String author, int price) {
        if (title == null) {
            throw new IllegalArgumentException("Title shouldn't be null");
        }
        if (author == null) {
            throw new IllegalArgumentException("Author shouldn't be null");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }

        this.title = title;
        this.author = author;
        this.price = price;
    }
}
