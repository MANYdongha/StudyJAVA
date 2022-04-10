package gitHub;

import java.io.ObjectInputStream.GetField;

import org.omg.CORBA.Request;

public class Day02_about_variable {
	public static void main(String[] args) {
		/*
		 * java메모리 실행순서
		 * [Code]-> [Data] -> [Heep -> Stack]
		 * Code읽기      맴버변수저장	고무줄처럼 왔다갔다하나다. 함수 지역변수 저장
		
		 자료형 : 자료의 타입을 알아야 데이터의 공간이랑 데이터를 저장할 수 있다.
		 자료형이 있어야  컴퓨터가 해석해서 알아먹는다.
		1) 대입연산자 기준 우변과 좌변의 값은 서로 다를 수 있다.
		2) 대입연산자 기준 우변과 좌변의 자료형은 같아야한다.
		3) 상속관계에 있는 서브클래스는 슈퍼클래스와 같다고 한다.
		ex) 우변의 일반자료형은 좌변의 일반자료형의 슈퍼클래스처럼 자연스럽게 변형가능하다.
		 
		 
		 * java의 자료형은 2가지 primitive type vs wrapper class 나눠진다.
		 * 
		 *   
		 	primitive type	<->   Wrapper class
			boolean			<->	  Boolean
			byte			<->   Byte
			char			<->   Character
			short			<->	  Short
			int 			<->   Integer
			float			<->   Float
			double			<->   Double
			
			
		 * java언어는 객체언어이다. 하지만 primitive type은 객체자료형이 아니다. 그래서 객체를 취급할때 wrapper class를 
		 	사용해야한다.
		 * Wrapper class은 직접적으로 담기지 않고, 주소를 가르킨다(포인터변수).
		 * Wrapper class은 쉽게 속성과 기능을 쓰기 위해 사용하고 하나의 데이터(primitive type)의 자료형이 아닌 다수의 데이터(자료형)->(*객체형취급*)를 다룰때  Wrapper class을 사용한다.
		 * ArrayList는 하나의 자체적인 데이터가 아니여서 int같은 자료형을 쓸 수 없다. 왜냐면 많은 데이터들이 들어오기때문에 그 합친 자료형을 표현해줘야 하기때문에 
		      포인터 변수를 사용해서 지속적으로 생성해줘야한다 그렇기에 Wrapper class 
		 */
		 //형변환
		int i =10;
		String str = Integer.toString(i);
		
		//String은 클래스 함수이므로 객체로 변환하기 위해서는 자료형의 객체화를 시키고 toString으로 문자열화 시킨다.
		System.out.println(str.getClass().getSimpleName()); 
		
		
		Integer e = Integer.parseInt(str); 
		System.out.println(e.getClass().getSimpleName());
		System.out.println(e);
		
	}
}
