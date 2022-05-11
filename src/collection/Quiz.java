package collection;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Board implements Comparable<Board>{
	String title;				//제목
	int viewCount;				//조회수
	double starScore;			//별점

	public Board(String title, int viewCount, double starScore) {

		this.title = title;
		this.viewCount = viewCount;
		this.starScore = starScore;
		

	}
	
	@Override
	public String toString() {
		return String.format("%-10s\t%d\t%.1f", title, viewCount, starScore);
	}
	
	
	@Override
	public int compareTo(Board o) {
		System.out.println(o.starScore);
		return o.starScore > o.starScore ? 1 : -1;
	}
}




public class Quiz {
	static void showList(List<Board> list) {
		System.out.printf("%-10s\t%s\t%s\n", "제목", "조회수", "별점");
		System.out.println("=================================");
		for(int i=0;i<list.size(); i++) {
			System.out.println(list.get(i));
		}System.out.println();
	}
	

	
	static int compareByView(Board o1, Board o2) {
		return o1.viewCount - o2.viewCount;				
	}
	
	static int compareByTitle(Board o1, Board o2) {
		return o1.title.compareTo(o2.title);	
	}
	static double compareByStar(Board o1, Board o2) {
		return o1.starScore - o2.starScore;		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Board[] arr =  {
			new Board("암살", 5, 2.2),
			new Board("기생충", 12, 3.1),
			new Board("친구", 2, 2.4),
			new Board("한돈", 7, 3.9),
			new Board("타짜", 15, 4.2),
		};
		
		List<Board> list = Arrays.asList(arr);
		showList(list);
		
		// 제목으로 오름차순 / 내림차순 
		// 조회수로 오름차순 / 내림차순 
		// 별점으로 오름차순 / 내림차순
		
		//1) 기본정렬형식은 별점높은 순으로 정렬되게 만들어 주세요.
		
		//2) do while / switch로 3개의 속성 각 오름차순 내림차순 6개의 형식을 만들어주세요
		//사용자가 각각의 정렬메뉴를 선택하면 정렬한 형태로 출력
		
		
		int menu;
		do {
			System.out.println("1.별점높은순 (기본값)");
			System.out.println("2.오름차순으로 출력하기");
			System.out.println("3.내림차순으로 출력하기");
			System.out.println("0. 종료");
			System.out.print("입력 >>> ");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				list.sort(null);
				showList(list);
				break;
			case 2:
				do {
					System.out.println("1.이름으로 오름차순");
					System.out.println("2.조회수로 오름차순");
					System.out.println("3.별점으로 오름차순");
					System.out.print("입력 >>> ");
					menu = sc.nextInt();
					switch (menu) {
					case 1:
						for(int i=0; i<list.size();i++) {
							for(int j=i; j<list.size(); j++) {
								if((compareByTitle(list.get(i), list.get(j)))>0){
									Board tmp = list.get(i);
									list.set(i, list.get(j));
									list.set(j, tmp);
									
								}
							}
						}
						
						showList(list);
						break;
					case 2:
						
						break;
					case 3:
						
						break;

					case 0:
						System.out.println("종료");
						break;
					}
				} while (menu !=0);
				break;
			case 3:
				do {
					System.out.println("1.이름으로 ");
					
				} while (menu !=0);
				break;

			case 0:
				System.out.println("\n프로그램종료합니다.\n");
				break;
			
			}
		} while (menu != 0);
		
		

		
		sc.close();
		
	}
}

