package ThreadException;

import java.util.Random;
import java.util.Scanner;

class Timer1 implements Runnable{
	private int Seccend;
	private Quiz q;
	private boolean over;
	
	
	
	public Timer1(int seccend) {
		this.Seccend = seccend;
	}

	
	
	public int getSeccend() {
		return Seccend;
	}



	public void setSeccend(int seccend) {
		Seccend = seccend;
	}



	public Quiz getQ() {
		return q;
	}



	public void setQ(Quiz q) {
		this.q = q;
	}

	public boolean isOver() {
		return over;
	}

	public void setOver(boolean over) {
		this.over = over;
	}



	@Override
	public void run() {
		int i;
		for(i=Seccend; i!= -1 && q.isOver() == false ; i--) {
			try {
				System.out.printf("남은시간 : [%02d : %02d]\n", i / 60, i % 60);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		over = true;
		if(i ==	 -1) {
			System.out.println("시간초과1");			
		}
		System.exit(0);
	}
}
//생성자로  second를 전달받아서 run()에서 0초까지 출력하는 클래스
class Quiz implements Runnable{
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	private int Seccend;
	private Timer1 t; 
	private boolean over;
	
	
	public int getSeccend() {
		return Seccend;
	}

	public void setSeccend(int seccend) {
		Seccend = seccend;
	}

	public Timer1 getT() {
		return t;
	}

	public void setT(Timer1 t) {
		this.t = t;
	}

	
	
	public boolean isOver() {
		return over;
	}

	public void setOver(boolean over) {
		this.over = over;
	}

	@Override
	public void run() {
		int num1  = ran.nextInt(9)+1; 
		int num2  = ran.nextInt(9)+1;
		int sum = num1 + num2;
		System.out.printf("%d + %d = \n",num1,num2);
		int result = sc.nextInt();
		over = true;
//		if(t.isOver()) {
//			System.out.println("시간초과2");
//		}
		System.out.println(result == sum ? "정답" : "오답");
		
	}
}

	//랜덤으로 1자리수 두개를 출력하고 두 수의 덧셈식을 출력한 후
	//사용자에게 답을 입력받아서, 정답인지 오답인지 판별하여 출력하는 클래스
public class Quiz01 {
	public static void main(String[] args) {
		Timer1 t = new Timer1(5);
		Quiz q = new Quiz();
		//타이머를 5초로 해서 객체를 생성
		//수식퀴즈 객체 생성
		
		t.setQ(q);
		q.setT(t);
		
		Thread th1 = new Thread(t);
		Thread th2 = new Thread(q);
		
		//수식퀴즈의 start를 호출하여 식을 보여주고 답을 입력받기
		//타이머 5초 start
		th2.start();
		th1.start();
		
		
		//시간안에 정답을 입력하먄 정답, 시간이 초과되거나, 답이 틀리면 오답출력
		
		
	}
}
