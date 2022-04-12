package gitHub;

import java.util.ArrayList;
import java.util.Scanner;

public class Cay04_about_Control_Quiz5 {
	public static void main(String[] args) {
	      //정수의 합계구하기
	      //사용자에게 정수를 입력받아서 합계에 더하세요
	      //만약, 사용자가 0을 입력하면 더이상 더 하지않겠다는 신호로 판단하고 반복을 중지시킵니다.
	      //반복이 종료되고나면 지금까지 입력받은 모든 정수의 합계를 출력하세요
	      
	      Scanner sc = new Scanner(System.in);
	      System.out.println("정수입력 : ");
	      int num = 1;
	      int sum = 0;
	      ArrayList<Integer> list = new ArrayList<Integer>(); //내용물확인
	      
	      while(num!=0) {
	         
	         num =sc.nextInt();
	         sum += num; 
	         list.add(num);
	         
	      }
	      for(int a : list) {
	         System.out.println("sum에 저장된 숫자 : " + a );
	      }
	      for(int i = 0; i<list.size(); i++) {
	         System.out.println(list.get(i));
	      }
	      System.out.println("\n" + "총점수 :" + sum);
	      
	      sc.close();
	   }
	}