package function;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Ex06 {
	 //메서드 오버로딩 : 함수의 이름을 같지만 매개변수의 자료형과 갯수에 따라 처리가 가능하다.(매개변수로 구분)
	   //매개변수와 인자값의 자료형은 같아야한다.
	   
	   static int sum(int n1, int n2) {
	      
	      return 0;
	   }
	   static int sum(int n1, int n2, int n3) {
	      
	      return 0;
	   }
	   static double sum(int n1, double n2) {
	      
	      return n1 + n2;
	   }
	   static double sum(double n1, double n2) {
	      
	      return n1 + n2;
	   }

	   public static void main(String[] args) throws IOException {
	         
		      // 정수 2개의 합을 반환하는 함수
		      int n1 = sum(10, 20);
		      // 정수 3개의 합을 반환하는 함수
		      int n2 = sum(10, 20, 30);      
		      // 정수 실수의 합을 반환하는 함수
		      double n3 = sum(10, 20.0);
		      // 실수와 정수의 합을 반환하는 함수
		      double n4 = sum(10.0, 20);
		      // 실수 2개의 합을 반환하는 함수
		      double n5 = sum(10.0, 20.0);
		      
		      
		      //new Scanner <- 스케너 객체를 생성하는 함수
		      Scanner sc1 = new Scanner(System.in);
		      //sc1은 시스템 기본입력을 받아서 읽어내는 스캐너   //input Stream
		      Scanner sc2 = new Scanner("문자열");
		      //sc2는 문자열을 읽어내는 스캐너            //String
		      Scanner sc3 = new Scanner(new File(("a.text")));
		      //sc3은 (파일)을 읽어내는 스캐너            //File
		      
		      
		      
		   }
		}
