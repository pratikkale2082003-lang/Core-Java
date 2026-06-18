package Question;

public class Unique_Array {

	
	    public static void main(String[] args) {

	        int arr[] = {1, 2, 3, 4, 5, 1, 2, 3};

	        int count;

	        for (int i = 0; i < arr.length; i++) {

	            count = 0;

	            for (int j = 0; j < arr.length; j++) {

	                if (arr[i] == arr[j]) {
	                    count++;
	                }
	            }
	        
	            if (count == 1) {
	                System.out.println(arr[i] + " is unique");
	            }
	            else {
	            	 System.out.println( arr[i] +" Duplicate Array ");
	            }
	        }
	    }
	}