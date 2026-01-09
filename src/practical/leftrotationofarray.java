package practical;

public class leftrotationofarray {

	public static void main(String[] args) {
		 int arr[]  = {57,82,64,91,30};
		 System.out.println("Before Left Rotation");
		  for (int j = 0; j<arr.length; j++) {
			  System.out.print(arr[j] + " ");
		  }
		   System.out.println("\n----------------------------------------------------------------------------------------------");
		    int temp =arr[0];
		    
for(int i =0; i<arr.length-1; i++) {
arr[i] = arr[i+1];

}
 arr[arr.length -1]= temp;
System.out.println( "After Left Rotatation  ");
for(int j = 0; j<arr.length; j++) {
	 System.out.print(arr[j] + " ");
}
	}

}
 