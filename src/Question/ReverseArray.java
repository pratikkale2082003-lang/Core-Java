package Question;

public class ReverseArray {

	 public static void main(String[] args) {
		int arr [] = {4,5, 8,9,6};
		
		System.out.print("Reverse Array is : ");
		 for (int i = arr.length-1; i>=0; i--) {
			 System.out.print(arr[i] + " ");
		 }
	}
}
