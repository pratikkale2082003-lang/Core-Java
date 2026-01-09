package practical;

public class copyarray {

	public static void main(String[] args) {
		int arr [] = {34,76,90,82,51};
		 int b [] = new int[arr.length];
		 
		  for(int i =0;  i<arr.length; i++) {
			  b[i] = arr[i];
		  }
		  
		  System.out.println("After copying this value  the array b is : ");
		  for(int j = 0; j<b.length; j++) {
			  System.out.print(b[j] + " ");
		  }
	}

}
