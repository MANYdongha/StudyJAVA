package abstractClass;


//추상 클래스 : 추상 메서드를 포함할 수 있는 클래스. 생성자를 호출하여 객체를 생성할 수 없다
//추상 메서드 : 함수의 형식은 있으나, 내용이 없는 함수. 오버라이딩을 위해서 만들 수 있다

abstract class Animal {		// 상속을 위해 만들어두는 간략한 클래스
	String name;
	Animal(String name) {
		this.name = name;
	}
	abstract void bark();	// 내용이 완성되지 않은 미구현 함수
	void method() {			// 추상 클래스는 일반 메서드도 포함할 수 있다
		System.out.println("test");
	}
}
class Dog extends Animal {
	Dog(String name) {
		super(name);
	}
	// 1) 추상 메서드를 상속받았다
	// 2) 추상 메서드를 가지기 위해서 스스로 추상클래스가 되거나 (이렇게 처리하는 경우는 거의 없다)
	// 3) 추상 메서드를 오버라이딩하여 내용을 만들어서 추상메서드가 아니게 만들면 된다
	@Override
	void bark() {			// 미구현 함수를 상속받은 후, 내용을 완성하여 사용가능한 함수로 바꾼다
		System.out.println(name + " : 멍멍");
	}
}

class Cat extends Animal {
//	The type Cat must implement the inherited abstract method Animal.bark()

	Cat(String name) {
		super(name);
	}

	@Override
	void bark() {
		System.out.println(name + " : 야옹");
	}
}

public class Ex01 {
	public static void main(String[] args) {
//		Animal ob = new Animal("동물");
//		Cannot instantiate the type Animal : Animal타입을 객체화할 수 없습니다
		Dog d1 = new Dog("콜리");
		d1.bark();
		
		Cat c1 = new Cat("구름이");
		c1.bark();
		
//		추상클래스는 생성자를 통하여 직접 객체를 생성할 수는 없다
//		단, 익명 내부 클래스 방식을 이용하여 객체를 생성할 수 있다
//		미구현 함수의 내용을 즉석에서 작성해주면 객체를 생성할 수 있다
		
		Animal lion = new Animal("심바") {
			@Override
			void bark() {
				System.out.println(name + " : 어흥");
			}
		};
		lion.bark();
		
		System.out.println(d1.getClass() == Dog.class);
		System.out.println(lion.getClass() == Animal.class);
		
//		lion객체의 클래스는 Animal클래스와 일치하지 않는다
//		Animal을 상속받은 즉석에서 만들어진 이름이 없는 클래스이다
//		이런 형식을 익명 내부 클래스 (Anonymous Inner Type) 이라고 한다
		
		
		
		
		
		
		
		
		
		
	}
}
