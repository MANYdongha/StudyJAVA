package ThreadException;

class Timer1 implements Runnable{
	int Seccend;
	
	
	
	
	public Timer1(int seccend) {
		this.Seccend = seccend;
	}

	@Override
	public void run() {
		
	}
}
//생성자로  second를 전달받아서 run()에서 0초까지 출력하는 클래스
class Quiz implements Runnable{

	
	
	
	
	
	@Override
	public void run() {
		
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
		
		
		//수식퀴즈의 start를 호출하여 식을 보여주고 답을 입력받기
		//타이머 5초 start
		
		//시간안에 정답을 입력하먄 정답, 시간이 초과되거나, 답이 틀리면 오답출력
		
		
	}
}
