package accessModifier_Quest04_Member_ver_Buffer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

   
   public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     Handler hd = new Handler();
//      arr[0] = new Member("홍길동", 20);
//      arr[1] = new Member("이길동", 18);
//      arr[2] = new Member("이지은", 30);
      //목록, 추가, 검색, 삭제
      int menu = 0;
      do {
    	  System.out.println("1. 리스트보기");
    	  System.out.println("2. 추가");
    	  System.out.println("3. 검색");
    	  System.out.println("4. 삭제");
    	  System.out.println("0. 종료");
    	  System.out.println("선택 >>> ");
         menu = Integer.parseInt(br.readLine());
         switch (menu) {
         case 1:
            hd.showList();
            break;
         case 2:
            hd.addList();
            break;
         case 3:
            hd.findData1();
            break;
         case 4:
           hd.delet();
            break;
         case 0:
        	 System.out.println("프로그램 종료합니다.");
            break;

         default:
            break;
         }
         
         
      } while (menu != 0);
      
      
     bw.flush();
     bw.close();
     br.close();
   }
}