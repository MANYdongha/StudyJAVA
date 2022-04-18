package loop;

public class Ex02 {
	public static void main(String[] args) {
		int cnt = 0;
		
		for(int i =0; i<5; i++) {
			for(int j = 0; j<5; j++) {
//				System.out.printf("[%d, %d]", i,j); 좌표를 통한 위치확인
				cnt = i+j+1;
				if(cnt>5){
					cnt = 10-cnt;
				}
				System.out.printf("%10d", cnt);
				
			}
			System.out.println();
		}
		System.out.println();
	}
}
