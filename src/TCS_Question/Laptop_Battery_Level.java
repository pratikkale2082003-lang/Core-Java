package TCS_Question;

//Problem Statement (Easy Language)
//
//You are given:
//
//Meeting duration (time) → integer
//Laptop battery levels (array) → list of integers
//
//👉 You need to count how many laptops can run for the full meeting

//Input:
//duration = 3
//arr = [4, 5, 1, 2, 3]
//
//Output:
//3
import java.util.*;

public class Laptop_Battery_Level {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
         System.out.print("Enter Duration : ");
        // Input: meeting duration
        int duration = sc.nextInt();

        
         
        // Input: battery levels (unknown size)
        ArrayList<Integer> list = new ArrayList<>();

        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }

        int count = 0;

        // Logic
        for (int battery : list) {
            if (battery >= duration) {
                count++;
            }
        }

        // Output
        System.out.println(count);
    }
}