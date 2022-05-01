package accessModifier_Quest03_book;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      int menu;
      Scanner sc = new Scanner(System.in);
      Handler hd = new Handler();
      
      
      
      do {
         System.out.println();
         System.out.println("1. 목록보기");
         System.out.println("2. 추가하기");
         System.out.println("3. 검색 ");
         System.out.println("4. 삭제하기");
         System.out.println("0. 종료 ");
         System.out.print("선택 >>> ");
         menu = sc.nextInt();
         System.out.println();
         switch (menu) {
         case 1:
            hd.showList();
            break;
         case 2:
            hd.input(hd.inputPlace());
            break;
         case 3:
        	hd.findBook();
            break;
         case 4:
            hd.deleteList();
            break;
         case 0:
            System.out.println("시스탬을 종료합니다.");
            break;
 
         default:
            System.err.println("잘못된입력입니다.");
         }
      } while (menu!=0);
      
   sc.close();
   }
}
