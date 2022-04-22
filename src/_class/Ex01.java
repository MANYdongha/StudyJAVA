package _class;

class Student{
	String name;
	int age;
	
	void show() {
		System.out.println(name + "의 나이는 " + age + "살입니다");
	}
	// 클래스는 객체를 생성하기 위해 작성하는 자료형이다
	// 클래스는 다음 요소로 구성된다
	// 1) 멤버 필드 (변수) : 객체의 속성을 저장하기 위한 변수
	// 2) 멤버 메서드 (함수) : 객체의 기능을 정의하기 위한 함수
	// 3) 생성자 : 객체 생성 시 초기 작동을 정의하는 함수
	// 4) 접근 제한자 : 객체 멤버에게 외부로부터의 접근을 제어하는 요소
}

public class Ex01 {
		public static void main(String[] args) {
			Student st1 = new Student();
			// new : 동적할당을 수행하는 연산자, 새로운 공간을 생성하고 주소를 돌려준다
			// Student() : Student타입의 객체를 생성(변수를 작성하고, 함수를 연결함)
			// 생성자는 클래스의 이름과 동일한 이름의 함수 (반환값 자체가 없다)
			
			st1.name = "이지은";	// 객체의 변수에 값을 대입
			st1.age = 30;		// 객체의 변수에 값을 대입
			
			st1.show();			// 객체의 함수를 호출
			 
			
		}
}
