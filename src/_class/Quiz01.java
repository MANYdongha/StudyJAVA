package _class;

class Circle{
	double radius;
	double width;
	double lang;
	double pi= 3.14;
	
	public Circle() {
		this(1);
	}

	public Circle(int radius) {
		this.radius = radius;
		width = radius * radius * pi;
		lang = radius + radius *pi;
	}
	
	public Circle(double radius) {
		this.radius = (double)radius;
		width = radius * radius * pi;
		lang = radius + radius *pi;
	}
	void show() {
		System.out.printf("둘레 : %5.2f, 넓이 : %.2f\n", lang, width);
	}
}


public class Quiz01 {
	public static void main(String[] args) {
		Circle c1 = new Circle();		//매개변수가 없으면 1로 처리함
		Circle c2 = new Circle(3);		//매개변수가 전달하는 값은 반지름(radius)
		Circle c3 = new Circle(2.4);
	
		
		// 원의 둘레와 넓이를 실수형태로 소수점 둘째자리까지 출력하도록 처리하세요
		// 단, 원주율은 3.14로 계산한다
		// 둘레 = 지름 * 원주율
		// 넓이 = 반지름 * 반지름 * 원주율
		
		c1.show();	//둘레, 넓이
		c2.show();	//둘레, 넓이
		c3.show();	//둘레, 넓이
		
		
	}
}
