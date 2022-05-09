package collection;

import java.util.ArrayList;

public class Ex02 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(2);
		list.add(7);
		list.add(8);
		list.add(4);
		list.add(6);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		} System.out.println();
		
		// get(index), set(index, element), remove(index)
		// 위 리스트의 함수를 이용하여 선택정렬 알고리즘으로 내림차순 정렬을 구현해보세요
		
//		for(int i = 0; i < arr.length; i++) {
//		    for(int j = i; j < arr.length; j++) {
//		        if(arr[i] < arr[j]) {
//					int tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
		
		for(int i = 0; i < list.size(); i++) {
			for(int j = i; j < list.size(); j++) {
				if(list.get(i) < list.get(j)) {
					int tmp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, tmp);
				}
			}
		}
		
//		리스트의 요소를 출력하는데 get함수를 일일이 쓰기 번거롭다면 (향상된 for문)
		for(Integer num : list) {		// index없이 배열 혹은 컬렉션의 모든 요소에 대해서
			System.out.print(num + " ");// 각 요소를 출력
		} System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			Integer num = list.get(i);
			System.out.print(num + " ");
		} System.out.println();
		
		
		
	}
}
