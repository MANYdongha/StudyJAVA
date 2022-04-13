package gitHub;

public class Day04_about_Control_Quiz4 {
	public static void main(String[] args) {
	      //1) 본인의 이름을 문자열 변수에 저장하고 3회출력하세요.
	   
	      
	      String name = "홍길동";
	      int i=0 , sum=0, sum2=0, sum3=0;
	      
	      while(true) {
	         if(i < 3) {
	         System.out.println(name);
	         i++;
	         }
	         else {
	            break;
	         }
	      }   
	   /*
	      //2) 1부터 100 까지 정수의 합계를 구하고 출력하세여.
	      
	      for(int j = 0; j<101; j++) {
	         
	         sum+=j;
	         System.out.println(sum + "\n");
	         
	      }
	      System.out.println(sum);
	   */   
	      
	      
	      //3) 1부터 100사이의 정수 중, 홀수의 합과 짝수의 합을 별도로 출력하세요.
	      
	      for(int j = 0; j<99; j++) {
	   
	         sum+=j;
	         System.out.println("총합 : " + sum +"\n");
	         
	         if(j % 2 != 0){
	            sum2 += j;
	            
	         }
	         if(j % 2 == 0) {
	            sum3 += j;
	            
	         }
	         System.out.println("홀수총합 :" + sum2 +"\n");
	         System.out.println("짝수총합 :" + sum3 +"\n");
	      }
	      
	      
	      System.out.println("정수총합 : " + sum);
	      System.out.println("홀수 : "+ sum2 );
	      System.out.println("짝수 : "+ sum3 );
	      
	      

	      
	   
	   }
	}