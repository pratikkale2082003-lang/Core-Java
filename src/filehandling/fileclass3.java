package filehandling;

import java.io.File;
import java.io.FileWriter;
//import java.io.FileNotFoundException;
import java.io.IOException;

public class fileclass3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 File f = new File ("C:\\Users\\prati\\OneDrive\\Desktop\\sql program\\class1.text");
		  if (f.exists()) {
			  FileWriter fw = new FileWriter(f);
				fw.write("helloe");
				fw.close();
			  System.out.println(" file is exits ");
		  }
		  else {
			  System.out.println( "file already exits");
		  }
	}

}
