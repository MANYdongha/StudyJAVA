package loop;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		int space = 2; 
	      int star =1;
	      int length;
	      // 코드가 더 직관적으로 볼 수 있음
	      Scanner sc = new Scanner(System.in);
	      
	      
	      while(true){                  //while 문으로 입력을 받을때 홀수만 받을 수 있게 안전장치 
	         System.out.println("길이입력 : ");
	         length = sc.nextInt();
	         if(length % 2 !=0 ) {         //홀수만 받을 수 있는 구문
	            break;
	         }
	         System.out.println("홀수로 길이를 다시 정해주시기 바랍니다!");
	      }
	      

	      space = length / 2;               //입력받은 길이를 반으로 나눠서 공백을 대칭되게 만들어준다.  
	      
	      for(int i=0; i<length; i++) {      //공백
	         for(int j=0; j<space; j++) {
	            System.out.print("  ");
	         }
	         for(int j=0; j<star; j++) {      //실제별
	            System.out.print("* ");
	         }
	         for(int j=0; j<space; j++) {   //공백
	            System.out.print("  ");
	         }
	         System.out.println();   
	         if(i<length/2) {            //전위의 공백
	         space -=1;
	         star +=2;
	         }
	         else {                     //후위의 공백
	            space +=1;
	            star -=2;
	         }
	      }
	      System.out.println();
	sc.close();
	}
}
