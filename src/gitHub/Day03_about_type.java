package gitHub;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	String name;
	int age;
	String phonbook;
	String gender;
	
}


public class Day03_about_type {
	private static Object list;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student person = new Student();
		System.out.println("이름, 나이, 폰번호, 성별입력 ");
		person.name = sc.next();
		person.age = sc.nextInt();
		person.phonbook = sc.next();
		person.gender = sc.next();
				
		
		//변수 : 툭정자료우ㅏ 데이터를 정해놓은 크기의 메모리에 저장할 수 있는 공간
		//배열 : 같은 자료형끼리 연속된index메모리 공간에 배치하는 구조
		//구조체 (C언어) : 서로다른 자료형 여러변수를 묶어서 관리하는 사용자 자료형
		//이후에 나오는 클래스에서 함수를 제거하면 구조체와 매우 흡사하다.
		//클래스 : 서로다른 자료형의 여러변수 + 함수를 하나의 객체로 묶어서 만들수 있는 자료형(배열처럼 서로다른 자료형변수들이 정의되고 존재한다.)
		String[] arr = {"유제석","강호동","신동엽"};
		
		for(String str : arr) {
			System.out.print(str + " ");
		}
		
		System.out.printf("이름 : %s, 나이: %d, 전화번호: %s, 성별: %s ", person.name, person.age, person.phonbook, person.gender);
		
		System.out.println();
		
		//컬렉션 : 배열과 비슷하지만 안에 존재하는  데이터들을 객체로 취급하여 가지고 있다(쉽게 배열안에 배열을 가지고 있다)
			Student p1 = new Student();
			Student p2 = new Student();
			Student p3 = new Student();
			
			ArrayList<Student> list = new ArrayList<Student>();
			
			System.out.println("이름, 나이, 폰번호, 성별입력 ");
					 p1.name = sc.next();
					 p1.age = sc.nextInt();
					 p1.phonbook = sc.next();
					 p1.gender = sc.next();
					 list.add(p1);
			System.out.println("이름, 나이, 폰번호, 성별입력 ");
					 p2.name = sc.next();
					 p2.age = sc.nextInt();
					 p2.phonbook = sc.next();
					 p2.gender = sc.next();
					 list.add(p2);			 
			 System.out.println("이름, 나이, 폰번호, 성별입력 ");
					 p3.name = sc.next();
					 p3.age = sc.nextInt();
					 p3.phonbook = sc.next();
					 p3.gender = sc.next();
					 list.add(p3);	
		
		for(Student veiw : list) {
			System.out.println(veiw.name + veiw.age + veiw.phonbook + veiw.gender + "\n");
			
		}
		
		
		
	}
}
