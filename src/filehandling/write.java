package filehandling;

import java.io.File;
import java.io.FileWriter;

import java.io.IOException;
public class write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 File f = new File ("C:\\Users\\prati\\OneDrive\\Desktop\\c language\\write.txt");
		
		
		f.createNewFile();
		FileWriter fw = new FileWriter(f);
		fw.write("helloe");
	fw.close();
	
		
		System.out.println(" file is created Successfully");
		
		
		
	}

}
