package gitHub;

public class Day05_about_ForQuiz01 {
	public static void main(String[] args) {
//      1)1부터 10까지의 합계구하기
      int sum = 0;
      for(int i = 1; i<11; i++) {
         sum += i;
      }
      System.out.println("sum : " + sum);
      System.out.println();
      
//      2)부터 100사이의 7의 배수만 출력하기
      for(int i=0; i<100; i++) {
         if(i % 7 ==0) {
            System.out.print(i + " ");
         }
      }
      System.out.println();
      System.out.println("-----------------------------------------------------");
      
      for(int i=7; i<100; i+=7) {
         System.out.print(i + " ");
         
      }System.out.println();
      System.out.println();
      
//      3)특정조건에 맞는 요소 하나만 찾아서 출력하기
      for(int i=1; i<101; i++) {
         if(i%21 == 0 && i !=21) {
            System.out.print(i);
            break;
         }
      }
      System.out.println();
      System.out.println();
      
//      4)반복문으로 일정한 패턴의 출력 만들기
      for(int i = 0; i<5; i++) {
         for(int j =1; j<= i+1; j++) {
            System.out.print("* ");
         }
         System.out.println();
      }
      System.out.println();
      
      
   }
}
