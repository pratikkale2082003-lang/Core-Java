package Project;

import java.sql.*;
import java.util.*;

// Custom Exception for insufficient balance
class Insufficient1BalanceException extends Exception {
    public Insufficient1BalanceException(String msg) {
        super(msg);
    }
}

// Encapsulation class
class BankAccount8 {
    private String name;
    private int acc_no;
    private int balance;

    
//    constructor
    public BankAccount8(String name, int number, int balance) {
        this.name = name;
        this.acc_no = number;
        this.balance = balance;
    }

    public int getBalance() {  // get method
        return balance;
    }

    public int getAccNo() {
        return acc_no;
    }

    public String getName() {
        return name;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(int amount) throws Insufficient1BalanceException {
        if (amount > balance) {
            throw new Insufficient1BalanceException("Insufficient balance. Current balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        }
    }

    public void display() {
        System.out.println("\nAccount Holder: " + name);
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

// Database Handler Class (JDBC)
class BankDatabase {
    private static final String URL = "jdbc:postgresql://localhost:5432/bankaccount";
    private static final String USER = "postgres";
    private static final String PASS = "7733"; 

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }

    // Insert new account
    public void insertAccount(BankAccount8 acc) {
        String sql = "INSERT INTO account (acc_no, name, balance) VALUES (?, ?, ?)";
        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, acc.getAccNo());
            ps.setString(2, acc.getName());
            ps.setInt(3, acc.getBalance());
            ps.executeUpdate();
            System.out.println("✅ Account added to database.");
        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        }
    }

    // Update balance
    public void updateBalance(int accNo, int newBalance) {
        String sql = "UPDATE account SET balance = ? WHERE acc_no = ?";
        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, newBalance);
            ps.setInt(2, accNo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error updating balance: " + e.getMessage());
        }
    }

    // Display account
    public void displayAccount(int accNo) {
        String sql = "SELECT * FROM account WHERE acc_no = ?";
        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, accNo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("\n--- Account Details from Database ---");
                System.out.println("Account No: " + rs.getInt("acc_no"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Balance: " + rs.getInt("balance"));
            } else {
                System.out.println("No account found with number: " + accNo);
            }
        } catch (SQLException e) {
            System.out.println("Error fetching account: " + e.getMessage());
        }
    }
}

// Main class
public class BankManagementSystem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankDatabase db = new BankDatabase();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int number = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        int balance = sc.nextInt();

        BankAccount8 ob = new BankAccount8(name, number, balance);
        db.insertAccount(ob); // store in DB

        int choice;
        do {
            System.out.println("\nBank Management System Menu:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = sc.nextInt();
                    ob.deposit(depositAmount);
                    db.updateBalance(ob.getAccNo(), ob.getBalance());
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    try {
                        ob.withdraw(withdrawAmount);
                        db.updateBalance(ob.getAccNo(), ob.getBalance());
                    } catch (Insufficient1BalanceException e) {
                        System.out.println("Exception caught: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Current Balance: " + ob.getBalance());
                    break;

                case 4:
                    db.displayAccount(ob.getAccNo());
                    break;

                case 5:
                    System.out.println("Exiting... Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
