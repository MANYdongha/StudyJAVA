package function;

public class Ex05 {
	static void showArr(int[] arr, boolean reverse) {   //오버로딩도 사용가능하다.
	      int tmp = 0;
	      for(int i=0; i<arr.length; i++) {
	         for(int j = 0; j<arr.length; j++) {
	            if(arr[i] > arr[j] != reverse) { //true
	               tmp = arr[i];
	               arr[i] = arr[j];
	               arr[j] = tmp;
	               
	            }
	            
	         }
	      }
	   }   
//  else {
//  int tmp = 0;
//  for(int i=0; i<arr.length; i++) {
//     for(int j = 0; j<arr.length; j++) {
//        if(i < j) {
//           tmp = arr[i];
//           arr[i] = arr[j];
//           arr[j] = tmp;
//           
//        }
//     }
//  }
//  
//}

	 static void showArr(int[] arr) {
	      System.out.print("[");
	      for(int i=0; i<arr.length; i++) {
	         System.out.print(arr[i]);
	         System.out.print(i == arr.length -1 ? "]" : ",");
	      }
	      
	   }


	public static void main(String[] args) {
		 int[] arr = {2, 7, 8, 4, 6};
	      
	      showArr(arr);         //[2, 7, 8, 4, 6]
	      showArr(arr, false);   //reverse = false, 오름차순
	      showArr(arr);         //[2, 5, 6, 7, 8]
	      showArr(arr, true);      //reverse = true, 내림차순
	      showArr(arr);
	      
//	      System.out.print("[");
//	      for(int i=0; i<arr.length; i++) {
//	         System.out.print(arr[i]);
//	         System.out.print(i == arr.length -1 ? "]" : ",");
//	      }
//	      System.out.println();
//	      int tmp = 0;
//	      for(int i=0; i<arr.length; i++) {
//	         for(int j = 0; j<arr.length; j++) {
//	            if(arr[i] > arr[j]) {
//	               tmp = arr[i];
//	               arr[i] = arr[j];
//	               arr[j] = tmp;
//	               
//	            }
//	         }
//	      }
//	      
//	      System.out.print("[");
//	      for(int i=0; i<arr.length; i++) {
//	         System.out.print(arr[i]);
//	         System.out.print(i == arr.length -1 ? "]" : ",");
//	      }
//	      
	      
	   }
	}