package loop;

public class Ex05 {
	public static void main(String[] args) {
		for(int i=0;i<7; i++) {
	         for(int j=0; j<5; j++) {
	            
	            if(i==3 && j==2) {
	               System.out.print("  ");
	            }
	            if(i==3 && j==3) {
	               System.out.print("* ");
	               break;
	            }
	            if(i==4 && j==1) {
	               System.out.print("  ");
	            }
	            if(i==4 && j==1) {
	               System.out.print("  ");
	            }
	            if(i==4 && j==1) {
	               System.out.print("  ");
	            }
	            if(i==4 && j==1) {
	               System.out.print("* ");
	               break;
	            }
	            if(i==5 && j==2) {
	               System.out.print("  ");
	            }
	            else {
	               System.out.print("* ");
	            }
	            
	         }
	         
	   
	         System.out.println();
	      }
	      System.out.println();
	}
}
