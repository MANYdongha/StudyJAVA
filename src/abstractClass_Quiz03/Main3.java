package abstractClass_Quiz03;

class Human{
	private String name;
	
	public Human() {}
	
	public Human(String name) {
		this.name = name;
	
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void give(Animal animal) {
		System.out.println(name + "이 " + animal.getName() + "에게 " + animal.give() + "를 준다.");
		
	}

	public void give(Friend f1) {
		System.out.println(name + "이 " + f1.getName() + "에게 " + f1.food() + "를 준다.");
		
	}
	
	
}

class Friend extends Human{
	
	public Friend() {}
	
	public Friend(String name) {
		super(name);
	}
	
	public String food() {
		String food = "커피";
		
		return food;
	}
}

class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String give() {
		
		
		return null;
	}
	
}

class Dog extends Animal{

	public Dog(String name) {
		super(name);
		
	}
	@Override
	public String give() {
		String food ="사료";
		
		return food;
	}
	
}
class Cat extends Animal{

	public Cat(String name) {
		super(name);
		
	}
	@Override
	public String give() {
		String food ="츄르";
		
		return food;
	}
	
}
//인터페이스의 활용
//접근 제한자, getter/setter
//추상 메서드

public class Main3 {
	public static void main(String[] args) {
		Human man = new Human("이지은");
		Cat c1 = new Cat("구름이");
		Dog d1 = new Dog("콜리");
		Friend f1 = new Friend("유인나");
		
		man.give(c1);	// 이지은이 구름이에게 츄르를 준다
		man.give(d1);	// 이지은이 콜리에게 사료를 준다
		man.give(f1);	// 이지은이 유인나에게 커피를 준다
		
//		Human의 서브클래스 Friend를 작성하고 생성자를 처리하세요
//		Human의 give함수가 Animal이 아닌 다른 객체에게도 give 할수 있도록 자료형을 처리하세요
//		(인터페이스 Companion 을 작성하여 묶어주면 됩니다)
	}
}
