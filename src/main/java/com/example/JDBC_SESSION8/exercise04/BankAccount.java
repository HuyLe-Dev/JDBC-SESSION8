package main.java.com.example.JDBC_SESSION8.exercise04;

public class BankAccount implements IBank {
    private final String accountId;
    private final String userName;
    private final String phoneNumber;

    private double balance;

    public BankAccount(String accountId, String userName, String phoneNumber) {
        this.accountId = accountId;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.balance = 0.0; // Khởi tạo số dư mặc định là 0
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Số tiền nạp phải lớn hơn 0");
        }
        this.balance += amount;
        System.out.println("Đã nhận tiền: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Số tiền rút phải lớn hơn 0");
        }
        if (amount > this.balance) {
            throw new IllegalStateException("Số dư không đủ để thực hiện giao dịch");
        }
        this.balance -= amount;
        System.out.println("Đã rút tiền: " + amount);
    }

    public void displayBalance() {
        System.out.println("Số dư tài khoản (" + this.accountId + "): " + this.balance);
    }
}
