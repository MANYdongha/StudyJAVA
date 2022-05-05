package abstractClass_Quiz02Mission;

class Human{
	String name;
	
	public Human() {}
	
	public Human(String name) {
		this.name = name;
	}

	public void give(Animal aname) {
		System.out.println(name + "이 " + aname.name + "에게 " + aname.give() + "를 준다.");
	}
	
	
}
class Animal{
	String name;
	
	public Animal(String name){
		this.name = name;
	}
	public String give() {
		String result = "";
		
		return result; 
	}
	
}


class Cat extends Animal{
	
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public String give() {
		String result = "츄르";
		
		return result; 
	}
}
class Dog extends Animal{
	
	public Dog(String name) {
		super(name);
	}
	
	@Override
	public String give() {
		String result = "사료";
		
		return result;
	}
}

//상속 처리
//up-casting/down-casting
//instanceof

public class Main2 {
	public static void main(String[] args) {
		Human man = new Human("이지은");
		Cat c1 = new Cat("구름이");
		Dog d1 = new Dog("콜리");
		String restult;
		
		man.give(c1);	// 이지은이 구름이에게 츄르를 준다
		man.give(d1);	// 이지은이 콜리에게 사료를 준다
		
		Animal a1 = c1;
		Animal a2 = d1;
		
		Animal[] arr = {a1,a2};
		
		for(int i=0; i<arr.length; i++) {
			Animal target = arr[i];
			if(target instanceof Cat) {
				((Cat) target).give();
				
			}
			if(target instanceof Dog) {
				((Dog) target).give();
			}
			
			
		}
		
//		Cat과 Dog의 공통점을 묶어서 처리하는 슈퍼클래스 Animal을 작성하세요
//		Human의 give메서드가 Animal을 받아서 처리할 수 있도록 기존의 오버로딩을 제거하고 하나로 합치세요
//		instanceof 를 활용하여 고양이에게는 츄르를 주고 강아지에게는 사료를 줄수 있도록 하세요
	}
}
