
//Notion블로그 참조
//### 구조체  = Java의 객체:
//
//1. 서로 다른 자료형의 여러 변수를 묶어서 관리하는 사용자 정의 자료형 
//
// 2. 각자 자료형의 정의가 필요하다. 이유는 메모리가 미리 공간을 계산할 수 없기 때문에 계산하기 위하여 미리 자료형을 미리 설정해야 한다.
//
//### 배열 vs class:
//
//배열
//
//1. 같은 자료형의 여러 변수를 묶어서 관리하는 자료형
//2. 배열은 같은 자료형이여서 안에 데이터들의 자료형을 호출할 필요가 없다.
//
//class 
//
//  1. 다른 자료형의 여러 변수를 묶어서 관리하는 자료형
//
//  2. class는 다른 자료형이여서 안에 데이터들이 다 달라서 전부 자료형들을 명시해줘야한다. 
//
//그래야 컴퓨터가 계산을 하여 공간을 할당할 수 있다.
//
//### 구조체의 메모리할당:
//
//// C언어 : st1 = (Student*)malloc(sizeof(Student))와 같다.
//
//  - java에서는 new함수를 사용하여 더 쉽게 동적할당을 할 수 있다.
//
//동적할당 vs 정적할당.
//
// - 동적할당 : 쉽게 생각하면 구조체 = java객체생성이므로 class에서 만들어진 객체들이 동적할등을 통하여 메모리에 생성된다고 생각하면 된다.  (heap에 저장된다) (필요할때마다 생성됨)
//
// - 정적할당 : static 및 class 메서드 그리고 Data(맴버변수)가 저장되는 곳이다. (변형이 없음)
//
// - 정적은 모두 method Area 에 저장된다.
//
//### JAVA의 실행과정
//
//- 소스코드  java를 javac(컴파일러)가 컴파일  --> class파일(java바이트코드)로 변환 --> jVM실행  (인터프리터방식) → 실행엔진을 통해 class파일 실행
//### JAVA의 메모리 영역
//
//- JVM에서 인터프리터 방식으로 진행할떄 메모리 할당 및 진행순서
//
//                                   Method Area (static, class, 전역/맴버변수) 
//
//                                                      ↓
//
//                                  Stack Area (java stack, JVM스택영역) 
//
//                                                                  ↓
//
//                                         Heap Area 힙영역 객체(인스턴스) 배열 등등
package struct;

import java.util.Scanner;

class Student{
	String name;
	int age;
}
	public class Ex01 {
	public static void main(String[] args) {
		Student st1 = new Student(); // C언어의 동적할당으로 메모리에 공간을 생성하는 것과 같다.
		// 각 겍체들을 묶는 배열들을 만들어서 활용함
		//ex)
		//Student 형태가 똑같은 변수 3개
		Student st2 = new Student();
		Student st3 = new Student();
		
		Student[] arr = { st1, st2, st3};

		//3명 학생의 이름과 나이를 입력(배열이니깐 for문으로 접근)
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d 번째 학생이름 입력 : " , i + 1 );
			arr[i].name = sc.next();
			System.out.printf("%d 번째 나이름 입력 : ",i + 1);
			arr[i].age = sc.nextInt();
		}
		System.out.println();
		for(int i=0;i<arr.length; i++) {
			System.out.printf("학생의 이름은 %s, 나이는 %d입니다.\\n",arr[i].name, arr[i].age);
		}
		System.out.println();
		sc.close();

	}
}
