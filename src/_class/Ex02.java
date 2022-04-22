package _class;



//생성자 : 객체를 생성하고, 객체 생성 시 초기작동을 정의할 수 있는 특수한 함수
//생성자를 정의할 때는 반환형을 작성하지 않는다
//생성자는 항상 클래스의 이름과 동일한 이름을 가진다
//생성자도 함수이기 때문에, 함수 오버로딩이 적용된다
//같은 이름으로 여러개의 정의를 만들 수 있다 (함수 중복 정의)
class Pos {
	int x;
	int y;
	
	void show() {
		// 함수안에서는 멤버필드를 곧바로 참조할 수 있다
		System.out.println("x : " + x + ", y : " + y);
	}
	// 생성자를 작성하지 않았는데 어떻게 호출이 가능한가?
	// -> 클래스를 작성하면서 생성자를 정의하지 않으면, 
	//    컴파일 때 JVM이 자동으로 기본생성자를 만들어준다
	//    대신, 직접 작성하면 JVM이 자동으로 만들어주지 않는다
	
	Pos() {
		// 객체를 생성할 때 해당 객체 내부에 멤버 필드를 생성
		// 만들어진 함수를 연결시켜줌
		System.out.println("기본 생성자 호출 !!");
	}
	
//	Pos(int a, int b) {	// 생성자도 매개변수를 받을 수 있다
//		x = a;	// 외부에서 넘어온 매개변수의 값을 멤버 필드에 대입
//		y = b;	// 객체 생성 시 지정한 값을 멤버 필드의 초기값으로 지정
//		System.out.println("정수 2개를 처리하는 생성자 호출 !!");
//	}
	Pos(int x, int y) {	// 같은 이름의 지역변수, 멤버 필드가 있으면 가까운것을 참조
		this.x = x;	// this : 생성된 객체 자신을 가리키는 예약어
		this.y = y;
	}
}


public class Ex02 {
	public static void main(String[] args) {
		// 기본생성자 없이 매개변수 처리하는 생성자만 작성하면
		// 해당 클래스로 객체를 생성하기 위해서는 반드시 정수 2개를 전달해야한다 라는 규칙이 만들어짐
		Pos ob1 = new Pos();
		ob1.x = 7;
		ob1.y = 23;
		ob1.show();
		
		Pos ob2 = new Pos(3, 4);
		ob2.show();
		
//		Scanner sc = new Scanner();
//		The constructor Scanner() is undefined
//		매개변수를 전달받지 않는 Scanner의 생성자는 정의되어 있지 않습니다
		
	}
}

