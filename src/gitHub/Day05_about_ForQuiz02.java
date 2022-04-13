package gitHub;

public class Day05_about_ForQuiz02 {
	public static boolean funtion(int i) {
	      Boolean isPrimnumber = true;
	      
	         for(int j=2;j<i;j++) {
	            if(i % j ==0) {
	               isPrimnumber = false;
	            }
	         }
	      
	      return isPrimnumber;
	   }

	   public static void main(String[] args) {
//	      for문을 활용하여 다음 문제풀어주세요
//	      1) 1부터 100까지 한줄에 출력하세요
	      for(int i=1; i<=100; i++) {
	         System.out.print(i + " ");
	      }
	      System.out.println();
//	      2) A부터 Z까지 한줄에 출력하세요
	      for(int i=65; i<=90; i++) {
	         System.out.print((char)i + " ");
	      }
	      System.out.println();
	      
//	      3) 1부터 100사이의 정수중에서 7과 4의 공배수만 한줄에 출력하세요
	      for(int i=1; i<=100; i++) {
	         if(i % 28 ==0) {
	            System.out.print(i+" ");
	         }
	      }
	      System.out.println();
//	      4) 1부터 100사이의 정수중에서 소수(PrimeNumber)만 한줄에 출력하세요
	      
	      for(int i=0; i<100; i++) {
	         int j;
	         for(j=2;j<i;j++) {
	            if(i % j ==0) {
	               break;
	            }
	         }
	         if(i==j) {
	            System.out.print(i + " ");
	         }
	      
	      }
	      System.out.println();
//	      5) 4번을 활용하여 메서드를 만들어서 소수 판단하고 한주롤 출력하기
	      for(int i=2;i<100; i++) {
	         if(funtion(i)==true) {
	            System.out.print(i + " ");   
	         }
	      }
	   
	      
	      
	      
	      
	      
	      
	   }//메인함수
}
