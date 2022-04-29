package accessModifier_Quest01_TV;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Tv tv = new Tv();
      int tmpSond = 0;
      tv.showTV();
      Scanner sc = new Scanner(System.in);
      int menu;
      System.out.println();
      do {
         System.out.println();
         System.out.println("TV리모콘 구현");
         System.out.println("1. TV전원누르기");
         System.out.println("2. 음소거하기");
         System.out.println("3. 소리올리기+1");
         System.out.println("4. 소리줄이기-1");
         System.out.println("5. 체널위로 옮기기");
         System.out.println("6. 체널아래로 내리기");
         System.out.println("7. TV상태보여주기");
         System.out.println("0. 프로그램 종료");
         System.out.print("선택 >>> ");
         menu = sc.nextInt();
         System.out.println();
         switch (menu) {
         case 1:
            if(tv.isPower()==false) {
               
               System.out.println("TV가 켜집니다.");
               tv.setBrand("삼성");
               tv.setPower(true);
               tv.setSound(10);
               tv.setCh(1);
               tv.showTV();
               System.out.println();
               
            
            }
            else {
               
               System.out.println("TV가 종료됩니다.");
               tv.setPower(false);
               tv.setSound(0);
               tv.setCh(0);
               tv.showTV();
               System.out.println();
               
            }
            break;
         case 2:
            if(tv.isPower()==true) {
               tmpSond = tv.getSound();
               if(tv.getSound() != 0) {
               tv.setSound(0);
               System.out.println("소리상태 :" + tv.getSound());
               }
               else {
                  tv.setSound(tmpSond);
               System.out.println("소리상태 :" + tv.getSound());
               }
            }
            else {
               System.out.println("TV가 작동하지 않습니다.");   
               }
            
            break;
         case 3:
            if(tv.isPower()==true) {
               if(tv.getSound() == 100) {
                  System.out.println("최대음향입니다.");
                  break;
               }
               else {
               tv.setSound(tv.getSound()+1);
               }
            }
            else {
               System.out.println("TV가 작동하지 않습니다.");   
               }
            break;
         case 4:
            if(tv.isPower()==true) {
               if(tv.getSound() == 0) {
                  System.out.println("음소거생태입니다.");
                  break;
               }
               else {
               tv.setSound(tv.getSound()-1);
               }
            }
            else {
               System.out.println("TV가 작동하지 않습니다.");   
               }
            
            break;
         case 5:
            if(tv.isPower()==true) {
               if(tv.getCh() == 300) {
                  tv.setCh(1);
                  break;
               }
               else {
               tv.setCh(tv.getCh()+1);
               }
            }
            else {
               System.out.println("TV가 작동하지 않습니다.");   
               }
            
            break;
         case 6:
            if(tv.isPower()==true) {
               if(tv.getCh() == 0) {
                  tv.setCh(300);
                  break;
               }
               else {
               tv.setCh(tv.getCh()-1);
               }
               
            }
            else {
               System.out.println("TV가 작동하지 않습니다.");   
            }   
            break;
         case 7:
               tv.showTV();
            break;   
            
         default:
            if(menu == 0) {
               break;
            }
            else {
            System.out.println("잘못된입력입니다.");
            break;
            }
         }
      System.out.println();
      } while (menu!=0);
      
      
      
      sc.close();
   
      //TV클래스를 완성하고 사용자의 입력에 따라 
      //TV의 기능을 호출하는 코드를 아래에 작성하세요
   }
}