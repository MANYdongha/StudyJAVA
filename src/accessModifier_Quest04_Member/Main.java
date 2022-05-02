package accessModifier_Quest04_Member;

import java.util.Scanner;

public class Main {

   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Handler hd = new Handler();
//      arr[0] = new Member("홍길동", 20);
//      arr[1] = new Member("이길동", 18);
//      arr[2] = new Member("이지은", 30);
      //목록, 추가, 검색, 삭제
      int menu = 0;
      do {
         System.out.println("1. 목록보기");
         System.out.println("2. 추가");
         System.out.println("3. 검색");
         System.out.println("4. 삭제");
         System.out.println("0. 종료");
         System.out.print("선택 >>> ");
         menu = sc.nextInt();
         switch (menu) {
         case 1:
            hd.showList();
            break;
         case 2:
            hd.addList();
            break;
         case 3:
            hd.findData1();
            break;
         case 4:
        	hd.delet();
            break;
         case 0:
            System.out.println("프로그램 종료합니다.");
            break;

         default:
            break;
         }
         
         
      } while (menu != 0);
      
      sc.close();
   }
}