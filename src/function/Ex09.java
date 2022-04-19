package function;

import java.util.Scanner;


public class Ex09 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      System.out.println("시간이랑 분출력 : ");
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
	      
	      System.out.printf("H : %d M : %d", H,M);
	      
	      
	      
	      sc.close();
	   }
	}
