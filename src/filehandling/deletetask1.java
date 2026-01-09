package filehandling;

import java.io.File;

public class deletetask1 {

	public static void main(String[] args) {

		File f = new File("C:\\JAVA+DSA\\16. Strings\\class2.txt");
		
		
		if (f.delete()) {
			System.out.println("File is deleted");
		}
		else {
			System.out.println("File  is already  deleted");
		}
	}

}
