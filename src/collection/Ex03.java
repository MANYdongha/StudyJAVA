package collection;

import java.util.Scanner;

// java.lang.Object : 자바의 모든 객체에 적용되는 모든 클래스의 최상위 클래스
// 자바에 존재하는 그 어떤 형태의 객체도 Object 타입으로 받을 수 있다 (다형성)
// Object 클래스에 정의된 메서드는 모든 객체가 가지는 메서드이므로 오버라이딩할 수 있다

public class Ex03 {
	public static void main(String[] args) {
		
		String str = new String("Hello");
		Integer num = new Integer(100);
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[] { 2, 7, 8, 4, 6};
		
		Object ob1 = str;
		Object ob2 = num;
		Object ob3 = sc;
		Object ob4 = arr;
		
		Object[] arr2 = { ob1, ob2, ob3, ob4 };
		
		Object ob5 = arr2;
		
		System.out.println("=======================");
		
		System.out.println(((int[])((Object[])ob5)[3])[2]);
		
		((Scanner)((Object[])ob5)[2]).close();
		
		sc.close();
		
//		메서드 
		
//		final getClass(), equals(), toString(), clone(), hashCode()
//		내가 만드는 클래스간의 비교를 어떤 방식으로 처리할 것인지 바꿀 수 있다 	equals()
//		내가 만드는 클래스의 객체가 출력할 때 어떤 형태를 가질지 결정할 수 있다	toString()

		Test ob = new Test();
		// 내용 없는 클래스로 객체를 생성해도, Object 클래스에 정의된 메서드를 호출할 수 있다
		
		System.out.println(ob.hashCode());
		System.out.println(ob.getClass());
		System.out.println(ob);
	}
}

class Test /*extends Object*/ {
	// 내용도 없고, 슈퍼클래스도 지정하지 않았지만, 자동으로 Object 클래스를 상속하게 된다
	@Override
	public String toString() {
		return "내가 오버라이딩한 내용";
	}
}








