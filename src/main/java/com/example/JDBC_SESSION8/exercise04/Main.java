package main.java.com.example.JDBC_SESSION8.exercise04;

public class Main {
    public static void main(String[] args) {
        // Dùng 'var' cho code gọn gàng, Type Inference sẽ tự hiểu đây là BankAccount
        var accountA = new BankAccount("A001", "Nguyễn Văn A", "0123456789");
        var accountB = new BankAccount("B001", "Nguyễn Văn B", "0987654321");

        // Nạp tiền vào tài khoản A
        accountA.deposit(1000);

        // Chuyển tiền từ A sang B (A rút ra, B nhận vào)
        double transferAmount = 300;

        try {
            accountA.withdraw(transferAmount); // Rút từ A
            accountB.deposit(transferAmount); // Nạp vào B
        } catch (Exception e) {
            System.out.println("Giao dịch thất bại: " + e.getMessage());
        }

        // Hiển thị kết quả
        accountA.displayBalance();
        accountB.displayBalance();
    }
}
