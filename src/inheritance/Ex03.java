package inheritance;
class Super{
	// 1) 생성자를 작성하지 않으면, 매개변수를 전달받지 않는 기본생성자가 작성된다.
	int x,y;
	
	Super(){
		System.out.println("슈퍼클래스 생성자 호출!! (x, y필드 생성)");
	}
	
}
class Sub extends Super{
	// 1) 생성자를 작성하지 않으면, 매개변수를 전달받지 않는 기본생성자가 작성된다.
	int z;
	
	Sub(){
		super();	// 2)서브 클래스의 생성자 첫 줄에서 슈퍼클래스의 생성자를 호출해야 한다.
		System.out.println("서브 클래스 생성자 호출!!(z필드생성)");
	}
	
	
}
public class Ex03 {
	public static void main(String[] args) {
		Sub ob1 =new Sub();
		
		ob1.x = 2;
		ob1.y = 3;
		ob1.z = 5;
		System.out.println("x : " + ob1.x + ", y : " +  ob1.y + ", z : " + ob1.z);
//		new Sub -> Super();
//		서브클래스의 생성자는 반드시 슈퍼클래스의 생성자를 호출해야한다.
	}

}
