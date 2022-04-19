package function;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
			
		//길이가 자동으로 증가하는 배열을 만드세요
		//기본단위는 3입니다.
		//처음에 3짜리 정수 배열을 생성합니다.
		//0은 빈칸으로 취급합니다.
		//배열의 맴버요소가 값이 0이라면 빈칸이라면 사용자에게 정수를 입력받아서 저장합니다.
		//모든 맴버요소에 입력을 받았다면 빈칸이 남지 않습니다.
		//빈칸이 없다면 기존 배열보다 더 큰 배열을 새로 만들어서 기존 배열의 데이터를 같은 위치에 복사합니다.
		//다시 처음부터 진행하면서 빈칸인 곳애 숫자를 입력받습니다.
		//정수형 배열은 초기값이 0이므로 사용자가 0을 입력하면 반복을 중단하고 프로그램을 종료합니다.

		//입력: 1
		//입력: 2
		//입력: 3
		//출력: 1 2 3
		//입력: 11
		//입력: 22
		//입력: 33
		//출력 : 1 2 3 11 22 33
		//입력: 0
		//종료
		      
			Scanner sc = new Scanner(System.in);
		      
		      int[] arr = new int[3];
		      int[] tmp;
		      for(int i =0; i<arr.length; i++) {
		         System.out.print(arr[i] + " ");
		      }System.out.println();
		      
		       loop:while(true) {
		         for(int i = 0; i<arr.length; i++) {
		            if(arr[i] == 0) {
		               System.out.println("정수의길이 :" +  arr.length);
		               System.out.print("정수입력 :");
		               arr[i] = sc.nextInt();
		               if(arr[i] == 0) {
		                  break loop; 
		               }
		            }
		         }
		         
		         for(int i =0; i<arr.length; i++) {
		            if(arr[i] != 0)
		               System.out.print(arr[i] + " ");
		         }System.out.println();
		         
		         tmp = new int[arr.length + 3];
		         for(int i =0; i<arr.length; i++) {
		            tmp[i] = arr[i];
		            
		         }
		         arr = tmp;
		      
		      }
		      
		      System.out.println("출력");
		      for(int i = 0; i < arr.length; i++) {
		         if(arr[i] != 0)
		            System.out.print(arr[i] + " ");
		      } System.out.println();
		      
		      
		      
		      sc.close();
	}
}
