package class_quiz;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		Student st = new Student("이름", 10, 20, 30);
//		st.show();
		
		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[5];
//		arr는 학생 객체 5개를 담을 수 있는 빈 칸이 만들어짐
//		arr[0] = new Student(name, kor, eng, mat);
//		arr[0] = getNode(sc);
//		arr[0].show();
		
		// 배열의 각 요소에 서로 다른 학생을 입력받아서 만든 다음 전체 학생의 정보를 출력하세요
		for(int i = 0; i < arr.length; i++) {
			arr[i] = getNode(sc);
		}
//		for(int i = 0; i < arr.length; i++) {
//			Student st = arr[i];
//			st.show();
//		}
		for(Student st : arr) {	// index없이 배열(혹은 컬렉션)의 모든 요소에 대해 반복
			st.show();
		} System.out.println();
		
		// 학생의 평균을 기준으로 내림차순 정렬(선택정렬)해보세요
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				if(arr[i].avg < arr[j].avg) {
					Student tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		// 배열의 각 요소의 정보를 다시 출력해보세요
		for(Student st : arr) {	// index없이 배열(혹은 컬렉션)의 모든 요소에 대해 반복
			st.show();
		} System.out.println();
		
	}
	static Student getNode(Scanner sc) {// 전달받은 스캐너로 입력받아서 학생을 만들어서 반환
		String name;
		int kor, eng, mat;
		System.out.print("이름 : ");		name = sc.next();
		System.out.print("국어 : "); 		kor = sc.nextInt();
		System.out.print("영어 : "); 		eng = sc.nextInt();
		System.out.print("수학 : "); 		mat = sc.nextInt();
		Student st = new Student(name, kor, eng, mat);
		return st;
	}
}
