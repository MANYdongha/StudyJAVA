package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Ex09 {
	//리스트는 어떤방식으로 정렬을 수행하는가?
	public static void main(String[] args) {
	
		//1 서로 다른 두 객체를 비교하기 위해 Comparator를 활용
		// 내가 원하는 특정 기준으로 정렬하고 싶다면 Comparator (비교하는애)
		
		Integer[] arr = {2,7,8,4,6};
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {	// <- 두 객체의 배교
//				if(arr[i] > arr[j]) {
					if(arr[i] - arr[j] > 0) {			
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}System.out.println();
		
		
		//두개의 Integer을 비겨할 수 있는 comparator
		Comparator<Integer> comp1 = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			
			}
			
		}; 
			//함수형 인터페이스 람다식 만들기
			//1) 함수이름은 몰라도 된다.
			//2) 함수의 매개변수 형식과 반환형형식을 알고 있어야 한다.
			//3) 람다식 기본형태 : (매개변수) -> { 함수코드;}
			Comparator<Integer> comp2 = (Integer o1, Integer o2) -> {
				return o1 - o2;
			};
			//4) 함수내용이 한줄이면 {}을 생략
			//5) 함수내용이 한줄이고, return하는 코드라면 return도 생략할 수 있다.
			Comparator<Integer> comp3 = (Integer o1, Integer o2) -> o1 - o2;
			
			
			
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arr));
		list1.add(3);
		list1.sort(comp1); // 위에서 만든 비교함수를 담은 객체 comp1을 전달
		System.out.println(list1);
		System.out.println(Arrays.asList(arr).getClass());
		
		//2 클래스 자체적으로 기본 비교형식을 지정하기 위해 Comparable을 활용
		//별도로 기준을 지정하지 않더라도 정렬이 될 수 있게 하려면 클래스에 Comparable을 구현 (가능한)
		
		
		
		
		
		
	}
}
