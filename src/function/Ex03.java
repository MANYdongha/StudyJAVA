package function;

public class Ex03 {
	 static int myperInt(String s) {
	      //문자열을 전달받아서 정수형태로 변경후 변환후 반환하는 정수
	      int ret = 0;
	      char[] arr = s.toCharArray(); //String을 char[]로 변환해서 반환
	      
	      for(int i =0; i<arr.length; i++) {
	         int num = arr[i] - 48;
	      //   ret *= 10;
	         ret += num;
	         //if(ret == 0) return ret;   //예외처리가되는가?
	         
	      }
	      
	      return ret;
	   }

	public static void main(String[] args) {
		// 함수는 호출하기 전에 먼저 정의 되어있어야  한다.
	      // 함수의 호출코드를 보면 어떻게 정의해야할지, 어떻게 정의되어 있을지 알 수 있다.
	      
	      int num = Integer.parseInt("1234");   //public static int parseInt(String s) 자료형을 정수로
	      System.out.println(num + 1);       
	      
	      int num2 = myperInt("1234");
	      System.out.println(num2 + 1);
	      
	      
	      int num3 = 11;
	      String str1 = Integer.toBinaryString(num3);   // 진볍을 변경하려면 무조건 String으로 해야한다.
	      System.out.println(str1);
	      
	      
	      int b = Integer.parseInt(str1, 8);         //Interger.parseInt(s,int num(몇진법인지 정수표현));
	      System.out.println(b);                  //으로 표현할 수 있다.
	      
	      
	      
	   
	      
	      
	      
	   }
	}
	//함수만들기