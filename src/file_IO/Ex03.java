package file_IO;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("a.txt");
		Scanner sc = new Scanner(f);
		String data = "";
		
		while(sc.hasNextLine()) {
			data += sc.nextLine() + "\n";
		}
		System.out.println(data);
		sc.close();
		
		
		
	}
}

