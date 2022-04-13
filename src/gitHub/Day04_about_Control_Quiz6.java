package gitHub;

import java.util.Random;
import java.util.Scanner;

public class Day04_about_Control_Quiz6 {
	  public static void main(String[] args) {
	      //상대는 이미 답을 정해놨습니다.
	      //여러분이 입력해서 답을 맞춰보세요
	      
	      Random ran = new Random();
	      Scanner sc = new Scanner(System.in);
	      String eat=null;
	      String food=null;
	      String result1;
	      String result2;
	      String wantFood=null;
	      
	      String[] menu= {
	         "햄버거", "피자", "짜파게티", "치킨", "족발", "핫도그"
	      };
	      
	      int answer = ran.nextInt(menu.length);            //문자열을 통한 비교하는 방법
	      
	         for(int i = 0; i<menu.length; i++) {         //먼저 for문을 i변수를 사용하여 같은 int끼리 값을 맞춘다.
	            if(i == answer) {                     //만약같다면
	               food = menu[i];                     //food 변수에 menu i번째 문자열 값을 호출하여 food에 넣는다.
	            }
	         }
	         while(true) {                           //while문을 통하여 
	            System.out.println("뭐를 먹고싶어??");  
	            wantFood = sc.next();                  //문자열로 받아서 wantFood의 변수입력한 값을 저장한다.
	            if(wantFood.equals(food)){   
	               result1 = food;                     //equals 함수를 사용하여 wantFood와 food를 문자열로 비교한다. 
	                                             //그리고 어짜피 위에서 다비교가 끝나고 나와서 맞지만 혹시하나 햇갈릴 수 있으니 새로운 변수result1에 저장
	               break;                           //while문이므로 꼭 break!!!
	            }
	            else {
	               System.out.println("그건별로야..");      
	            }
	         }
	         System.out.println("그래 우리"+ result1 + "먹자");      //어 안맞을 수 있의니 새로운 변수 result에 저장한 값을 호출하며 마무리 result호출
	         
	      System.out.println("-----------------------------------------------------");
	      
	         while(true) {                           //while을 사용하기 위해 비교하는 값에 true를 써서 들어간다. 
	            System.out.println("머먹을래?");//입력받기      //입력받고
	            eat = sc.next();                     //eat맴버변수에 저장 (그래야 밖에서 값읗 호출할 수 있다.) 
	               if(menu[answer].equals(eat)){         //if를 사용하여 menu의 인덱스를 통하여 해당하는 값을 호출, 여기서 for문을 돌리지 않고 answer에 랜덤 정수를 
	                  result2 = menu[answer];
	                  break;                        //통하여 해당하는 인덱스의 값을 호출할 수 있다. 그리고 equals함수로 eat변수의 값과 비교해서 같으면 break
	                  }                           //햇갈리지 않게 새로운 변수를 사용하여 값을 저장하고 
	                     
	            }
	            System.out.println( result2 + "먹으러가자");   // result2라는 변수에서 값을 호출하며 끝
	            
	      sc.close();
	   }
	}