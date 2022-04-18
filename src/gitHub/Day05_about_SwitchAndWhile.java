package gitHub;

import java.util.Scanner;

public class Day05_about_SwitchAndWhile {
	public static void main(String[] args) {
	      
	      //while과 switch ~ case를 이용한 전형적인 메뉴 구성
	      // 두정수의 덧셈을 처리하는 과정표현
	      
	      //1) 변수 선언
	      Integer n1 = null, n2 = null, answer, menu;
	      Scanner sc = new Scanner(System.in);
	      
	      //2)반복
	         while(true) {
	         //3)메뉴출력
	         System.out.println("1, n1입력");
	         System.out.println("2, n2입력");
	         System.out.println("3, 계산하여 답확인");
	         System.out.println("0, 종료");
	         System.out.println("선택 >>>");
	         menu = sc.nextInt();
	         
	      //4) menu를 swtich로 하여 case별로 코드 작성
	      switch (menu) {
	      case 1:
	         System.out.println("n1 입력 :");
	         n1 = sc.nextInt();
	         break;

	      case 2:
	         System.out.println("n2 입력 :");
	         n2 = sc.nextInt();
	         break;
	      case 3:
	         if(n1 == null || n2 == null) {
	            System.out.println("두정수를 먼저 입력해야합니다.");
	            n1 = sc.nextInt();
	            break ;
	         }
	         
	      case 4:
	         answer = n1 + n2;
	         System.out.printf("%d + %d = %d\n",n1,n2,answer);
	         break;
	      case 0:
	         System.out.println("프로그램을 종료합니다.");
	         sc.close();
	         return;
	      default :
	    	  System.out.println("잘못된입력입니다.");
	    	  continue;
	      }
	      System.out.println();
	      }
	   }
}
