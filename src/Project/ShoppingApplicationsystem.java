package Project;

import java.util.Scanner;

public class ShoppingApplicationsystem {

    public static void main(String[] args) {

        System.out.println("=========== Shopping Application ===========");

        System.out.println("1. Laptop  - 30000 Rs");
        System.out.println("2. iPhone  - 120000 Rs");
        System.out.println("3. T-Shirt - 1800 Rs");
        System.out.println("4. TV      - 11000 Rs");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        String product = "";
        double price = 0;

        if (choice == 1) {
            product = "Laptop";
            price = 30000;
        } 
        else if (choice == 2) {
            product = "iPhone";
            price = 120000;
        } 
        else if (choice == 3) {
            product = "T-Shirt";
            price = 1800;
        } 
        else if (choice == 4) {
            product = "TV";
            price = 11000;
        } 
        else {
            System.out.println("Invalid Choice!");
            sc.close();
            return;
        }

        System.out.println("You Selected: " + product);

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        double totalPrice = price * qty;
        double discount = 0;

        if (totalPrice > 50000) {
            discount = totalPrice * 0.05; // 5%
            System.out.println("Congratulations! You got 5% Discount.");
        }

        double finalPrice = totalPrice - discount;

        System.out.println("\n=========== BILL ===========");
        System.out.println("Product Name : " + product);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + qty);
        System.out.println("Total Price  : " + totalPrice);
        System.out.println("Discount     : " + discount);
        System.out.println("Final Price  : " + finalPrice);

        sc.close();
    }
}