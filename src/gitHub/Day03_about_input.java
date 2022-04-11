package gitHub;

import java.util.Scanner;

public class Day03_about_input {
	public static void main(String[] args) {
		//Scanner 함수를 이용하여 입력받기
		Scanner sc = new Scanner(System.in);
		boolean realage;
		System.out.println("먹고싶은 음식 : ");
		String food = sc.next();
		System.out.println(food);
		
		//Scanner 같은 경우 문자열로 입력을 받아온다.
		//그래서 따로 자료형을 작성할 필요가 없다.
		
		System.out.println("나이입력  : ");
		int age = sc.nextInt();
		System.out.println(age);
		// nextInt는 문자열로 받아온 입력값들을 Integer로 변경후 int로 조작하여 가져온다.
		// age를 문자열로 가져올경우
		String str = Integer.toString(age);
		System.out.println("str 자료형은 : " + str.getClass().getSimpleName());
		//문자열을 int로 가져올경우
		age = Integer.parseInt(str); 
		System.out.println("age 자료형은  int ? : " + ((age==30) ? true : false ));
		
		sc.close();
	}
}
