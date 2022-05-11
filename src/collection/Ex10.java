package collection;


import java.util.ArrayList;
import java.util.Comparator;

class Item{
	String name;
	int price;
	
	public Item() {
	}

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("%s : %,d원", name, price);
	}
}

public class Ex10 {
	public static void main(String[] args) {
		Item ob1 = new Item("아이스아메리카노", 1500);
		Item ob2 = new Item("아인슈페너", 3000);
		Item ob3 = new Item("카페라떼", 2000);
		Item ob4 = new Item("카라멜라뗴", 2500);
		Item ob5 = new Item("콜드브루", 3500);
		
		ArrayList<Item> list = new ArrayList<Item>();
		
		list.add(ob1);
		list.add(ob2);
		list.add(ob3);
		list.add(ob4);
		list.add(ob5);
		
		System.out.println(list);
		
		Comparator<Item> list1 = new Comparator<Item>() {
			
			@Override
			public int compare(Item o1, Item o2) {
				return o1.price - o2.price;
			}		
		}; 
		
		list.sort(list1);
		
		
		System.out.println(list);
		
		
	}
}

