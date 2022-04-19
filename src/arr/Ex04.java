package arr;

import java.util.Arrays;
import java.util.List;

class Member2{
	   String name;
	   int age;
	   
	   Member2(String name, int age){
	      this.name = name;
	      this.age = age;
	      
	   }

	   @Override
	   public String toString() {
	      return String.format("%s : %d", name, age);
	   }
	   
	   
	   
	   
	}//end of Member2

public class Ex04 {
	public static void main(String[] args) {
		 Member2[] arr = {
		         new Member2("보아", 37),   
		         new Member2("슬기", 29),   
		         new Member2("웬디", 29),   
		         new Member2("윈터", 22),   
		         new Member2("카리나", 23),   
		         new Member2("태연", 34),   
		         new Member2("효연", 34),   
		         
		      };
		      List<Member2> list = Arrays.asList(arr);
		      System.out.println(list);
		      
		      
		      list.sort((a,b) -> {return a.age - b.age;}); //람다식 정렬sort함수 사용할 때 필수!
		      System.out.println(list);   //음수가 될경우 자리를 이동시킨다.
		      System.out.println();
		      
		      list.forEach(System.out::print );   //foreach문
		      
	}
}
