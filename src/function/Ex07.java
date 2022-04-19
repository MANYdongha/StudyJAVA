package function;

public class Ex07 {
	static String convertByte(long l) {
	      String result;
	      String str = null;
	      int cnt = 0;
	      
	      while(true){
	         l /= 1024;
	         cnt++;
	         if(1024>=l) {
	            break;
	         }
	   
	      }
	      
	   //   String l1 = String.valueOf(l);
	      
	      if(cnt == 1) {
	         str = "KB"; 
	         
	      }
	      else if(cnt == 2) {
	         str = "MB";
	         
	      }
	      else if(cnt == 3) {
	         str = "GB";
	         
	      }
	      
	      
	      result = l + str;
	      
	      
	      
	      
	      
	      return result;
	   }
	public static void main(String[] args) {
		 //컴퓨터에서 파일의 크기는 byte단위로 계산한다.
	      //BYTE는 이진수에 기반을 두고 있어서 1000단위가 아니라 1024(2^10)을 기준으로 한다.
	      //따라서 1024 BYTE = 1KB, 1024KB = 1MB, 1024MB = 1GBR가 된다.
	      //바이트 수를 받아서 1024보다 작은 수와 단위를 합친 문자열로 반환하는 함수를 작성하시오
	   
	      String s1 = convertByte(1457664);
	      System.out.println(s1);         //1.44MB
	      
	      
	      
	   }
	}