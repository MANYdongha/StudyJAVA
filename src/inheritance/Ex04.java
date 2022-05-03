package inheritance;
//학생은 사람이다 (ㅇ) 			//분류상 같은 범주내에 속한다면 상속으로 처리
//타이어는 자동차에 포함된다 (X)   //물리적 포함관계는 내부클래스로 처리

//A is B

class Parent{
	Parent(){
		System.out.println(1);
	}
	Parent(int num){
		System.out.println(num);
	}
	
	
}
class child extends Parent{
	child(){
		this(2);
	}
	child(int num){
		super(num);
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Parent ob = new child(3);  //3
		Parent ob1 = new Parent(); //1
		child ch = new child();    //2
		
	}
}
