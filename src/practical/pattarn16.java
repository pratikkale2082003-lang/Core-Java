package practical;
//hello rectangle 0 and 1
//
//01010101
//1      0
//0      1
//1      0
//01010101

public class pattarn16 {

public static void main(String[] args) {
	

	int n = 5;
	int m = 8;

	for (int i = 1; i <= n; i++) {
	    for (int j = 1; j <= m; j++) {
	        if (i == 1 || i == n || j == 1 || j == m) {
	            // border cells
	            if ((i+j )% 2 == 0)
	                System.out.print("0");
	            else
	                System.out.print("1");
	        } else {
	            // inner hollow space
	            System.out.print(" ");
	        }
	    }
	    System.out.println();
	}
}
}