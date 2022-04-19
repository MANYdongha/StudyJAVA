package function;

import java.util.Arrays;

public class Ex04 {
	 static String arrayToString(int[] arr) {
	      String str ="[";
	      for(int i = 0; i<arr.length;i++) {
	         str += arr[i];
	         str += (i == arr.length -1) ? "]" : ",";
//	         //if(i == arr.leng-1){
//	            str += "]";
//	      }
//	      else {
//	         str +=",";
//	         
//	      }
	      
	      }   
	      return str;
	   }

	public static void main(String[] args) {
		 int[] arr = {2,7,8,4,6};
	      System.out.println(arr); //배열을 곧바로 출력하면 내용을 볼 수 없다.
	      
	      String arrString = Arrays.toString(arr); // 배열을 문자열 형태로 변환
	      System.out.println(arrString);  // 출력하면 내용을 활용할 수 있다.
	      
	      String myList = arrayToString(arr);
	      System.out.println(myList);
	      
	      Arrays.sort(arr);
	      myList = arrayToString(arr);
	      System.out.println(myList);
	      
	      
	   }
	}