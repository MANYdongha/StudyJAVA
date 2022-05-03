package inheritance;
class Student{
	String name;
	int age;
	
	public Student() {}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	void show() {
		System.out.printf("%s : %d\n", name, age);
	}
}
class hightScoolStudent extends Student{
	//String name; 생략되어있음
	//int age; 생략되어있음
	int grade;
	
	public hightScoolStudent(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}
	
	void show() {
		System.out.printf("%s (%d학년): %d\n", name,grade,age);
	}
}

public class Ex01 {
	public static void main(String[] args) {
//		- 기본 클래스를 활용하여 새로운 클래스를 만들 수 있다.
//		- 기존클래스를 가지는 필드, 메서드를 모두 물려받는다.
//		- 상속을 처리한 후, 새로운 요소 추가가 없다면 기존 클래스를 그대로 사용해도 된다.
//
//		(하지만 그렇게 할 필요가 없다.)
//
//		- 보통 상속 이후 추가적인 내용이 발생하는 것이 보통이다.
//		- 사용 문법은 : class A extends B형식으로 작성한다.
//		- B의 모든 속성을 물려받는 새로운 클래스 A라는 의미
//		- 기존에 만들어진 속성을 물려주는 클래스를 슈퍼클래스라고 한다.
//		- 신규로 만드는, 속성을 물려받은 클래스를 서브 클래스라고 한다.
	Student st1 = new Student("이지은", 30);
	hightScoolStudent st2 = new hightScoolStudent("남도일", 17, 1);
	
	st1.show();
	st2.show();		
	
		

		
		
		
		
	}
}
