package gitHub;

import java.util.Random;
import java.util.Scanner;

public class Cay04_about_Control_Quiz3 {
	public static void main(String[] args) {
		

    Random ran = new Random();
    Scanner sc = new Scanner(System.in);
    String msg = null;
    
    //가위(-1) 바위(0) 보(1)
    
    int cpu = ran.nextInt(3) -1; //3개의 숫자중 하나를 가져온다 0부터 시작
    
    
    System.out.println("가위바위보 가위(-1) 바위(0) 보(1) 입력 : ");
    int user = sc.nextInt();
    
    if(cpu == -1) {
       System.out.println("컴퓨터 ✌");
    }
    else if(cpu == 1) {
       System.out.println("컴퓨터 🖐");
    }
    else {
       System.out.println("컴퓨터 ✊");
    }
    
    if(user == -1) {
       System.out.println("user ✌");
    }
    else if(user == 1) {
       System.out.println("user 🖐");
    }
    else {
       System.out.println("user ✊");
    }
    
    if(cpu == user) {
       System.out.println("무승부입니다.");   
    }
    else {
       if(cpu == -1 && user == 0) {
          msg = "user";
       }
       else if(cpu == -1 && user ==1) {
          msg = "cpu";
       }
       else if(cpu == 0 && user ==-1) {
          msg = "user";
       }
       else if(cpu == 0 && user ==1) {
          msg = "cpu";
       }
       else if(cpu == 1 && user ==0) {
          msg = "cpu";
       }
       else if(cpu == 1 && user ==-1) {
          msg = "user";
       }
       System.out.println(msg + "가 승리하였습니다.");
    }
    
    
    
    sc.close();
 }
}
