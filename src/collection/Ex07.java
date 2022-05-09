package collection;

class Book /*extends Object*/ {
	String name;
	Book(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book)						// 비교대상이 Book이면
			return name.equals(((Book)obj).name);	// 이름 일치여부를 비교하여 반환
		return false;	// 비교대상이 Book이 아니면 false
	}
}

public class Ex07 {
	
	static void myprintln(Object obj) {
		System.out.println(obj.toString());
	}
	static void myprintln(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		Book ob1 = new Book("드래곤볼1");
		Book ob2 = new Book("드래곤볼2");
		Book ob3 = new Book("드래곤볼1");
		
		System.out.println(ob1);
		System.out.println(ob2.toString());
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));
		
		myprintln(ob1);
		myprintln(ob1.toString());
	}
}
