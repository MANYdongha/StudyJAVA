package collection;

import java.util.Arrays;

public class Ex11 {
	
	static int compare(Integer o1, Integer o2) {
		return o1 - o2;
	}
	
	public static void main(String[] args) {
		Integer[] arr = {2,7,8,4,6};
		
		System.out.println(Arrays.toString(arr));
		for(int i=0; i< arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(compare(arr[i], arr[j])>0) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
	}
}

