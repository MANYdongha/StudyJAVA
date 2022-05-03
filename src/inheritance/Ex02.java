package inheritance;

class Pos{				//슈퍼클래스
	private int x;
	int y;

	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	void showPos() {	//상속처리하면 메서드도 그대로 물려준다
		System.out.println("x : " + x + ", y : " + y);
	}	
}
class Pos3D extends Pos{	//서브클래스
	int z;
	//물려받은 함수의 형식은 그대로 유지하되, 내용을 변경하기 위하여 다시정리한다.
	//다시정의한다 -> 재정의 -> 오버라이딩(덮어쓰기) == 다형성(여러의 객체가 참조 할 수 있지만, 결국의 본질은 하나이다. )이랑 연관이 있음
	//접근제한자는 슈퍼클래스에서 지정한 범위보다 더 좁힐 수 없다(넓히는 것은 가능)
//	@Override
//	private void showPos()
	
	@Override
	void showPos() {	//Cannot reduce the visibility of the inherited method from Pos 기본적으로 java는 넓은 범위에서 범위를 줄여나가는 개념 
		System.out.println("x : " + getX() + ", y : " + y + ", x : " + z); 
	}																	   
	
}


public class Ex02 {
	public static void main(String[] args) {
//		- 내용이 하나도 없어도 그대로 출력이 가능하다.
//		- 상속한 슈퍼클래스에 private가 있으면, 바로 상속이 불가능하지만 getter/setter함수를 통하여 상속받아 사용가능하다.
//		- 물려받은 함수의 형식은 그대로 유지하되, 내용을 변경으로 다시 정의한다.(재정의)
//		- 다시 정의하는 것이 오버라이딩(덮어쓰기)
//		- 오버라이딩은 다형성과 매우 밀접하여  여러개의 객체가 참조할 수 있지만 결국 본질은 하나이다.
//		- 다형성 :  java의 각 요소들이 다양한 자료형에 속하는 것을 말한다.
//		- 오버라이딩 작성방법 : 보통 슈퍼클래스 함수의 이름만 작성하고 Ctrl + space를 누르면 자동완성으로 @override라고 뜨면서 작성이 된다. 
//		     그때 추가할 내용 추가해서 고치면 사용가능하다.
		Pos ob1 = new Pos();
		ob1.setX(3);
		ob1.y = 5;
		System.out.printf("ob1의 좌표 : %d, %d\n", ob1.getX(), ob1.y);
		
		Pos3D ob2 = new Pos3D();
		ob2.setX(10);
		ob2.y = 7;
		ob2.z = -2;
		System.out.printf("ob2의 좌표 : %d, %d, %d\n", ob2.getX(), ob2.y, ob2.z);
	
		System.out.println("--------------------");
		ob1.showPos();
		ob2.showPos();
		System.out.println("--------------------");
		System.out.println();
		
		//Pos3D ob3 = ob1; //불가능 업케스팅, 다운케스팅 개념
		
		Pos test = ob2;
		test.showPos();
		
	}
}
