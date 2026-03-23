package main.java.com.example.JDBC_SESSION8.exercise07;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer() {
        super();
        this.programmingLanguage = "Unknown";
    }

    public Developer(String id, String name, double salary, String programmingLanguage) {
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Ngôn ngữ: %s (Developer)", this.programmingLanguage);
    }
}