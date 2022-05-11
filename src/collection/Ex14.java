package collection;


import java.util.Arrays;
import java.util.List;

class Item2 extends Item implements Comparable<Item2>{
	Item2(String name, int price){
		super(name, price);
	}
	
	@Override
	public int compareTo(Item2 o) {
		
		return o.price - o.price;
	}
	
}

public class Ex14 {
	public static void main(String[] args) {
		
		Item2 ob1 = new Item2("아이스아메리카노", 1500);
		Item2 ob2 = new Item2("아인슈페너", 3000);
		Item2 ob3 = new Item2("카페라떼", 2000);
		Item2 ob4 = new Item2("카라멜라뗴", 2500);
		Item2 ob5 = new Item2("콜드브루", 3500);
		
		Item2[] arr = {ob1, ob2, ob3, ob4, ob5};
		
		List<Item2> list = Arrays.asList(arr);
		
		System.out.println(list);
		list.sort(null);	//comparable 전달하지 않아도, comparable하다.
		
		
	}
}

