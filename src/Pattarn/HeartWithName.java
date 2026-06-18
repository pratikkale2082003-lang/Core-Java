package Pattarn;

import java.util.Scanner;

public class HeartWithName {
    public static void main(String[] args) {

    	 Scanner sc = new Scanner(System.in);
    	 System.out.print("Enter String : ");
        String name = sc.nextLine();
System.out.println();

        System.out.println("  ***     ***");
        System.out.println("******* *******");
        System.out.println("***************");
        System.out.printf("*** %7s ***%n", name);
        System.out.println(" *************");
        System.out.println("  ***********");
        System.out.println("    *******");
        System.out.println("      ***");
        System.out.println("       *");
    }
}