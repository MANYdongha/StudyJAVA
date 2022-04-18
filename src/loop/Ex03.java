package loop;

public class Ex03 {
	public static void main(String[] args) {
		for(int i = 0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.println("* ");
			}
		}System.out.println();
		
		System.out.println();
		for(int i = 0; i<5; i++) {
			for(int j=0; j<5; j++) {
				boolean flag = j>=i;
				System.out.println(flag ? "* " : "  ");
			}
			System.out.println();
		}
		System.out.println("============================================");
	
		for(int i=0; i<5; i++) {
			for(int j =0; j<5; j++) {
				boolean flag = (5-1) -i <= j;
				System.out.print(flag ? "* " : " ");
			}
			System.out.println();
		}
		System.out.println("==============================================");
		
		int star = 1;
		int space = 4;
		
		for(int i=0; i<5; i++) {
			for(int j=0;j<space; j++) {
				System.out.println();
			}
			for(int j=0; j<star; j++) {
				System.out.println("* ");
			}
			System.out.println();
			space -=1;
			star +=1;
		}
		
		
		
		
	}//end of main
}
