package gitHub;

public class Day05_about_for {
	public static void main(String[] args) {
		// X 그리기
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
			//System.out.printf("[%d, %d]", i,j); 좌표를 출력하여 위치를 확인하기에 좋은방법
			 boolean flog =  i == j || i+j==4;
			 System.out.print(flog ? "* " : " ");
				
				
			}
			System.out.println();
			
		}
		System.out.println();
		
		
		
		
		
		
		
		
	}//main
	
}
