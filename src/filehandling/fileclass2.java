package filehandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class fileclass2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 File f = new File ("C:\\Users\\prati\\OneDrive\\Desktop\\c language\\first.text");
		 
		 if(f.createNewFile()) {
			 
			 System.out.println("file is created");
		 }
		 else {
			 System.out.println("file is Already  created !");
		 }
	}

}
