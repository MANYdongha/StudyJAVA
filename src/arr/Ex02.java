package arr;

public class Ex02 {
	public static void main(String[] args) {
	    
	      int[] arr = new int[] {2, 7, 8, 4 ,6};
	      for(int i =0; i<arr.length; i++) {
	         System.out.print(arr[i]);
	         System.out.print(i == arr.length -1 ? "\n" :", ");
	      }System.out.println();
	   
	      
	      //정렬
	      
	      int cnt2=0;
	      for(int i = 0; i< arr.length-1; i++) {
	         System.out.printf("%d번째와", i);
	         for(int j = i+1; j<arr.length; j++) {
	            System.out.printf("%d번째를 비교\n", i, j);
	            if(arr[i] > arr[j]) {
	               int tmp = arr[i];
	               arr[i] = arr[j];
	               arr[j] = tmp;
	               cnt2++;
	               
	            }
	         }
	      }
	      
	      
	      System.out.println(cnt2);
	      System.out.println();
	      
	      
	      System.out.println("arr : ");
	      
	}
}
