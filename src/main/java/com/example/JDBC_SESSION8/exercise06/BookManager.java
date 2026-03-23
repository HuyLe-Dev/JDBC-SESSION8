package main.java.com.example.JDBC_SESSION8.exercise06;

import java.util.Arrays;

public class BookManager implements IBookManager {
    private Book[] books = new Book[0];

    @Override
    public void addBook(Book book) {
        int currentSize = books.length;
        books = Arrays.copyOf(books, currentSize + 1);
        books[currentSize] = book;
        System.out.println("Đã thêm sách: " + book.getDetails());
    }

    @Override
    public void removeBook(String isbn) {
        // Java. Phải dùng .equals()
        boolean exists = Arrays.stream(books).anyMatch(b -> b.getIsbn().equals(isbn));
        if (!exists) {
            System.out.println("Không tìm thấy sách với ISBN: " + isbn);
            return;
        }

        // Dùng Stream lọc bỏ sách có ISBN trùng khớp
        books = Arrays.stream(books)
                .filter(b -> !b.getIsbn().equals(isbn))
                .toArray(Book[]::new);

        System.out.println("Đã xóa sách với ISBN: " + isbn);
    }

    @Override
    public void displayBooks() {
        if (books.length == 0) {
            System.out.println("Danh sách trống.");
            return;
        }
        System.out.println("Danh sách sách:");
        Arrays.stream(books)
                .map(Book::getDetails) // Giống array.map(b => b.getDetails()) trong TS
                .forEach(System.out::println);
    }
}
