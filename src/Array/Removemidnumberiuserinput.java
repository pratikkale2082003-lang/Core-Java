package Array;

import java.util.Scanner;

public class Removemidnumberiuserinput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[4][4];

        System.out.println("Enter 16 Elements:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Boundary Elements:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (i == 0 || i == arr.length - 1 ||
                    j == 0 || j == arr[i].length - 1) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}