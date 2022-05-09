package abstractClass;


//인터페이스는 추상 클래스의 한 종류이다
//인터페이스의 모든 필드는 public static final 이다
//인터페이스의 모든 메서드는 public abstract 이다
//인터페이스는 생성자를 작성할 수 없다
//인터페이스는 extends 대신 implements 키워드로 상속을 처리한다
//인터페이스는 다중상속을 허용한다
//인터페이스의 상속은 '구현'이라는 말로 표현한다
//인터페이스는 추상 클래스의 한 종류 이면서 클래스이므로, 자료형으로 사용할 수 있다

interface Test1 {
	int x = 1;	// 자동으로 final 속성이 부여되기 때문에 초기값을 반드시 지정해야 한다
	public static final int y = 2;
	
	void method();	// 자동으로 abstract 속성이므로, 함수의 body를 작성할 수 없다
	public abstract void method2();
}

class Test2 implements Test1 { // extends 대신 implements 키워드로 처리한다

	@Override
	public void method() {
		// 인터페이스가 가지는 추상메서드를 모두 반드시 구현해야 한다
	}
	@Override
	public void method2() {
		
	}
}

public class Ex04 {
	public static void main(String[] args) {
		System.out.println(Test2.x);	// static이므로 객체 생성 이전에 값을 출력할 수 있다
		System.out.println(Test2.y);
//		Test2.x = 3;					// final이므로 값을 대입할 수 없다(변경 불가)
		
		Test2 ob = new Test2();
		ob.method();
		ob.method2();
		
//		인터페이스도 추상클래스이므로, 익명 내부 클래스를 활용한 객체 생성이 가능하다
		Test1 ob2 = new Test1() {
			@Override
			public void method2() {
				System.out.println(2);
			}
			@Override
			public void method() {
				System.out.println(1);
			}
		};
		ob2.method();
		ob2.method2();
	}
}
