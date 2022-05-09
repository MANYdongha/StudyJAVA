package abstractClass;

import java.util.Arrays;
import java.util.List;

class PC {
	// 1) 함수 오버로딩으로 서로 다른 자료형을 처리하는 함수를 여러개 만들 수 있다
	// 연결되었을 때의 반응을 출력하는 내용을 직접 작성하거나, 함수를 따로 만들어주어야 한다
//	public void connect(DataCable ob) {}
//	public void connect(ExternalHDD ob) {}
//	public void connect(MiniFan ob) {}
	
	// 2) 서로 다른 클래스의 객체를 하나의 인터페이스 타입으로 묶어서 받아 처리한다
	public void connect(USB ob) {	// USB타입으로 up-casting해서 받았지만
		ob.reaction();				// reaction은 오버라이딩이므로 제각각 실행 내용이 다르다
	}
}
interface USB {	// 기존 클래스의 상속 형태에 상관없이 인터페이스를 씌울 수 있다
				// 인터페이스도 추상클래스이고, 추상클래스는 클래스이며, 클래스는 자료형이다
	void reaction();	// 무조건 추상메서드(abstract), 구체적 내용은 구현체에서 작성한다
}
class DataCable implements USB {
	@Override
	public void reaction() {
		System.out.println("스마트폰이 연결되었습니다");
	}
}
class ExternalHDD implements USB{
	@Override
	public void reaction() {
		System.out.println("외장하드 연결. E: 용량 500GB");
	}
}
class MiniFan implements USB {
	@Override
	public void reaction() {
		System.out.println("전원 충전 중...");
	}
}

public class Ex05 {
	public static void main(String[] args) {
		PC pc = new PC();
		
		DataCable ob1 = new DataCable();		// 스마트폰 데이터 전송 및 충전 케이블
		ExternalHDD ob2 = new ExternalHDD();	// 외장하드
		MiniFan ob3 = new MiniFan();			// 여름에 목걸이로 걸고다니는 미니 선풍기
		
		pc.connect(ob1);	// 스마트폰이 연결되었습니다
		pc.connect(ob2);	// 외장하드 연결. E: 용량 500GB
		pc.connect(ob3);	// 전원 충전 중...
		
		USB speaker = new USB() {
			@Override
			public void reaction() {
				System.out.println("외부 출력 장치가 연결되었습니다. 볼륨 20");
			}
		};
		pc.connect(speaker);
		
		USB mouse = () -> System.out.println("마우스 연결됨...");
		pc.connect(mouse);
		
//		인터페이스의 추상메서드가 하나만 있으면 함수형 인터페이스(@FunctionalInterface)라고 한다
//		함수형 인터페이스는 람다식 객체 생성이 가능하다
//		람다식 기본 문법 : () -> {}
//		() 는 함수의 매개변수
//		-> 람다식으로 함수의 body를 작성한다는 의미
//		{} 함수의 body영역, 내부에 내용을 작성하면 된다

//		만약, 함수의 내용이 한줄이라면 {}를 생략할 수 있다
//		만약, 함수의 반환형이 void가 아니고, 내용이 한줄이라면 return을 생략할 수 있다
		
		Integer[] arr = { 2, 7, 8, 4, 6 };
		List<Integer> list = Arrays.asList(arr);
		System.out.println(list);
		list.sort((Integer o1, Integer o2) -> o2 - o1);
		System.out.println(list);
		
		list.forEach((Integer o) -> System.out.printf("%d는 %s\n", o, o % 2 == 0 ? "짝수" : "홀수"));
		
		
		
		
		
		
		
	}
}

