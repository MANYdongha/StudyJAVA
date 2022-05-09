package polymorphism;

class Super {
	int x, y;
	
	Super(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void show() {
		System.out.printf("%d, %d\n", x, y);
	}
}
class Sub extends Super {
	int z;
	
	Sub(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	void showSub() {		// 오버라이딩 아님(== 슈퍼클래스에는 메서드가 없음)
		System.out.printf("%d, %d, %d\n", x, y, z);
	}
	@Override
	void show() {			// 슈퍼클래스에 같은 형식의 메서드가 있으니 오버라이딩
		System.out.printf("%d, %d, %d\n", x, y, z);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// 다형성 : 하나의 객체가 슈퍼클래스로도 참조될수 있고, 서브클래스로도 참조될 수 있다
		// 어떠한 형태로 참조하냐에 따라 호출할 수 있는 메서드가 달라진다
		// 1) 참조변수의 자료형에 따라 호출 가능 여부가 달라진다
		// 2) 오버라이딩 되어 있다면 오버라이딩 메서드대로 실행된다
		Sub ob1 = new Sub(2, 3, 4);
		ob1.showSub();
		
		Super ob2 = ob1;
//		ob2.showSub();
		
		System.out.println(ob1 == ob2);
		
		ob1.show();	// 슈퍼클래스로 참조하고 있어도 호출 가능 (내용은 서브클래스에 따라 실행)
		ob2.show();	// 서브클래스로 참조하고 있어도 호출 가능 (내용은 서브클래스에 따라 실행)
	}
}



