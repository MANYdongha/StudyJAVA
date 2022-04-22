package _class;

class Member {	// 클래스는 Reference Type이므로, 멤버필드는 0에 맞는 값으로 초기화
	String country = "대한민국"; 	// 서로 다른 객체가 같은 초기값을 가지게 하려면
	String name; 	// = null;
	int age;		// = 0;
	
//	Member() {
//		// 매개변수를 전달받지 않는 기본 생성자
//	}
	Member(String name, int age) {
		// 객체를 생성하면서, 미리 name과 age의 값을 받아서
		// 멤버 필드의 값을 초기화하기 위해서 사용
		this.name = name;
		this.age = age;
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Member ob1 = new Member("이지은", 30);
		// 생성자에서 필드의 값을 초기화 하지 않으면 내가 직접 넣어준다
//		ob1.name = "이지은";
//		ob1.age = 30;
		
		// 생성자에게 전달해서 필드를 미리 초기화해두었다
		Member ob2 = new Member("홍진호", 41);
		
		System.out.printf("%s(%s)의 나이는 %d살입니다\n", ob1.name, ob1.country, ob1.age);
		System.out.printf("%s(%s)의 나이는 %d살입니다\n", ob2.name, ob1.country, ob2.age);
		
	}
}
