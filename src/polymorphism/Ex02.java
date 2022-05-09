package polymorphism;


class Animal {	// 여러 객체를 묶어서 분류하기 위한 개념적인 요소(객체를 만들기 위한 클래스가 아니다)
	String name;
	Animal(String name) {
		this.name = name;
	}
	void bark() {	// 오버라이딩을 위한 형식만 제공하고 있다
		System.out.println(name + " : ...");
	}
}
class Dog extends Animal {
	Dog(String name) {
		super(name);
	}
	@Override
	void bark() {
		System.out.println(name + " : 멍멍");
	}
	void tailing() {
		System.out.println(name + "가 꼬리를 흔든다");
	}
}
class Cat extends Animal {
	Cat(String name) {
		super(name);
	}
	@Override
	void bark() {
		System.out.println(name + " : 야옹");
	}
	void grooming() {
		System.out.println(name + "가 털을 다듬고 있다");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Cat c1 = new Cat("구름이");
		Dog d1 = new Dog("콜리");
		
		c1.bark();
		c1.grooming();
		d1.bark();
		d1.tailing();
		
//		서브클래스의 객체는 슈퍼클래스 타입의 참조변수로도 참조할 수 있다
		Animal a1 = c1;		// up-casting
		Animal a2 = d1;		// 서브클래스의 객체를 슈퍼클래스 타입으로 참조하는 것
		
		System.out.println("========== up-casting ==========");
		
//		up-casting 되면 오버라이딩 함수는 호출할 수 있지만, 고유 함수는 호출할 수 없다
		a1.bark();		// Animal 타입으로 참조하고 있어도, 서브클래스에서 정의된 형식대로 실행한다
		a2.bark();		// Animal 타입에 정의되어 있는 함수이므로 호출 가능
//		a1.grooming();	// Animal 타입에 정의되어 있지 않은 함수이므로 호출 불가능
//		a2.tailing();
		
		animalHospital(c1);
		animalHospital(d1);
		
		Animal[] arr = { a1, a2 };
		
		// 각 동물의 고유기능을 호출하고 싶다면 (오버라이딩은 이런 과정이 필요없다)
		for(int i = 0; i < arr.length; i++) {
			Animal target = arr[i];			// 배열의 i번째 요소를 Animal target이라고 하면
			if(target instanceof Cat)		// target이 Cat의 객체라면
				((Cat)target).grooming();	// Cat으로 형변환(down-casting)후 함수 호출
			if(target instanceof Dog) 		// target이 Dog의 객체라면
				((Dog)target).tailing();	// Dog로 형변환 후 함수 호출
		}
		
//		object : 객체	(불특정 다수의 모든 객체)
//		instance : 객체	(특정 클래스에 의해서 생성된 객체, 보통 인스턴스를 말할때는 클래스를 동반한다)
		
	}
	static void animalHospital(Animal a) {	// 매개변수에 대입하면서 자연스럽게 up-casting
		System.out.printf("%s 치료 끝~\n", a.name);
//		a.tailing();
//		a.grooming();
	}
}





