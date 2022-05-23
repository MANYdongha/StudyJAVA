package file_IO;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) throws IOException {
		
		File f = new File("d.txt");
		FileWriter fw = new FileWriter(f, true);	//(File file, boolean append)
//		FileWriter(f, boolean append);
//      append = true : 기존의 내용을 유지하고 뒤에 덧붙인다.
//		append = false : 기존 내용을 제거하고 새로 작성한다.
		
		fw.append("hello\n");
		fw.close();
		
		
		
		
		
		
		
	}
}
