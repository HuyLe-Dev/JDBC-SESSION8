package main.java.com.example.JDBC_SESSION8.exercise05;

public interface ICRUD {
    Category[] findAll();

    void addCategory(Category category);

    void updateCategory(Category category);

    void deleteCategory(int id);
}
