package summary;
//재귀함수
public class Ex02 {
	public static void main(String[] args) {
		//재귀함수
		//Recursive funtion
		//함수가 자기자신을 다시호출하는 함수
		//factorial(n) => 4*3*2*1 => 24
		
		int n1 = factorial_wile(4);
		int n2 = factorial_recursive(4);
		
		System.out.println(n1);
		System.out.println(n2);
		
		
		
		
	}

	private static int factorial_recursive(int i) { //제귀함수를 사용함
		if(i!=0) {
			return i * factorial_recursive(i -1);
		}
		else {
			return 1;			
		}
	}

	private static int factorial_wile(int i) {//while 문을 사용함
		int result = 1;
		while(i != 0 ) {
			result *= i;
			i--;
		}
		
		return result;
	}
}
