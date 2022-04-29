package accessModifier_Quest02_Vm;


import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Drink can = new Drink();
      Vm vm = new Vm();
      int cnt1 = 10;
      int cnt2 = 10;
      int cnt3 = 10;
      int cnt4 = 10;
      int cnt5 = 10;
      
      System.out.println("돈을 넣으세요>> ");
      int money=sc.nextInt();//외부에서 돈을 넣는다.
      vm.setMoney(money);
      
      
      while(true){
         if(vm.getMoney()==0) {
            System.out.println("이용해주셔서 감사합니다.");
            break;
         }
         if(vm.getMoney() >= vm.Area1Price()) {
         System.out.println("1.콜라");
         }
         if(vm.getMoney() >= vm.Area2Price()) {
         System.out.println("2.사이다");            
         }
         if(vm.getMoney() >= vm.Area3Price()) {
         System.out.println("3.게토레이");
         }
         if(vm.getMoney() >= vm.Area4Price()) {
         System.out.println("4.포카리");
         }
         if(vm.getMoney() >= vm.Area5Price()) {
         System.out.println("5.여명");
         }
         System.out.println("6.잔돈반환");
         System.out.print("메뉴를 고르세요>> ");
         
         int button = sc.nextInt();
         System.out.println("현재금액"+vm.getMoney());
         System.out.println();
         if(button == 1) {
            if(cnt1 == 1) {
               System.out.println("재고가없습니다..");
               continue;
            }
            vm.setMoney(vm.getMoney()-vm.Area1Price());
            System.out.println("콜라짤랑~");
            System.out.println();
            System.out.println(vm.getArea1().length);
            vm.setArea1(vm.reArea1(cnt1));
            cnt1--;
            System.out.println(cnt1);
            
         }
         if(button == 2) {
            System.out.println("사이다짤랑~");
            if(cnt2 == 1) {
               System.out.println("재고가없습니다..");
               continue;
            }
            vm.setMoney(vm.getMoney()-vm.Area2Price());
            System.out.println("사이다짤랑~");
            System.out.println();
            System.out.println(vm.getArea2().length);
            vm.setArea1(vm.reArea2(cnt2));
            cnt2--;
            System.out.println(cnt2);
            
            System.out.println();
         }
         if(button == 3) {
            if(cnt3 == 1) {
               System.out.println("재고가없습니다..");
               continue;
            }
            vm.setMoney(vm.getMoney()-vm.Area3Price());
            System.out.println("게토레이짤랑~");
            System.out.println();
            System.out.println(vm.getArea3().length);
            vm.setArea1(vm.reArea3(cnt3));
            cnt3--;
            System.out.println(cnt3);
         }
         if(button == 4) {
            if(cnt4 == 1) {
               System.out.println("재고가없습니다..");
               continue;
            }
            vm.setMoney(vm.getMoney()-vm.Area4Price());
            System.out.println("포카리짤랑~");
            System.out.println();
            System.out.println(vm.getArea4().length);
            vm.setArea1(vm.reArea4(cnt4));
            cnt4--;
            System.out.println(cnt4);
         }
         if(button == 5) {
            if(cnt5 == 1) {
               System.out.println("재고가없습니다..");
               continue;
            }
            vm.setMoney(vm.getMoney()-vm.Area5Price());
            System.out.println("여명짤랑~");
            System.out.println();
            System.out.println(vm.getArea5().length);
            vm.setArea1(vm.reArea5(cnt5));
            cnt5--;
            System.out.println(cnt5);
         }
         if(button == 6) {
            System.out.println("잔돈이 반환됩니다. 잔돈 : " + vm.getMoney());
            vm.setMoney(0);
            System.out.println();
         }
         if(vm.getMoney() < 800) {
            System.out.println("잔돈이 반환됩니다. 잔돈 : " + vm.getMoney());
            vm.setMoney(0);
            System.out.println();
         }
                  
      
         System.out.println();
      }
      
      
      
      
      
      
      sc.close();
   }
}