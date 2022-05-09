package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Ex04 소스코드의 Human, Student, Actor를 그대로 사용

public class Ex05 {
	public static void main(String[] args) {
		// 배열
		Human[] arr = {
			new Student("이지은", 100),
			new Student("홍진호", 22),
			new Student("나단비", 57),
			new Actor("이정재", 50),
			new Actor("전지현", 41)
		};
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].show();
		} System.out.println();
		
		// 준비된 배열을 리스트로 변환하기
		List<Human> list1 = Arrays.asList(arr);
		for(int i = 0; i < list1.size(); i++) {
			list1.get(i).show();
		} System.out.println();
		
//		list1.add(new Student("신짱구", 77));
//		java.util.List 에서의 add() 메서드는 미구현이다
//		-> List도 컬렉션이므로, ArrayList의 생성자에 전달하면 List가 아닌 ArrayList가 만들어진다
		
		ArrayList<Human> list2 = new ArrayList<Human>(list1);
		list2.add(new Student("신짱구", 77));
		for(int i = 0; i < list2.size(); i++) {
			list2.get(i).show();
		} System.out.println();
		
	}
}


