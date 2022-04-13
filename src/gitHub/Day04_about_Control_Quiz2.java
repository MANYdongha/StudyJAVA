package gitHub;

import java.util.Random;
import java.util.Scanner;

public class Day04_about_Control_Quiz2 {

	 public static void main(String[] args) {
//       3개의 엘리베이터ABC가 있다
//       사용자가 현재 층수를 입력하면 가장 가까운 엘리베이터가 이동하게 만들고 싶다
//        A B C는 1층에서 15층 사이를 운행하며 프로그램 실행시마다 랜덤으로 위치가 결정된다.
//       정수형태로 사용자가의 층수를 입력받아서 어떤 엘리베이터가 움직이는지 출력하세요
    
       Random ran = new Random();
       Scanner sc = new Scanner(System.in);
       
       
       int a, b, c, user, small = 0, here = 0;
       
       a = ran.nextInt(15) + 1;
       b = ran.nextInt(15) + 1;
       c = ran.nextInt(15) + 1;
       
       System.out.printf("A : %d, B : %d, C : %d \n", a, b, c);
       
       System.out.println("지금 몇층인가요?? : ");
       user = sc.nextInt();
       // a=13   b=7  c=14 u=7
       // 6     0     6s
       a -= user;
       if(a < 0) a*=-1;         
       
       b -= user;
       if(b < 0) b*=-1;
       
       c -= user;
       if(c < 0) c*=-1;
       
       
       
       if(a == b && b == c) {
          System.out.println("a가 움직임");
          return;
       }
       else if (a == b){
          if(a >= c) {
             System.out.println("c가 움직임");
             return;
          }
          if(a < c) {
             System.out.println("a가 움직임");
             return;
          }
 
       }
       else if(a==c) {
          if(a >= b) {
             System.out.println("b가 움직임");
             return;
          }
          if(a < b) {
             System.out.println("a가 움직임");
             return;
          }
       }
       else {
          // 3  2  6
          if(a > b) {System.out.println("b가 움직입니다."); return;}
          if(b > c) {System.out.println("c가 움직입니다."); return;}
          if(c > a) {System.out.println("a가 움직입니다."); return;}
          
          
       }
       
    
 
 sc.close();      
 }
 
 
}
