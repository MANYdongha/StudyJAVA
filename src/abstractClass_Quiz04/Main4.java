package abstractClass_Quiz04;

class Human{
	private String name;
	
	public Human(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void give(Animal animal) {	//이지은이 구름이에게 츄르를 던져 준다
		System.out.println(name + "이 " + animal.name() + "에게 " + animal.food() + "를 " + animal.give() + "준다.");
		
	}
	public void give(Friend h) {			// 이지은이 유인나에게 커피를 건네 준다
		System.out.println(name + "이 " + h.getName() + "에게 "+ h.food()+"를 건네 준다.");
		
	}
	
	

}
class Friend extends Human{
	
	public Friend(String name) {
		super(name);
	}
	public String food() {
		String food = "커피";
		return food;
	}
	
}

interface Animal{
	String name();
	String give();
	String food();
}

class Cat implements Animal{ // 이지은이 구름이에게 츄르를 던져 준다
	String name;
	public Cat(String name) {
		this.name = name;
	}
	@Override
	public String give() {
		String give = "던져";
		return give;
	}
	@Override
	public String food() {
		String food ="츄르";
		return food;
	}
	@Override
	public String name() {
	
		return name;
	}
	
	
	
}
class Dog implements Animal{ // 이지은이 콜리에게 사료를 담아 준다
	String name;
	public Dog(String name) {
		this.name = name;
	}
	@Override
	public String give() {
		String give = "담아";
		return give;
	}
	@Override
	public String food() {
		String food = "사료";
		return food;
	}
	@Override
	public String name() {
		
		return name;
	}
	
	
	
}



public class Main4 {
	public static void main(String[] args) {
		Human man = new Human("이지은");
		Cat c1 = new Cat("구름이");
		Dog d1 = new Dog("콜리");
		Friend f1 = new Friend("유인나");
		
		
		man.give(c1);	// 이지은이 구름이에게 츄르를 던져 준다
		man.give(d1);	// 이지은이 콜리에게 사료를 담아 준다
		man.give(f1);	// 이지은이 유인나에게 커피를 건네 준다
		
//		대상이 되는 자료형에 따라서, 주는 방식이 구체적으로 표현되게끔 코드를 수정하세요
//		직접적으로 객체 생성에 참여하지 않는 Animal클래스는 추상클래스로 변경하세요
		 
	}
}

