package summary;
//함수를 사용하여 최소화
public class Ex01 {
	static int money = 100000;
	static int productCount = 0;
	
	static void 매입(int count, int price) {
		//구매 : 현재 잔고 - (갯수  * 금액)
		int totalPrice = count * price;
		money -= totalPrice;
		productCount += count;
		
	}
	static void 판매(int count, int price) {
		//판매 : count * price
		int totalPrice = count + price;
		money += totalPrice;
		productCount -= count;
		System.out.printf("수량 : %d, 보유금액 : %,d\n", productCount, money);
	}
	
	public static void main(String[] args) {
		//main함수는 프로그램을 시작하면 가장 먼저 실행이 되는 함수이다.
		매입(100, 500);		//수량 단가(100개를 500원에 매입)
		
		판매(3, 1500);		//수량 단가 (3개를 개당1500에 팜)
		판매(1, 1500);		//수량 단가 (1개를 개당1500에 팜)
		판매(20, 1500);		//수량 단가 (20개를 개당1500에 팜)
	}
}
