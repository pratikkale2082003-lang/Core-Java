package Exceptionhandling;

import java.util.Scanner;

// Custom exception
class InsufficientBalance extends Exception {
    public InsufficientBalance(String msg) {
        super(msg);
    }
}

// Bank account class
class BankAccount { // encapsulation
    private double bankBalance;

    // Proper constructor
    public BankAccount(double balance) {
        this.bankBalance = balance;
    }

//     getmethod 
    public double getBalance() {
        return bankBalance;
    }

    // Withdraw method that throws custom exception
    public void withdraw(double amount) throws InsufficientBalance {
        if (amount <= bankBalance) {
            bankBalance -= amount;
            System.out.println("Withdrawal successful! Remaining balance: ₹" + bankBalance);
        } else {
            throw new InsufficientBalance("Failed! Insufficient balance in your account.");
        }
    }
}

// Main class
public class bankbalanceTask{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount bank = new BankAccount(50000);

        System.out.println("Current balance: ₹" + bank.getBalance());
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        try {
            bank.withdraw(amount);
        } catch (InsufficientBalance e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        sc.close();
    }
}
