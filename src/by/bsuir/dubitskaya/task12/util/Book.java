package by.bsuir.dubitskaya.task12.util;

import java.util.Objects;

public class Book implements Cloneable, Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private static int edition;
    private String isbn;

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
        (this.price == book.price) && Objects.equals(this.isbn, book.isbn));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        double result = 1;
        result = prime * result + price;
        result = prime * result + edition;
        result = prime * result + title.hashCode();
        result = prime * result + author.hashCode();
        result = prime * result + isbn.hashCode();
        return (int) result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName()).append("@title: ").append(title).append(", author: ").append(author)
                .append(", price: ").append(price).append(", edition: ").append(edition).append(", isbn: ").append(isbn);
        return sb.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Book obj = null;
        obj = (Book) super.clone();
        obj.title = title;
        obj.author = author;
        obj.price = price;
        obj.isbn = isbn;
        return obj;
    }

    @Override
    public int compareTo(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Argument shouldn't be null");
        }

        int result = 0;
        long thisIsbn;
        long bookIsbn;
        try {
            thisIsbn = isbnToLong(this.isbn);
            bookIsbn = isbnToLong(book.isbn);
        } catch (IllegalArgumentException e) {
            throw e;
        }

        return Long.compare(thisIsbn, bookIsbn);
    }

    private long isbnToLong(String isbn) {
        if (!isIsbnCorrect(isbn)) {
            throw new IllegalArgumentException("Incorrect isbn: " + isbn);
        }

        isbn = isbn.replaceAll( "-", "" );
        try {
            return Long.parseLong(isbn);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid isbn: + isbn", e);
        }
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

    public String getIsbn() {
        return isbn;
    }

    private boolean isIsbnCorrect(String isbn)
    {
        if (isbn == null) {
            return false;
        }

        isbn = isbn.replaceAll( "-", "" );
        if (isbn.length() != 13) {
            return false;
        }

        try {
            int sum = 0;
            for (int i = 0; i < isbn.length() - 1; i++) {
                int digit = Integer.parseInt(isbn.substring(i, i + 1));
                sum += (i % 2 == 0) ? digit : digit * 3;
            }

            int checksum = 10 - (sum % 10);
            if (checksum == 10) {
                checksum = 0;
            }

            return checksum == Integer.parseInt(isbn.substring(isbn.length() - 1));
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public Book(String title, String author, int price, String isbn) {
        if (title == null) {
            throw new IllegalArgumentException("Title shouldn't be null");
        }
        if (author == null) {
            throw new IllegalArgumentException("Author shouldn't be null");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        if (!isIsbnCorrect(isbn)) {
            throw new IllegalArgumentException("Isbn is incorrect: " + isbn);
        }

        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }
}
