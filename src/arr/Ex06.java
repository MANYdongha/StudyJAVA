package arr;

public class Ex06 {
	public static void main(String[] args) {
		int[] a1 = {1,2,3};
	      int[] a2 = {10, 20, 30};
	      int[] a3 = {1};
	      
	      int[] arr = null;   //reference type member가 null인되는 것 (arr 변수가 바라보는 대상이 없다.)
	      //플레시메모리처럼 생각하면 된다.
	      arr = a1;
	      
	      System.out.print("arr : " );
	      for(int i = 0; i<arr.length; i++) {
	         System.out.print(arr[i] + " ");
	         System.out.print(i == arr.length -1 ? "\n" : ", ");
	      }System.out.println();
	      
	      
	      arr = a2;
	      
	      System.out.print("arr : " );
	      for(int i = 0; i<arr.length; i++) {
	         System.out.print(arr[i] + " ");
	         System.out.print(i == arr.length -1 ? "\n" : ", ");
	      }System.out.println();
	      
	      arr = a3;
	      
	      System.out.print("arr : " );
	      for(int i = 0; i<arr.length; i++) {
	         System.out.print(arr[i] + " ");
	         System.out.print(i == arr.length -1 ? "\n" : ", ");
	      }System.out.println();

	}
}
