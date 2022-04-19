package function;

public class Ex08 {
	//함수정의 
	   
	   //1) 반환자료형, 함수이름, 매개변수를 생각(결정)
	   
	   //2) 반환자료형에 맞는 변수를 지역변수로 선언하고 마지막줄까지 return
	   
	   //3) 중간코드에서 반환값 변수를 어떻게 적절하게 만들어줄 것 인가 에 대한 코드 작성
	   static int reverse(int n) {
	      int num = 0;
	      
	      
	      
	      
	      
	      return num;
	   }
	   public static void main(String[] args) {
		   int n1 = reverse(1234);
		   System.out.println(n1);         //4321
		      
		   int n2 = reverse(135792468);
		   System.out.println(n2);         //864297531
		      
		   
		   int num = 1234;
		   int num2 = 0;
		   int tmp = 0;
		   
		   System.out.println();

		   
		   while(true) {
		      if(num > 10) {
		         tmp += num;
		         break;
		      }
		      tmp += num2;
		      num /= 10;
		      num2 = num % 10; 
		      
		      
		      
		   }
		      System.out.println(tmp);
		   
		   }
		}