package collection;


import java.util.Arrays;

public class Ex12 {
	static int compare(String o1, String o2) {
		return o1.compareTo(o2); //String 클래스가 가지는 메서드
		
	}
	public static void main(String[] args) {
		String[] arr = {"박성훈", "김홍열", "이창현", "심우형", "조정일" };
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(compare(arr[i], arr[j])<0) {
					String tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(compare(arr[i], arr[j])>0) {
					String tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
