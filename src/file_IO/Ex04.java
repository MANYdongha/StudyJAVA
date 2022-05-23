package file_IO;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {
	public static void main(String[] args) throws IOException {
		File f = new File("a.txt");
		
		FileInputStream fis = new FileInputStream(f);
		//파일대상으로 데이터를 입력받을 수 있는 스트림(통로)
		
		InputStreamReader isr = new InputStreamReader(fis);
		//읽어들이는 데이터 문자형태(2바이트씩) 
		
		BufferedReader br = new BufferedReader(isr);
		
		br.lines().forEach(line -> System.out.println(line));
		
		br.close();
		isr.close();
		fis.close();
				
		
		
	}
}