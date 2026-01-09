package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class filereader {

	public static void main(String[] args) throws FileNotFoundException {
		
		File  f = new File("C:\\Users\\prati\\OneDrive\\Desktop\\c language\\write.txt");
		Scanner sc = new Scanner(f);
		
		while(sc.hasNext()) {
			String  d = sc.nextLine();
			System.out.println(d);
		}
		 sc.close();
	}

}
