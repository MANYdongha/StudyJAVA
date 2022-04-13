package gitHub;

import java.util.Scanner;

public class Day05_about_Switch_vs_If {
	public static void main(String[] args) {
	      String input;
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.println("입력: ");
	      input = sc.next();
	      
	      if(input.equals("사과")) {
	         System.out.println("apple");
	      }
	      else if(input == "바나나") {
	         System.out.println("banna");
	      }
	      else {
	         System.out.println("other");
	      }

	      
	      switch (input) {
	      case "사과":
	         System.out.println("apple");
	         break;

	      case "바나나":
	         System.out.println("banna");
	         break;
	      
	      default:
	         System.out.println("다른거");
	      }
	      
	      
	      sc.close();
	   }
}
