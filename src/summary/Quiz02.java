package summary;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
	      String str;
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.println("금액 입력: ");
	      str = sc.next();
	      int num =Integer.parseInt(str);
	      
	      //1)서식문자를 이용하여 출력
	      System.out.printf("1) %,d원\n",num);
	      
	      //2)함수를 만들어서 천단위 구분기호를 찍은 형태의 문자열로 만들기
	      String value = addComma(num);   //만약 scanner로 받은 정수가 짝수갯수이면 맨앞자리에 .가 분명 존재한다. 
	      if(value.charAt(0)==',') {      //그래서 if문을 써서 맨앞자리에 .가있다면 .이후부터 출력하는 subString함수를 사용하여 출력한다.
	         value = value.substring(1);
	      }
	      System.out.println("2) "+ value + "원");
	      
	   
	      
	      
	      sc.close();      
	   }

	   public static String addComma(int num) {
	      if(num!=0) {
	         int a = num/1000;                  //횟수 제한을 걸 임의변수를 설정 (자르고 난 앞자리를 재귀함수로 넘겨준다 그리고 num이 0이되면 종료)
//	         System.out.println("a: " + a);         
	         int tmp = num % 1000;               //문자열에 저장할 변수 설정(나머지를 빼서 문자열에 저장한다. )
//	         System.out.println(num);
//	         System.out.println("num: " + num);
	         String b;                     
	         if(num / 100 != 0) {               //100단위로 콤마를 찍기위여 원래 숫자에서 100을 나눠준다.
	         b =  ','+Integer.toString(tmp);         //만약 나눠서 몫이 0이 아니면 ,를 포함해서 더해준다.
	         
	         }
	         else {
	            
	         b = Integer.toString(tmp) ;            //원래 숫자에서 100을 나눠서 몫이 0 이될경우  
	         
	         }
	         
	         return addComma(a)  + b  ;
	      }
	      
	      else {
	            
	         return "";
	      
	      }
	   }
	}

