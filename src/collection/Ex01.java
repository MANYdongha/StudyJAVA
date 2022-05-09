package collection;


import java.util.Stack;

// collection : 모음, 집합, 다수의 데이터의 묶음
// framework : 어떤 작업을 수행할 수 있도록 준비되어 있는 틀, 구조

// collection framework : 자바에서 다수의 데이터를 처리하기 위해 준비되어 있는 자료구조

// 자주 사용되는 대표적인 컬렉션 : java.util.List, java.util.Set, java.util.Map
// List : 데이터를 선형으로 저장하고, 값의 중복을 허용한다
// Set : 순번이 존재하지 않고, 값의 중복을 허용하지 않는다
// Map : 순번 대신 별도의 key를 활용하여 값을 저장하고, key는 중복될 수 없으며, value는 중복가능

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st);
		
		ArrayList list = new ArrayList();
		System.out.println("리스트의 크기 : " + list.size());
		list.add(10);
		list.add(20);
		list.add("ITBANK");
		list.add(20);
		System.out.println("리스트의 크기 : " + list.size());
		
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("list.get(%d) : %s\n", i, list.get(i));
		} System.out.println();
		
//		list.add(ob) 	: 리스트에 요소를 추가한다					// arr[i] = v
//		list.size() 	: 리스트에 요소가 몇개 있는지 정수로 반환한다	// arr.length
//		list.get(index) : 리스트의 i번째 요소를 반환한다			// arr[i]
		
		list.add(1, 30);	// 지정한 index에 값을 넣고 기존 값은 뒤로 한칸씩 밀어낸다
		System.out.println(list);
		
		list.remove(1);		// 지정한 index에 있는 값을 빼고, 기존 값은 앞으로 한칸씩 당긴다
		System.out.println(list);
		
		System.out.println(list.contains(20)); 	// 지정한 요소를 포함하는가?
		// 처음부터 끝까지 순회하지 않더라도 포함요소를 확인할 수 있다
		
		System.out.println(list.indexOf("ITBANK")); // 지정한 요소는 몇번째에 있는가?
		// 만약 요소가 없다면 -1이 반환됨
		
		list.set(1, 40);	// 지정한 위치의 값을 새로 덮어쓴다 (add는 값을 뒤로 밀어낸다)
		System.out.println(list);
		
		Object[] arr = list.toArray();
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		} System.out.println();
		
//		배열		: 크기가 고정, 멤버 요소에 index로 직접 접근, 같은 자료형만 처리가능
//		리스트	: 크기가 가변, 멤버 요소에 메서드로 접근, 서로 다른 자료형도 처리가능
		
		ArrayList<String> list2 = new ArrayList<String>();
//		String타입의 객체만 포함할 수 있는 list2
		
		list2.add("10");
//		list2.add(20);	// int 나 Integer는 넣을 수 없음
		System.out.println(list2.get(0));	// index는 여전히 정수
		System.out.println(list.get(0));
		
//		list2.get(index) 의 반환형은 String이다
//		list.get(index) 의 반환형은 Object이다
		
		
		
	}
}
