package gitHub;

import java.util.Scanner;

public class Day05_about_for4 {
	public static void main(String[] args) {
		// 3등분 나눠서 별찍기
		// 코드를 더 직관적으로 볼 수 있음
		//홀수로 입력을 받아서 입력받은 값을 길이로 별찍기
		int space = 2;
		int star = 1;
		int length;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("길이입력 : ");
			length = sc.nextInt();
			if(length %2 !=0) {
				break;
			}
			System.out.println("홀수로 다시입력부탁드립니다.");
			
			
		}
		space = length /2;
		
		for(int i=0; i<length; i++) {
			for(int j=0; j<space; j++) {
				System.out.println("  ");
			}
			for(int j=0; j<star; j++) {
				System.out.println("* ");
			}
			for(int j=0; j<space; j++) {
				System.out.println("  ");
			}
			System.out.println();
			if(i<length/2) {
				space -=1;
				star +=2;
			}
			else {
				space +=1;
				star -=2;
			}
		}
		System.out.println();
		
		
		sc.close();
		
	}
}
