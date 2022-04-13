package gitHub;

import java.util.Scanner;

public class Day05_about_Switch2 {
	public static void main(String[] args) {
		
	
	//3과목 점수 입력후 합계평균을 구하고 성적을 아파벳으로 출력하기
    Scanner sc = new Scanner(System.in);
    int kor, eng, mat;
    double avg;
    String grade;    //A(90~100) B(~90) C(~80) D(~70) F(<60)
    
    System.out.println("세과목 점수 띄어쓰기로 표현");
    kor = sc.nextInt();
    eng = sc.nextInt();
    mat = sc.nextInt();
    
    avg = (kor + eng + mat) /3.00;
    
    
    
    switch((int)avg/10) {// 실수 리터럴 x
    case 10 : case 9 :
          grade="A";
          break;
       
    case 8 :
          grade="B";
          break;
       
    case 7:
          grade="C";
          break;
       
    case 6 :
          grade="D";
          break;
       
    default :
          grade="F";
          
       }
    
 
    System.out.printf("평균은 : %.2f 등급은 : %s입니다.\n",avg, grade);
    
    
    sc.close();
 }
}
