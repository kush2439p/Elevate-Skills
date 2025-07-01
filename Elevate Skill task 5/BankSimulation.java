import java.util.ArrayList;
import java.util.List;

// Account class representing a bank account
class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private List<String> transactionHistory;

    // Constructor
    public Account(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with balance: " + initialBalance);
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: " + amount + " | New Balance: " + balance);
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrawn: " + amount + " | New Balance: " + balance);
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Display transaction history
    public void showTransactionHistory() {
        System.out.println("\nTransaction History for Account: " + accountNumber);
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}

// Main class to test the Account functionality
public class BankSimulation {
    public static void main(String[] args) {
        Account acc1 = new Account("123456789", "Kush Vyas", 5000);

        acc1.deposit(1500);
        acc1.withdraw(2000);
        acc1.withdraw(10000); // Should fail
        acc1.deposit(-500);   // Should fail

        System.out.println("\nFinal Balance: " + acc1.getBalance());
        acc1.showTransactionHistory();
    }
}
