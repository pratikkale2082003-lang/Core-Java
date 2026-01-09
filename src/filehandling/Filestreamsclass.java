package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filestreamsclass {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\prati\\OneDrive\\Desktop\\Documents\\new.txt");

//		 int n =5;
		 
		 char ch = '9';
		 String name = "Fortune cloud";
		 
		 FileOutputStream fos = new FileOutputStream(f);
		 
		 fos.write(name.getBytes());
		 fos.write(ch);
//		 fos.write(n);
		 fos.close();
		 System.out.println("File is writted Suceffuly ");
		 
		 FileInputStream fis = new FileInputStream(f);
		 
		 
		  int i;
		 char[] ch2 = new char[500];
		 
		  while((i=fis.read())!=-1) {
			  
			   System.out.print((char)i);
		  }
		  
		 
		 
		 
		fis.close(); 
		 
		 
		 
	}

}
