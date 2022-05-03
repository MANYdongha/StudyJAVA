package inheritance;

public class Main {
	//슈퍼클래스에는 공통으로 가지는 속성 및 기능을 작성한다.
	//서브클래스에는 개별적으로 처리해야할 속성 및 기능을 작성한다.
	//서브클래스의 생성자는 슈퍼클래스의 생성자를 호출해야한다.
	//오버라이딩 처리한 메서드는 호출되면 무조건 오버라이딩 된 내용으로 실행한다.
	
	
//	static void showBeer(Cruiser ob) 	{ob.show();}
//	static void showBeer(Heineken ob) 	{ob.show();}
//	static void showBeer(Blanc ob) 		{ob.show();}	
	static void showBeer(Beer ob) 		{ob.show();} //class로 호출하게 될경우 모두 한방에 보여줄 수 있다.
	public static void main(String[] args) {
		Cruiser ob1 = new Cruiser("크루저", 5, "블루베리");
		Blanc ob2 = new Blanc("블랑", 7);
		Heineken ob3 = new Heineken("하이네켄", 6);
		
		//다형성 : 하나의 객체는 서브클래스로 참조할 수 있고, 슈퍼클래스로도 참조할 수 있다.
		
		Beer b1 = ob1;
		Beer b2 = ob2;
		Beer b3 = ob3;
		
		//같은 자료형의 여려변수는 하나의 배열로 묶어서 처리할 수 있다.
		Beer[] arr = {b1, b2, b3};
		
		for(int i=0; i<arr.length; i++) {
			arr[i].show();
		}System.out.println();
		//슈퍼클래스로 참조하고 있어도, 오버라이딩 된 메서드는 서브클래스의 내용으로 실행된다.
	}
}
