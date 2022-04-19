package function;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
    
    int test = sc.nextInt();
    
    if( 90<=test && test <=100) {
       System.out.println('A');
    }
    else if( 80<=test && test <=89) {
       System.out.println('B');
    }
    else if( 70<=test && test <=79) {
       System.out.println('C');
    }
    else if( 60<=test && test <=69) {
       System.out.println('D');
    }
    else {
       System.out.println('F');
    }
          
    
    sc.close();
    
	}
}

