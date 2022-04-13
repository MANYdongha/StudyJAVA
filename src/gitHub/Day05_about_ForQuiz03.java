package gitHub;

public class Day05_about_ForQuiz03 {
	public static void main(String[] args) {
	      
	      //은행에 돈을 입금한다.
	      //첫날에 10원 둘쨰날 20원 셋째날에는 40
	      //전날 입금한 돈의 2배를 준비하여 은행에 입금한다.
	      //30일이경과한 시점에서 은행에는 총얼마의 금액이 입금되어있는가?
	      //1 (10) 2 (20) 3 (40)
	      int day = 1;
	      long bank = 0;
	      long addMoney = 10;
	      
	   
	      while(day<=30) {
	         bank += addMoney;
	         addMoney *= 2;
	         day++;
	         
	         System.out.println(bank);
	         System.out.println(addMoney);
	         
	      }
	      System.out.println("입금한 금액 :" + bank);
	      
	      
	      
	      
	   }
}
