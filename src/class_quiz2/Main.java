package class_quiz2;

import java.util.Scanner;

import class_quiz.Student;

public class Main {
	
	static Student[] arr = new Student[10];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		arr[0] = new Student("이지은", 100, 99, 87);
		arr[1] = new Student("홍진호", 22, 22, 22);
		int menu;
		
		do {
			System.out.println("학생 관리 프로그램");
			System.out.println("1. 전체 목록 출력");
			System.out.println("2. 학생 추가");
			System.out.println("3. 정렬 (평균 기준 내림차순)");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = sc.nextInt();
			switch(menu) {
				// 입력받은 메뉴에 따라서 목록/추가/정렬/종료를 수행할 수 있도록 코드를 작성하세요
			}
			System.out.println();
		} while(menu != 0);
		sc.close();
	
		
	}
}
