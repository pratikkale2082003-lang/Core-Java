package practical;

//   enter the key is find the index

// using linear search
import java.util.*;
public class index3 {

	public static void main(String[] args) {
	
		

		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter Size of Array : ");
		        int n = sc.nextInt();

		        int arr[] = new int[n];

		        System.out.println("Enter the Elements : ");
		        for (int i = 0; i < arr.length; i++) {
		            arr[i] = sc.nextInt();
		        }

		        System.out.print("Enter the number to Search : ");
		        int num = sc.nextInt();

		        boolean found = false;

		        for (int i = 0; i < arr.length; i++) {
		            if (num == arr[i]) {
		                System.out.println(num + " found at index: " + i);
		                found = true;
		                break;
		            }
		        }

		        if (!found) {
		            System.out.println(num + " not found in the array.");
		        }

		        sc.close();
		    }
		}

		