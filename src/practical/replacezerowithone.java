package practical;

public class replacezerowithone {

	public static void main(String[] args) {
		
		 int  arr [] = {0,1,0,0,1, 1};
		 System.out.println("before the replace 0 and 1 ");
		  for (int i = 0; i<arr.length; i++) {
			  System.out.print(arr[i] + " ");
		  }
		   System.out.println("\n----------------------------------------------------------------------------------------------");
for(int i =0; i<arr.length; i++) {
	 if(arr[i] ==0) {
		 
		  arr[i] = 1;
		  
	 }
	 
	 else {
		 arr[i] =0;
		 
	 }
}

System.out.println( "after the replacing 0 and 1 ");
 for(int i = 0; i<arr.length; i++) {
	 System.out.print(arr[i] + " ");
 }
	}

}
