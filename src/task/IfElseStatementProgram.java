package task;

import java.util.Scanner;

public class IfElseStatementProgram {

    public static void main(String[] args) {

        System.out.println("=============== Shopping Application ================");
        System.out.println("1. Laptop - 30000 Rs");
        System.out.println("2. iPhone - 120000 Rs");
        System.out.println("3. T-Shirt - 1800 Rs");
        System.out.println("4. TV - 11000 Rs");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        String product = "";
        double price = 0;

        if (choice == 1) {

            product = "Laptop";
            price = 30000;

            System.out.println("You selected: " + product);

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();

            double totalPrice = price * qty;

            if (totalPrice > 50000) {

                double discount = totalPrice * 0.05; // 5% discount
                double finalPrice = totalPrice - discount;

                System.out.println("Eligible for 5% Discount");
                System.out.println("Total Price : " + totalPrice);
                System.out.println("Discount    : " + discount);
                System.out.println("Final Price : " + finalPrice);

            } else {

                System.out.println("Total Price : " + totalPrice);
                System.out.println("No Discount Applied");
            }
        }

        sc.close();
    }
}