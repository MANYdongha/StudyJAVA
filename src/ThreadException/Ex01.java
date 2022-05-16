package ThreadException;

public class Ex01 {
	public static void main(String[] args) throws InterruptedException {
		for(int i=5; i !=-1; i--) {
			Thread.sleep(1000);
			System.out.println(i);
		}
		System.out.println("종료");
		
//		main()이 Thread.sleep()함수를 호출했다
//		호출하는 함수 main을 caller라고 하고
//		호출당하는 함수 sleep을 callee라고 한다.
//		throws는 callee가 예외처리 책임을 caller에게 전가하는 문법이다. 
//		->(전가) Thread.sleep()함수호출 -> main -> JVM -> 윈도우운영체제
	}
}
