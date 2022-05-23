package file_IO;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		
		File f1 = new File("a.txt");
		File f2 = new File("c:\\newFolder");
		File f3 = new File("c:\\newFolder", "b.txt");
		File f4 = new File(f2, "c.txt");
		
//		new File(String name);						파일 혹은 폴더의 이름만 지정
//		new File(String parent, String chiled);		문자열로 경로와 이음을 지정
//		new File(file parent, String child);		파일 캑체(폴더)와 이름을지정
		
//		1) 자바프로그램에서 파일객체를 생성한다고 해서, 곧바로 파일이 생성되는 것이 아니다.
//		2) 자바의 파일 객체는 실제 여부와 상관이 없다.
//		3)파일클래스는 파일과 폴더(디렉토리) 개념을 모두포함한다.
//		4)경로를 지정할 때, 절대경로와 상대경로 구분법이 있다.
//		절대경로 : 어느 위치에서 지정해도 항상 같은 대상을 가리키는 방법(전체주소)
//		상대경로 : 현재 위치에 따라 가리키는 대상이 달라지는 방법(짧은 주소)		
		
		System.out.println("f1객체의 대상이 실제로 존재하는가 : " + f1.exists());
		System.out.println("f1객체의 대상이 실제로 존재하는가 : " + f2.exists());
		System.out.println("f1객체의 대상이 실제로 존재하는가 : " + f3.exists());
		System.out.println("f1객체의 대상이 실제로 존재하는가 : " + f4.exists());
		
		boolean b1 = f1.createNewFile(); //위치가 없거나, 디스크에 용량이 부족하거나 / 파일은 출력이다.
		boolean b2 = f2.mkdir();
		boolean b3 = f3.createNewFile(); // 지정한 위치에 파일 생성
		boolean b4 = f4.createNewFile(); 
				
		System.out.println("파일 생성 결과 :  " + b1);	//덮어쓰지 않는다. 그래서 다시 f5눌리면 false라고 함. 
		System.out.println("파일 생성 결과 :  " + b2);	//덮어쓰지 않는다. 그래서 다시 f5눌리면 false라고 함. 
		System.out.println("파일 생성 결과 :  " + b3);	//덮어쓰지 않는다. 그래서 다시 f5눌리면 false라고 함. 
		System.out.println("파일 생성 결과 :  " + b4);	//덮어쓰지 않는다. 그래서 다시 f5눌리면 false라고 함. 
		
		

		System.out.println("f1객체의 대상이 실제로 존재하는가 : " + f1.exists());
		System.out.println("f2객체의 대상이 실제로 존재하는가 : " + f2.exists());
		System.out.println("f2객체의 대상이 실제로 존재하는가 : " + f3.exists());
		System.out.println("f2객체의 대상이 실제로 존재하는가 : " + f4.exists());
		
		
		System.out.println("f1은 파일인가 :  " + f1.isFile());
		System.out.println("f2은 파일인가 :  " + f2.isFile());
		System.out.println("f3은 파일인가 :  " + f3.isFile());
		System.out.println("f4은 파일인가 :  " + f4.isFile());
		System.out.println();
		
		System.out.println("f1은 폴더인가? : " + f1.isDirectory());
		System.out.println("f2은 폴더인가? : " + f2.isDirectory());
		System.out.println("f3은 폴더인가? : " + f3.isDirectory());
		System.out.println("f4은 폴더인가? : " + f4.isDirectory());
		System.out.println();
		
		
		System.out.println("f1의 위치 : " + f1.toPath());
		System.out.println("f2의 위치 : " + f2.toPath());
		System.out.println("f3의 위치 : " + f3.toPath());
		System.out.println("f4의 위치 : " + f4.toPath());
		System.out.println();
		
		String[] arr2 = f2.list();
		System.out.println("f2폴더 하위 목록 : " + Arrays.toString(arr2));
		System.out.println();
		
		System.out.println("f3 : " + f3);  //toString이 오버라이딩 되어 있다.
		System.out.println("f3의 절대경로 : " + f3.getAbsolutePath());
		System.out.println("f3 : 파일이름(단독이름)" + f3.getName());
		System.out.println("f3의 크기 (byte) : " + f3.length());
		System.out.println("f3은 읽기 가능하는가 ? :"  +f3.canRead());
		System.out.println("f3은 쓰기 가능한가 ? : " + f3.canWrite());
		System.out.println("f3은 실행 가능한가 ? : " + f3.canExecute());
		
		File f5 = new File(f2,"b.txt"); // 이미있는 파일
		System.out.println("f5은 존재하는가 ? " + f5.exists());
		System.out.println("f1의 크기 : " + f1.length());
	}
}

