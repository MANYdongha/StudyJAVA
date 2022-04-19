package arr;


import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ex05 {
	public static void main(String[] args) {
		 //배열을 활용하여 랜덤 숫자 추출하여 저장하기
	      
	      Random ran = new Random();
	      
	      int[] arr = new int[6];
	      
	      
	      while(true) {
	         int num= ran.nextInt(45)+1;
	         boolean dupflag = false;
	         for(int i = 0; i<arr.length; i++) {
	            if(arr[i] == num) {
	               dupflag = true;
	               break;
	            }
	         }
	         
	         if(dupflag) continue;   //중복이면 이후코드 진행 X
	         
	         for(int i = 0; i< arr.length; i++) {
	            if(arr[i]==0) {
	               arr[i]=num;
	               break;
	            }
	         }
	         
	         boolean breakFlag = true;
	         for(int i = 0; i<arr.length; i++) {
	            if(arr[i] == 0) {
	               breakFlag = false;
	               }
	            }
	         if(breakFlag) break;
	   
	      }   //end of whole
	      
	      List<int[]> list = Arrays.asList(arr);
	      
	      list.sort(null);
	      
	      System.out.println("--------------------------");
	      for(int i = 0; i<list.size(); i++) {
	         System.out.println(Arrays.toString(list.get(i)));
	         
	      }
	      
	      for(int i = 0; i< arr.length; i++) {
	         System.out.print(arr[i] + (i!=arr.length -1 ? ", ": "\n"));   
	      
	      
	      }   //end of main
	   }
	
	}

