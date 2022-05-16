package ThreadException;

public class Ex03 {
	public static void main(String[] args) {
		//Thread : 자바에서 여러 코드의 동시실행을 하기 위해  사용하는 클래스
		//Runnable: Thread에 필요한 public void run() 메서드를 포함하는 인터페이스
		
		//특정 클래스가 Thread를 상속하거나, Runnable을 구현하게 하면 동시실행이 가능해진다.
		//class A extends Thread : run()을 오버라이딩하고, start()를 호출하면 된다.
		//class B implements Runnable : run()을 오버라이딩하고, Thread의 생성자 매개변수에 전달
		
		// *** Runnable은 추상메서드 run() 하나만 가지는 함수형 인터페이스이다 ***
		
		Runnable r1 = () -> {						//어떤걸 실행할지 먼저 만들어 둔다.
				for(int i=0; i<20; i++) {
					System.out.println(i + " ");
				}
		};
		
		Thread th1 = new Thread(r1);
		
		Thread th2 = new Thread(()->{
			for(char ch = 'a'; ch<'z'; ch++) {
				System.out.println(ch + " ");
			}	
		});
		
		th1.start();
		th2.start();
	}
}
