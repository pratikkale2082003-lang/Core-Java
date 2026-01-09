package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileclass {

	public static void main(String[] args) throws IOException {
	
		
		File f = new File("C:\\Users\\prati\\OneDrive\\Desktop\\thrusday.text");

		 f.createNewFile();
		 System.out.println("file is  created !");
		 System.out.println("canwrite : " + f.canWrite());
		 System.out.println("canRead : " + f.canRead());
		  
		  System.out.println("canexit : " + f.exists());
		  System.out.println(" candelete : " + f.delete());
		  System.out.println(" canAbsolute : " + f.getAbsolutePath());
		  System.out.println(" getname : " + f.getName());
		  System.out.println(" getpath: " + f.getPath());
		  System.out.println(" length: " + f.length());
		  System.out.println(" isfile: " + f.isFile());
		  System.out.println(" hidden: " + f.isHidden());
		  System.out.println(" rename: " + f.renameTo(f));
		  System.out.println(" totalspace: " + f.getTotalSpace());
		  
		  
	}

}
