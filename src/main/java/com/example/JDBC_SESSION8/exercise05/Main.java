package main.java.com.example.JDBC_SESSION8.exercise05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final CategoryManagement manager = new CategoryManagement();

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            printMenu();
            System.out.print("Nhập lựa chọn: ");
            int choice = readIntSafely();

            // Sử dụng Enhanced Switch (Java 14+) - Cú pháp mũi tên, không cần 'break'
            switch (choice) {
                case 1 -> handleAdd();
                case 2 -> handleDisplay();
                case 3 -> handleUpdate();
                case 4 -> handleDelete();
                case 5 -> {
                    System.out.println("Đã thoát chương trình.");
                    isRunning = false;
                }
                default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại!");
            }
        }
    }

    private static void handleAdd() {
        System.out.print("Nhập ID danh mục: ");
        int id = readIntSafely();
        System.out.print("Nhập tên danh mục: ");
        String name = scanner.nextLine();
        System.out.print("Nhập mô tả danh mục: ");
        String description = scanner.nextLine();

        manager.addCategory(new Category(id, name, description));
    }

    private static void handleDisplay() {
        System.out.println("Danh sách danh mục:");
        var list = manager.findAll();
        if (list.length == 0) {
            System.out.println("Danh sách trống.");
            return;
        }
        // Dùng Stream thay cho vòng lặp for (Giống array.forEach() trong TS)
        Arrays.stream(list).forEach(System.out::println);
    }

    private static void handleUpdate() {
        System.out.print("Nhập ID danh mục cần cập nhật: ");
        int id = readIntSafely();
        System.out.print("Nhập tên mới: ");
        String name = scanner.nextLine();
        System.out.print("Nhập mô tả mới: ");
        String description = scanner.nextLine();

        manager.updateCategory(new Category(id, name, description));
    }

    private static void handleDelete() {
        System.out.print("Nhập ID danh mục cần xóa: ");
        int id = readIntSafely();
        manager.deleteById(id);
    }

    private static void printMenu() {
        // Dùng Text Blocks (Java 15+) giống Template Literals (``) trong JS/TS
        String menu = """

                Menu:
                1: Thêm danh mục
                2: Hiển thị danh mục
                3: Cập nhật danh mục
                4: Xóa danh mục
                5: Thoát
                """;
        System.out.print(menu);
    }

    /**
     * Xử lý lỗi trôi lệnh (Scanner bug)
     */
    private static int readIntSafely() {
        try {
            int val = Integer.parseInt(scanner.nextLine().trim());
            return val;
        } catch (NumberFormatException e) {
            return -1; // Trả về giá trị invalid
        }
    }
}
