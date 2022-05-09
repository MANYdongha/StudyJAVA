package collection;

import java.util.Arrays;
import java.util.List;

class Name {
	String name;
	Name(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
//		return name;
		return String.format("이름 : %s", name);
	}
}

public class Ex08 {
	public static void main(String[] args) {
		Integer[] arr = { 2, 7, 8, 4, 6 };
		List<Integer> list = Arrays.asList(arr);
		
		System.out.println("arr : " + arr);
		System.out.println("list : " + list);
		
		Name[] arr2 = { new Name("지은"), new Name("진호") };
		List<Name> list2 = Arrays.asList(arr2);
		
		System.out.println("arr2 : " + arr2);
		System.out.println("list2 : " + list2);
	}
}
