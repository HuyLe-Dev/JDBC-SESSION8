package main.java.com.example.JDBC_SESSION8.exercise06;

public interface IBookManager {
    void addBook(Book book);

    void removeBook(String isbn);

    void displayBooks();
}
