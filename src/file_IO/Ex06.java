package file_IO;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		//프로그램의 데이터를 파일을 내보내기(출력)
		
		File f = new File("b.txt");
		
		if(f.exists() == false) { //만약 파일이 없으면
			f.createNewFile();	  //새로 만들어라
		}
		
		String word1 = "Hello";
		String word2 = "word !!";
		
		FileOutputStream fos = new FileOutputStream(f);
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		BufferedWriter bw =new BufferedWriter(osw);
		
		bw.write(word1 + "\n");	//출력버퍼에 데이터를 기록
		bw.write(word2 + "\n");	//출력버퍼에 데이터를 기록
		bw.flush();				//버퍼를 비운다 : 프로그램 -> 버퍼 -> 대상(파일)
		
		osw.append(word1 + "\n");
		osw.append(word2 + "\n");
		

		
	
		bw.close();
		osw.close();
		fos.close();
		
		
		
	}
}
