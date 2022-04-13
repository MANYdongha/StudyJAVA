package gitHub;

import java.util.Scanner;

public class Day05_about_Switch {
	public static void main(String[] args) {
		
	
	 Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     
     switch (num) {
     case 1:
        System.out.println("하나");
        break;

     case 2:
        System.out.println("둘");
        break;
        
     case 3:
        System.out.println("셋");
        break;
        
     default:
        System.out.println("다른거");
     }
     System.out.println("종료");
     //종료
     //특정값(연산식 및 변수)을 switch로 저장,
     //자바의 switch는 문자열을 비교할 수 있다.(정수, 문자열 포함, 실수는 부동소수점 방식이므로 정확한 값을 찾기 힘들어서 포함 ㄴㄴ)
     
  
     sc.close();
	}
}
