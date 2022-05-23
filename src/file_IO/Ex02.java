package file_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) throws FileNotFoundException {
		String path = "C:\\windows\\system32\\drivers\\etc";
		File dir = new File(path);
		
		System.out.println("dir이 존재하는가 : " + dir.exists());
		System.out.println("dir이 디렉토리인가 : " + dir.isDirectory());

		
		File f = new File(dir, "hosts");
		System.out.println("f가 존재하는가 : " + f.exists());
		System.out.println("f가 파일인가 : " + f.isFile());
		System.out.println("f가 읽기 가능한가 : " + f.canRead());
		
		Scanner sc = new Scanner(f);
		String data = "";
		
		while(sc.hasNextLine()) {
			data += sc.nextLine() + "\n";
		}
		System.out.println(f + "의 내용");
		System.out.println(data);
		System.out.println("끝");
		sc.close();
		
	}
}

