package main.java.com.example.JDBC_SESSION8.exercise06;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int year;

    public Book(String title, String author, String isbn, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getDetails() {
        return String.format("Tiêu đề: %s, Tác giả: %s, ISBN: %s, Năm: %d",
                title, author, isbn, year);
    }
}
