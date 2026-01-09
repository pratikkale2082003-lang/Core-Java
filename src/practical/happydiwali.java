package practical;

public class happydiwali {

	public static void main(String[] args) {
	 
		        int row = 5;
		        int col = 20;  // Total columns of frame

		        for (int i = 1; i <= row; i++) {
		            for (int j = 1; j <= col; j++) {

		            if (i == 1 || i== row || j ==1 ||j ==col) {
		            	 System.out.print("*");
		                }
		            else if (i == 3 && j == 5) {
		            	
		            	System.out.print("Happy Diwali");
		            	j += 11;
		            }
		            else {
		            	System.out.print(" ");
		            }
		            }
		             System.out.println();
		            }
		        }
	}