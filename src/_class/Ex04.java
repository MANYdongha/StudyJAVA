package _class;

class Student2 {
	String name;
	int kor, eng, mat, sum;
	double avg;
	String grade;
	
	void show() {
		System.out.printf("[%s의 성적]\n", name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f\n", avg);
		System.out.println("등급 : " + grade + "\n");
	}
	Student2() {}
	
	Student2(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		sum = kor + eng + mat;	// 매개변수로 받지 않은 값도
		avg = sum / 3.0;		// 다른 매개변수로 연산해서 값을 할당할 수 있다
		switch((int)avg / 10) {
			case 10:
			case 9:  	grade = "A"; break;
			case 8:  	grade = "B"; break;
			case 7:  	grade = "C"; break;
			case 6:  	grade = "D"; break;
			default:  	grade = "F"; 
		}
	}
	Student2(String name, int[] arr) {
		// 자료형이 다를 뿐, 의미상 전달받는 데이터는 동일하다
		// -> 처리해야 할 작업도 사실상 동일하다
		// 이미 작성된 생성자를 다시 호출할 수 있다
		// 단, 생성자 내부에서는 다른 생성자를 호출할 때 클래스이름 대신 this를 사용한다
//		Student2(name, arr[0], arr[1], arr[2]);
		this(name, arr[0], arr[1], arr[2]);
	}
}
public class Ex04 {
	public static void main(String[] args) {
		Student2 st1 = new Student2();
		st1.name = "이지은";
		st1.kor = 100;
		st1.eng = 99;
		st1.mat = 87;
		st1.sum = 100 + 99 + 87;
		st1.avg = st1.sum / 3.0;
		st1.show();
		
		Student2 st2 = new Student2("조용필", 99, 97, 85);
		st2.show();
		
		int[] arr = { 75, 52, 99 };
		Student2 st3 = new Student2("유희열", arr);
		st3.show();
	}
}


