package collection;

import java.util.ArrayList;

class Human {
	String name;
	Human(String name) {
		this.name = name;
	}
	void show() {
		System.out.println("이름 : " + name);
	}
}
class Student extends Human {
	int score;
	Student(String name, int score) {
		super(name);
		this.score = score;
	}
	@Override
	public void show() {
		System.out.printf("%s : %d\n", name, score);
	}
}

public class Ex04 {
	public static void main(String[] args) {

		Student st1 = new Student("이지은", 100);
		Student st2 = new Student("홍진호", 22);
		Student st3 = new Student("나단비", 56);
		
		ArrayList list1 = new ArrayList();
		list1.add(st1);
		list1.add(st2);
		list1.add(st3);
		
//		제네릭 타입을 명시하지 않으면 Object로 취급되기 때문에, 다운캐스팅을 필수로 진행해야 한다
		for(int i = 0; i < list1.size(); i++) {
//			((Student)list1.get(i)).show();
			Object ob = list1.get(i);
			((Student)ob).show();
		} System.out.println();
		
		
//		제네릭 타입을 Student(서브클래스)로 지정하면 다운캐스팅은 필요가 없다
//		단, Student가 아닌 다른 Human의 서브클래스는 처리할 수 없게 된다
		
		ArrayList<Student> list2 = new ArrayList<Student>();
		list2.add(st1);
		list2.add(st2);
		list2.add(st3);
		
		for(int i = 0; i < list2.size(); i++) {
			list2.get(i).show();
		} System.out.println();
		
//		제네릭 타입을 Human(슈퍼클래스)로 지정하면 다운캐스팅은 오버라이딩 여부에 따라 필요없다
//		오버라이딩을 강제하고 싶다면 추상 메서드를 활용할 수 있고, 다른 Human의 서브클래스도 처리가능하다
		
		ArrayList<Human> list3 = new ArrayList<Human>(list2);
		// 컬렉션의 생성자 매개변수에 다른 컬렉션을 전달하면 요소를 유지한 채로 컬렉션 객체를 생성한다
		list3.add(new Actor("이정재", 50));
		for(int i = 0; i < list3.size(); i++) {
			list3.get(i).show();
		} System.out.println();
	}
}

class Actor extends Human {
	int age;
	Actor(String name, int age) {
		super(name);
		this.age = age;
	}
	@Override
	public void show() {
		System.out.printf("%s : %d살\n", name, age);
	}
}











