package abstractClass;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		Integer[] arr = { 2, 7, 8, 4, 6 };
		List<Integer> list = Arrays.asList(arr);
		
		System.out.println(list);
		
		list.sort(null);
		
		System.out.println(list);
		
		// 내림차순으로 정렬하려면 어떻게 하지?
		// list.sort(요소를어떻게정렬할지결정하는함수를담은객체);
		Comparator<Integer> comp = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// 두 정수를 전달받아서 어떻게 비교할 것인가?
				return o2 - o1;
			}
		};
		list.sort(comp);
		
		System.out.println(list);
	}
}
