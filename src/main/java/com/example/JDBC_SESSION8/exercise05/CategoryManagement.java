package main.java.com.example.JDBC_SESSION8.exercise05;

import java.util.Arrays;
import java.util.Optional;

public class CategoryManagement implements ICRUD {
    private Category[] categories = new Category[0];

    @Override
    public Category[] findAll() {
        return categories;
    }

    @Override
    public void addCategory(Category category) {
        int currentSize = categories.length;
        categories = Arrays.copyOf(categories, currentSize + 1);
        categories[currentSize] = category;
        System.out.println("Đã thêm danh mục: " + category);
    }

    @Override
    public void updateCategory(Category category) {
        findById(category.getId()).ifPresentOrElse(existingCategory -> {
            existingCategory.setName(category.getName());
            existingCategory.setDescription(category.getDescription());
            System.out.println("Đã cập nhật danh mục: " + existingCategory);
        }, () -> System.out.println("Không tìm thấy danh mục với ID: " + category.getId()));
    }

    @Override
    public void deleteById(int id) {
        boolean exists = Arrays.stream(categories).anyMatch(c -> c.getId() == id);
        if (!exists) {
            System.out.println("Danh mục không tồn tại!");
            return;
        }

        categories = Arrays.stream(categories).filter(c -> c.getId() != id).toArray(Category[]::new);

        System.out.println("Danh mục đã được xóa.");
    }

    private Optional<Category> findById(int id) {
        return Arrays.stream(categories)
                .filter(c -> c.getId() == id)
                .findFirst();
    }
}
