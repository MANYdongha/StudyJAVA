package ThreadException;

import java.util.ArrayList;
import java.util.Scanner;

class Timer{
	private int seccond;

	public int getSeccond() {
		return seccond;
	}

	public void setSeccond(int seccond) {
		this.seccond = seccond;
	}

	public void start() throws InterruptedException {
		for(; seccond != -1; seccond--) {
			System.out.printf("남은시간 : [%02d : %02d]\n",seccond/60,seccond%60);
			Thread.sleep(1000);
		}
		
	}
	
	
	
	
}

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Timer ob1 = new Timer();
		
		ArrayList<String> list = new ArrayList<String>();
		ob1.setSeccond(3);
		
		try {
			ob1.start();
		} catch (InterruptedException e) {}
		while(ob1.getSeccond() != -1) {
			System.out.println("문자열 입력");
			list.add(sc.nextLine());
			
		}System.out.println("list : " + list);
		sc.close();
		
//		try 	: 	예외발생가능성이 있는 코드를 작성한다.
//		catch 	: 	지정한 타입의 예외가 발생하면, 예외객체를 매개변수 형식으로 받아서 코드를 수행한다.
//		finally : 	예외발생여부에 상관없이 항상 코드를 수행한다.
//		throw 	: 	예외객체를 생성하고 , 생성한 예외를 catch가 받을 수 있도록 던진다.
//		throws 	: 	현재 함수 내부에서 발생한 예외를 처리하지 않고, caller에게 예외 처리 책임을 전가한다.
//예외가 많이 터지는 곳 : 입출력 sql  네트워크 Thread 
		
	}
}
