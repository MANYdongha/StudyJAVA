package summary;

import java.util.Random;
import java.util.Scanner;

class Weapon{
   String name;
   int lv = 0;
   int atk;
   
   public Weapon(String name, int atk) {
      this.name = name;
      this.atk = atk;
   }
   
   public void show() {
      String format = "[%s %s) 공격력 %d]\n";
      System.out.printf(format, (lv != 0 ? lv : ""), name, atk);
      
   }   
   

}


public class Quiz01 {
		static int datumPoint = 10;
		   private static Weapon enhance(Weapon sword) {
		      Random ran = new Random();
		      int num = ran.nextInt(10)+1;
		      
		      if(sword.lv < 5) {
		         sword.lv++;
		         sword.atk +=2;
		         datumPoint = 10;
		         System.out.println("강화성공");
		         return sword;
		      }
		      
		         
		         if(num<datumPoint) {
		            sword.lv++;
		            sword.atk +=2;
		            System.out.println("강화실패확률 : "+ num +"0% /"+ "무기강화성공확률 : " +" "+ datumPoint+"0%\n");
		            System.out.println("강화성공");
		            datumPoint--;
		            
		         }
		         else {
		            sword.lv--;
		            sword.atk -=2;
		            System.out.println("강화실패확률 : "+ num +"0% /"+ "무기강화성공확률 : " + datumPoint+"0%\n");
		            System.out.println("강화실패");
		            datumPoint++;
		         }
		         
		      
		      
		      
		      
		      
		      return sword;
		   }
		   
		   public static void main(String[] args) {
		      //게임 무기강화 시물레이션
		      //1) 기본무기 : 목검, 공격력 : 1
		      //2) 강화레벨당 추가 공격력 : +2
		      //3) 강화에 사용되는 비영 : 500
		      //4) 초기 보유금액 10,000원
		      //5) 강화 확률: 5레벨 까지는 100%확률, 이후부터는 단계가 오를때마다 10%확률 감소
		      //6) 주어진 금액으로 강화를 시도하여 누가 가장 높은 단계까지 올라갈 수 있는가
		      //7) 강화 실패 패널티 : 무기 레벨 1감소
		      Scanner sc = new Scanner(System.in);
		      Weapon sword =  new Weapon("목검", 1);
		      sword.show();
		      
		      int menu;
		      int money = 10000;
		      while(money != 0){
		         System.out.println("남은금액 : " + money );
		         System.out.println("1. 강화");
		         System.out.println("2. 상태확인");
		         System.out.println("0. 종료");
		         System.out.println("선택 >>>");
		         menu = sc.nextInt();
		         System.out.println();
		         
		         switch (menu) {
		         case 1:
		            money -= 500;
		            sword = enhance(sword);
		            break;

		         case 2: 
		            sword.show();
		            break;
		            
		         case 0:
		            System.out.println("종료합니다.");
		            break;
		         
		         default:
		            System.out.println("잘못된입력입니다.");
		            
		         }
		         sword.show();
		         
		         
		      }
		      
		      
		      
		      sc.close();
		   }
		
	}

