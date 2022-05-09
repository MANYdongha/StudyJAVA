package collection;

import java.util.ArrayList;

abstract class Super {
	String name;
	Super(String name) { this.name = name; }
	public abstract void show();
}

class Sub1 extends Super {
	Sub1(String name) { super(name); }
	@Override public void show() {
		System.out.println(this.getClass().getSimpleName() + ") " + name);
	}
}

class Sub2 extends Super {
	Sub2(String name) { super(name); }
	@Override public void show() {
		System.out.println(this.getClass().getSimpleName() + ") " + name);
	}
}

class Handler {
	ArrayList<Super> list = new ArrayList<Super>();
	
	int insert(Super ob) {
		return list.add(ob) ? 1 : 0;
	}
	
	Super select(String name) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).name.equals(name)) {
				return list.get(i);
			}
		}
		return null;
	}
}

public class Ex06 {
	public static void main(String[] args) {
		Handler hd = new Handler();
		
		int add1 = hd.insert(new Sub1("객체1"));
		int add2 = hd.insert(new Sub2("객체2"));
		System.out.println(add1 == 1 ? "추가 성공" : "추가 실패");
		System.out.println(add2 == 1 ? "추가 성공" : "추가 실패");
		
		String find1 = "객체2";
		Super result1 = hd.select(find1);
		System.out.print("검색 결과 : ");
		if(result1 != null)	result1.show();
		else 				System.out.println("결과 없음");
			
		String find2 = "객체3";
		Super result2 = hd.select(find2);
		System.out.print("검색 결과 : ");
		if(result2 != null)		result2.show();
		else 					System.out.println("결과 없음");
		
	}
}


