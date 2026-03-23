package main.java.com.example.JDBC_SESSION8.exercise06;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final BookManager manager = new BookManager();

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            printMenu();
            int choice = readIntSafely();

            switch (choice) {
                case 1 -> handleAddBook();
                case 2 -> manager.displayBooks();
                case 3 -> handleRemoveBook();
                case 4 -> {
                    System.out.println("Đã thoát chương trình.");
                    running = false;
                }
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private static void handleAddBook() {
        System.out.print("Nhập tiêu đề: ");
        String title = scanner.nextLine();
        System.out.print("Nhập tác giả: ");
        String author = scanner.nextLine();
        System.out.print("Nhập ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        int year = readIntSafely();

        manager.addBook(new Book(title, author, isbn, year));
    }

    private static void handleRemoveBook() {
        System.out.print("Nhập ISBN sách cần xóa: ");
        String isbn = scanner.nextLine();
        manager.removeBook(isbn);
    }

    private static void printMenu() {
        String menu = """

                Chọn chức năng:
                1. Thêm sách
                2. Hiển thị sách
                3. Xóa sách
                4. Thoát
                """;
        System.out.print(menu);
    }

    private static int readIntSafely() {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
