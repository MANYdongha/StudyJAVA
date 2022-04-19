package arr;
//1)하나의 소스코드에는 하나의 public class 만 존재할 수 있다.
//2)public class의 이름은 소스파일의 이름과 일치해야한다.
//3)public class만 public static void main을 가질 수 있다.
//4)하나의 소스코드에 여러 클래스르 ㄹ작성할 수 있다(컴파일하면 .class파일이 분리된다.)
class Member{   // 클래스의 첫글자는 항상 대문자로 시작한다.
String name;
int age;

}

public class Ex03 {
	public static void main(String[] args) {
		 //이름과 나이를 하나의 클래스로 묶어서 표현하기
	      //class : 구조체(서로 다른 자료형을 묶는 사용자 정의 자료형) + 함수
	      //객체의 배열을 만들어서 처리하기
	      //객체의 배열을 정렬하기
	      
	      
	      
	      Member[] arr = new Member[7];   //배열은 reference type 그리고 Member을 담을 수 있는 빈칸
	      for(int i = 0; i<arr.length; i++) {   // NULL이 나온다.
	         System.out.print(arr[i] + " ");
	         
	         arr[i] = new Member();
	      
	      }
	      arr[0].name = "보아"; arr[0].age = 37;
	      arr[1].name = "슬기"; arr[1].age = 29;
	      arr[2].name = "웬디"; arr[2].age = 29;
	      arr[3].name = "윈터"; arr[3].age = 22;
	      arr[4].name = "카리나"; arr[4].age = 23;
	      arr[5].name = "태연"; arr[5].age = 34;
	      arr[6].name = "효연"; arr[6].age = 34;
	      
	      for(int i = 0; i<arr.length; i++) {   // NULL이 나온다.
	         String name = arr[i].name;
	         int age = arr[i].age;
	         System.out.printf("%s : %d살", name, age);
	         System.out.println();
	      }
	      
	      
	      
	      
	      
	      System.out.println();
	      int[] arr2 = new int[7];
	      for(int i = 0; i<arr2.length; i++) {
	         System.out.print(arr2[2] + " ");
	      }
	      
	      
	      
	      
	      
	      
	      
	      
	}
}
