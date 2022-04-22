package class_quiz2;

public class Student {
	String name;
	int kor, eng, mat, sum;
	double avg;
	
	// 생성자
	Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		sum = kor + eng + mat;
		avg = sum / 3.0;
	}
	
	// 메서드
	void show() {
		// 이름, 국영수합계평균을 출력
		System.out.printf("%s) %3d, %3d, %3d\t%3d / %6.2f\n",
				name, kor, eng, mat, sum, avg);
	}
}
