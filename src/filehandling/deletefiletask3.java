package filehandling;

import java.io.File;
import java.io.IOException;

public class deletefiletask3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 File f = new File("C:\\Users\\prati\\OneDrive\\Desktop\\Documents\\class4.text");
		// f.createNewFile();
		  if (f.delete()) {
			  System.out.println("File is Deleted");
		  }
		  else {
			  System.out.println("File is  does not a deleted");
		  }
		   if (f.exists()) {
			   System.out.println(" file is exits");
		   }
		   System.out.println("file does not exits " + f.exists());
		 
	}

}
