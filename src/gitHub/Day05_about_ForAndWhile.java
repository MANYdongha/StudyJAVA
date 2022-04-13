package gitHub;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Day05_about_ForAndWhile {
	public static void main(String[] args)throws Exception {
	      File f = new File("한국배우목록.txt");
	      Scanner sc = new Scanner(f);
	      ArrayList<String> list = new ArrayList<String>();
	      
	      while(sc.hasNextLine()) {//list에 읽고 입력
	         String name = sc.nextLine();
	         list.add(name);
	      }
	      list.sort(null); // 리스트 정렬
	      
	      for(int i = 0; i<list.size(); i++) {//출력준비
	         String name = list.get(i);
	         System.out.printf("%4d) %s\n", i, name);//출력
	         
	      }
	      System.out.println("출력끝!!");
	      sc.close();
	      
	   }
	}

