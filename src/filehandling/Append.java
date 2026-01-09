package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Append {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File f = new File("C:\\Users\\prati\\OneDrive\\Desktop\\Documents\\new.txt");
		FileWriter fw = new FileWriter(f,true);
		fw.write("bye");
		fw.close();
		System.out.println("file is Writted Suceffuly ");
		
	}

}
