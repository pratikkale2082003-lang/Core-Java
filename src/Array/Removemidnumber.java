package Array;

public class Removemidnumber {
public static void main(String[] args) {
	int arr [][]  ={ 
			            {11,12,13,14},
                        {15,16,17,18},
                        {19,20,21,22},
                        {23,24,25,26}

 };
	
	 for (int i = 0; i < arr.length; i++) {
		 
		  for (int j = 0; j<arr[i].length; j++) {
			  
			   if (i == 0 || i == arr.length-1 ||
				   j == 0 || j == arr[i].length-1) {
				   System.out.print(arr[i][j] + " ");
				   
			   }
			   else {
				   System.out.print("   ");
			   }
		  }
			    System.out.println();
		  
	 }
}
}
