package loop;

public class Ex01 {
	public static void main(String[] args) {
		//별찍기
		for(int i=0; i<5; i++) {
			for(int j=0;j<5; j++) {
				boolean flag = i == j || i+j ==4;
				System.out.print(flag ? "* " : "  ");
			}
			System.out.println();
		}
		System.out.println();
		
	}
}
