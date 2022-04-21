package function;

import java.util.Scanner;

//45분 일찍 자동으로 맞춰지는 알람시계

public class Ex09 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      System.out.println("시간입력 : ");
	      System.out.println("분입력 : ");
	      int H = sc.nextInt();
	      int M = sc.nextInt();
	       
	      
	      M -= 45;
	      if(M<0) {
	         H-=1;
	         M+=60;
	         
	      }
	      
	      if(H<0) {
	         H+=24;
	      }
	      
	      System.out.printf("%d시 %d분에 모닝콜 해줍니다.", H,M);
	      
	      
	      
	      sc.close();
	   }
	}
