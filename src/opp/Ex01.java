package opp;

import java.util.ArrayList;

//객체생성 : 아래의 Ex07을 예를 들어  지금 Kid에서 객체를 생성안한 이유는
//아래 main page에서  Kid ob1 = new Kid(찬혁);이렇게 생성을 안했기떄문이다.
//(이유 자동으로 생성을 하기 떄문 생성필요없음)
//만약  저렇게 생성할 경우 Kid class에서 객체를 생성을 해줘야 한다.
class Kid{
Ball b;
String name;



	void takeBall(Ball b) {
		System.out.printf("%s가 공을 가지고 있다\\n", name);
		this.b = b;
	
	}
	void throwBall(Kid other){
		System.out.printf("%s가 %s 에게 공을 던졌다\\n", name,other.name);
		other.takeBall(b);
		this.b = null;
	}
	
	}

class Ball{

}
public class Ex01 {
	public static void main(String[] args) {
		Kid ob1 = new Kid();
		Kid ob2 = new Kid();
		Ball b = new Ball();
		
		
		
		ob1.name = "찬혁이";
		ob2.name = "민호";

		ob1.takeBall(b);
		System.out.println();
		ob1.throwBall(ob2);
		System.out.println();
		ob2.throwBall(ob1);

		
	}
}
