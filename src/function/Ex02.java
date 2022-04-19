package function;
//간단한 함수만들기
//1) 함수는 class 내부에 작성해야한다.
//2) 함수는 순서대로 
// [반환자료형] [함수이름] ([매개변수자료형] [변수이름]){
//    몸체, body, 함수내용
//
//
//
//return [반환값]
//
//}  
//의 형태로 정의한다.
//3) 정의된 함수를 다른곳으로 불러서 수행하는 것을 호출이라한다.
//4) 함수를 호출하고 나면 그자리에 반환값이 돌아온다.
//5) 메인함수에서 객체를 통하지 않고 호출할 수있는 함수 static속성을 가져야한다.


public class Ex02 {
	static int f(int x) {
	      int y = 2 * x + 3;
	      return y;
	   } 
	   static int abs(int n) {   //매개변수, 넘어오는 값을 받는 변수, 이름은 같지않아도 된다.
	      // n = n1; // n1의 값을 n변수에 복사하여 저장한다.
	       
	      return n > 0 ? n : -n; //return 다음에는 변수, 연산식, 상수, 다른함수 모두가능 
	   }
	   static int add(int n1, int n2) {
	      int result = n1+n2;
	      return result;
	   }

	public static void main(String[] args) {
		 //코드실행시 가장 먼저 호출되는 함수이다.
	      //1) y = 2X + 3 
	      int x = 3;
	      int y = f(x);
	      System.out.println("y : " + y);
	      System.out.println();
	      
	      //2) 절대값을 반환하는 함수
	      int n1 = -35;
	      int n2 = 57;
	      int a1 = abs(n1);
	      int a2 = abs(n2);
	      System.out.println("a1 : " + a1);
	      System.out.println("a2 : " + a2);
	      System.out.println();
	      
	      //3) 두정수의 합을 반환하는 함수
	      int s1 = add(1,2);         //전달하는 값은 서로 다르지만
	      int s2 = add(2,4);         //전달하는 값의 개수와 자료형은 서로 같다.
	      int s3 = add(123,524);      //반환되는 값의 자료형도 서로같다.
	      System.out.println("s1 : " + s1);
	      System.out.println("s2 = " + s2);
	      System.out.println("s3 = " + s3);
	      
	      
	   
	}
	// end of main
}
//end of class, 컴파일 실행하면 클래스 전체 내용을 읽어들인 후 실행한다.
