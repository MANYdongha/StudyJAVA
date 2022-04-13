package gitHub;

import java.util.Scanner;

public class Day04_about_Control_Quiz1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num, num1,num3, num4, num5, num6;
      boolean resutl = false;
      
      
//      1) 정수를 입력받아서, 정수가 홀인지 짝수인지 판별하시오
      System.out.println("홀짝인지 정수판별 : ");            //수정 보안이 필요함. 다시입력받을 수 있게 하는 로직의 수정 및 보안이 필요! 
      num = sc.nextInt();   
      if(num % 2 == 0) {
         System.out.println("짝수입니다.");
      }
      else if(num % 2 != 0) {
         System.out.println("홀수입니다.");
      }
      else {
         System.out.println("잘못된 입력입니다.");
      }
      
      System.out.println();
//      2) 정수를 입력받아서, 정수가 3의 배수이면서 5의배수이면 true를 출력하시오.
      System.out.println("true or false으로 정수 출력 : ");
      num1 = sc.nextInt();
      
      if(num1 % 3 == 0) {
         if(num1 % 5 == 0) {
            resutl = true;
            System.out.println(resutl);
         }
         else {
            System.out.println(resutl);
         }
      }
      else {
         System.out.println(resutl);
      }
      
      
      
      System.out.println();
//      3) 지할철 1구간 당 3분이 걸린다고 가정하고, 구간수를 입력받아 시간을 출력하세요 시간은 분단위로 출력하며, 만약 60분을 초과한다면 시간과 분을 분리하여 출력하시오.
      System.out.println("지하쳘 구간수 입력 : ");
      num3 = sc.nextInt();
      
      num3 *= 3;
      if(0 < num3 && num3 < 60 ) {
         System.out.printf("%d분 소요됩니다.", num3);   
      }
      else if(num3 >= 60) {
         num4 = num3 / 60;
         num3 %= 60;
         System.out.printf("%d시간 %d분 소요됩니다.", num4, num3);
         
      }
      else {
         System.out.println("잘못된입력입니다.");
      }
      System.out.println();
      System.out.println();
//      4) 3개의 정수를 입력받아서, 가장큰수를 찾아서 출력하세요
      System.out.println("정수3개 입력");
      num4 = sc.nextInt();
      num5 = sc.nextInt();
      num6 = sc.nextInt();
   
      if(num4 == num5 && num4 == num6) {
         System.out.println(num4);
      }
      if(num4 == num5 || num4 == num6) {
         if(num4 > num6) {
            System.out.println(num4);
         }
         else {
            System.out.println(num6);
         }
      }
      else if(num4 > num5) {
         if(num4 > num6) {
            System.out.println(num4);
         }
         else if(num6 > num4) {
            System.out.println(num6);
         }
         else {
            System.out.println("1.잘못된입력입니다.");
         }
      }
      else if(num5 > num4) {
         if(num5 > num6) {
            System.out.println(num5);
         }
         else if(num6 > num5) {
            System.out.println(num6);
         }
         else {
            System.out.println("2.잘못된입력입니다.");
         }
      }
      else if(num6 > num5){
         if(num6 > num4) {
            System.out.println(num6);
         }
         else if(num4 > num6) {
            System.out.println(num4);
         }
         else {
            System.out.println("3.잘못된입력입니다.");
         }
      }
      else {
         System.out.println("4.잘못된입력입니다.");
      }
      
      
      
      
      
      sc.close();
   }
}