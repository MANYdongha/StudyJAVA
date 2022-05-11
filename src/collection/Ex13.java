package collection;


import java.util.Arrays;

public class Ex13 {
	static int compareByPrice(Item o1, Item o2) {
		return o1.price - o2.price;				//가격으로 정렬(Integer)
	}
	static int compareByName(Item o1, Item o2) {
		return o1.name.compareTo(o2.name);		//이름으로 정렬(String)
	}
	
	public static void main(String[] args) {
		Item ob1 = new Item("아이스아메리카노", 1500);
		Item ob2 = new Item("아인슈페너", 3000);
		Item ob3 = new Item("카페라떼", 2000);
		Item ob4 = new Item("카라멜라뗴", 2500);
		Item ob5 = new Item("콜드브루", 3500);
		
		Item[] arr = {ob1, ob2, ob3, ob4, ob5};
		
		System.out.println(Arrays.toString(arr));

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(compareByPrice(arr[i], arr[j])>0) {
					Item tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(compareByName(arr[i], arr[j])>0) {
					Item tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
}

