package abstractClass_Quiz01;

class Human{
	String name;
	Cat cat;
	Dog dog;
	
	public Human() {}

	public Human(String name) {
		this.name = name;
	}
	
	void give(Cat cat) {
		this.cat = cat;
		System.out.println(name+ "이 " + cat.name + "에게 먹이를 준다.");
	}
	
	void give(Dog dog) {
		this.dog = dog;
		System.out.println(name+ "이 " + dog.name + "에게 먹이를 준다.");
	}
	
}
class Cat {
	String name;
	
	public Cat() {}

	public Cat(String name) {
		this.name = name;
	}
	
}
class Dog{
	String name;
	
	public Dog() {}

	public Dog(String name) {
		this.name = name;
	}
}


public class Main1 {
	public static void main(String[] args) {
		Human man = new Human("이지은");
		Cat c1 = new Cat("구름이");
		Dog d1 = new Dog("콜리");
		
		man.give(c1);	// 이지은이 구름이에게 먹이를 준다.
		man.give(d1);	// 이지은이 콜리에게 먹이를 준다.
		
		
		
//		메인에 필요한 클래스를 작성하고 Human클래스의 give함수를 자료형에 따라 오버로딩하세요
//		각 클래스의 생성자가 name을 전달받을 수 있도록 처리하세요
//		1단계에서는 상속을 사용하지 않습니다
		
		
		
	}
}
