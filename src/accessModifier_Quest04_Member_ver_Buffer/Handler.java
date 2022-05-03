package accessModifier_Quest04_Member_ver_Buffer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//import java.util.StringTokenizer;


public class Handler {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
   Member[] arr = new Member[5];
   int menu = 0;
   
   public Handler() {}

   public Handler(Member[] arr) {
      this.arr = arr;
   }
   
   public void showList(){ //전체 List 보여주는 함수  
      for(int i=0; i<arr.length; i++) {
         if(arr[i] != null ) {
        	System.out.print("-------------------------------");
        	System.out.print("이름 : " + arr[i].getName());
        	System.out.print("나이 : " + arr[i].getAge());
        	System.out.print("-------------------------------" + "\n");
            
            
         }
         else if(arr[i]==null) {
            continue;
         }
         else {
            
            break;
         }
      }  
   }//end of showList()
   
   public void addList() throws IOException { //List에 추가하는 함수
      bw.write("추가 하려는 맴버이름: \n");
      String name = br.readLine();
      bw.write("추가 하려는 맴버나이: \n");
      int age = Integer.parseInt(br.readLine()); 
//      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int i = 0; i<arr.length; i++) {
        if(arr[i] != null) {
            continue;
         }
         else if(arr[i] == null) {
            Member tmp = new Member(name, age);
            arr[i] = tmp;
            break;
         }
         else {
            System.out.println("공간이 가득찼습니다.");
            break;
         }
      }
      br.close();
      bw.flush();   //write로 담은 내용출력 후, 버퍼를 비움 
      bw.close();
   } //end of addList()
   
   public void findData1() throws IOException{   //List에서 해당 검색어 검색 프로그램

      do {
    	 System.out.println("1.이름으로 찾기\n");
    	 System.out.println("2.나이로 찾기\n");
    	 System.out.println("0.메인으로 되돌아가기\n");
    	 System.out.print("선택 >>\n");
         menu = Integer.parseInt(br.readLine());
         
         switch (menu) {
         case 1:
            bw.write("이름입력 >> ");
            String findName = br.readLine();
            findData2(findName);
            break;
         case 2:
            bw.write("나이입력 >> ");
            int findAge = Integer.parseInt(br.readLine());
            findData2(findAge);
            break;

         }
      } while (menu != 0);
      System.out.println();
      br.close();
   }//end of findData1()

   void findData2(String name) throws IOException { //아이디로 검색한 검색어 찾는 곳
                            
      for(int i=0; i<arr.length; i++) {
         if(arr[i] != null) {
            if(name.equals(arr[i].getName())) {   //2글자이상이면 2글자 모두 같아야만 출력
            	System.out.println("-------------------------------");
            	System.out.println("이름 : " + arr[i].getName());
            	System.out.println("나이 : " + arr[i].getAge());
            	System.out.println("-------------------------------");
               System.out.println();
               }
            
            else if(name.length() <= 2 ){
               //1글자는 해당글자가 포함하면 모드 출력함
               if(arr[i] == null) {
                  break;
               }
               if(arr[i].getName() == null) {
                  break;
               }
               System.out.println("실행중2");
               char ch = name.charAt(0);
               for(int j=0; j<arr[i].getName().length(); j++) {
                  if(arr[i].getName().charAt(j) == ch) {
                	  System.out.println("-------------------------------");
                	  System.out.println("이름 : " + arr[i].getName());
                	  System.out.println("나이 : " + arr[i].getAge());
                	  System.out.println("-------------------------------");
                     System.out.println();
                     
                     //System.out.println(arr[i].getName().charAt(j));
                     
                     
                  }
               }
            }
            }
               
               else if(arr[i] == null) {
            	   continue;
               }
                     
               else {
                  System.out.println("정보가 없습니다.");
               }
            
         }
     
     bw.close(); 
   } //end of findData2
   
   
   
   void findData2(int age) throws IOException { //나이로 검색한 검색어 찾는 곳
      for(int i=0; i<arr.length; i++) {
         if(arr[i] != null) {
            if(age == arr[i].getAge()) {
            	System.out.println("-------------------------------");
            	System.out.println("이름 : " + arr[i].getName());
            	System.out.println("나이 : " + arr[i].getAge());
            	System.out.println("-------------------------------");
               System.out.println();
         }
         else if(arr[i] == null) {
            continue;
         }
         
         else {
            System.out.println("정보가 없습니다.");
         }
      }
   }

   }//end of findData2
   

public void delet() throws IOException {   //삭제하기 메뉴
    do {
    	System.out.println("1.이름으로 삭제");
    	System.out.println("2.나이로 삭제");
    	System.out.println("0.메인으로 되돌아가기");
    	System.out.println("선택 >>");
    	menu = Integer.parseInt(br.readLine());
    
    switch (menu) {
    case 1:
      bw.write("삭제할 맴버 이름입력 >> ");
       String findName = br.readLine();
       deletData(findName);
       break;
    case 2:
      bw.write("삭제할 맴버 나이입력 >> ");
       int findAge = Integer.parseInt(br.readLine());
       deletData(findAge);
       break;
    }
       } while (menu != 0);
    
  
    br.close();
    }//end of delete

   
   public void deletData(String name) throws IOException { // 이름으로 데이터 삭제시작하는 곳 (오버로딩)
      Member[] ob = new Member[arr.length];   //배열을 만들어 삭제에 해당하는 자료들 호출
      int cnt = 0;
      for(int i=0; i<arr.length;i++ ) {
         if(arr[i] != null) {
            if(name.equals(arr[i].getName())) {
               ob[cnt] = arr[i]; 
               cnt++;            
               System.out.println("-------------------------------");
               System.out.println(cnt+"번");
               System.out.println("이름 : " + arr[i].getName());
               System.out.println("나이 : " + arr[i].getAge());
               System.out.println("-------------------------------");
               System.out.println();
            }
         }
         else if(arr[i] == null){
            continue;
         }
         else {
        	 System.out.println("자료가 없어서 삭제하지 못했습니다.");
         }
         
      }
      System.out.print("몇번을 삭제하겠습니까?  ");   // 목록중에 몇번 살제할지 입력받기
      int num = Integer.parseInt(br.readLine());
      cnt = num;
      if(num == cnt) {
    	  System.out.print("정말 삭제하시겠습니까? yes : 1 / no : 2  ");
         num = Integer.parseInt(br.readLine());         //삭제는 매우 중요하므로 한번 더 확인하기
         if(num ==1) {
            for(int j =0; j<arr.length; j++) {
               if(arr[j] != null) {
                  if(ob[cnt-1] != null) {   
                     if(ob[cnt-1].getName() == arr[j].getName() && ob[cnt-1].getAge() == arr[j].getAge()) {
                        arr[j] = null;//만든 목록에서 삭지할 데이터와 List에 있는 자료 찾기
                        break;        //삭제 실행
                        
                     }
                  }
               }      
            else if(arr[j] == null) {
               continue;
            }
            else {
               break;
            }      
         }   
      }
         else {
        	 System.out.println("취소되었습니다."+"\n");
         }
      }
      else {
    	  System.out.println("없는 자료아거나 / 잘못된입력입니다." + "\n");
      }
      
   br.close();
   }
   
   public void deletData(int age) throws IOException {// 이름으로 데이터 삭제시작하는 곳 (오버로딩)
      Member[] ob = new Member[arr.length];   //배열을 만들어서 삭제할 내용만 모아둔다
      int cnt = 0;
      for(int i=0; i<arr.length;i++ ) {
         if(arr[i] != null) {
            if(age == arr[i].getAge()) {
               ob[cnt] = arr[i]; 
               cnt++;            //삭제 대상 한번 보여주기
               System.out.println("-------------------------------");
               System.out.println(cnt+"번");
               System.out.println("이름 : " + arr[i].getName());
               System.out.println("나이 : " + arr[i].getAge());
               System.out.println("-------------------------------");
               System.out.println();
               
            }
         }
         else if(arr[i] == null){
            continue;
         }
         else {
        	 System.out.println("자료가 없어서 삭제하지 못했습니다.");
         }
         
      }
      System.out.print("몇번을 삭제하겠습니까?  ");
      int num = Integer.parseInt(br.readLine());         // 배열에서 삭제할 번호 입력받기
      if(num == cnt) {
    	  System.out.print("정말 삭제하시겠습니까? yes : 1 / no : 2  ");
         num = Integer.parseInt(br.readLine());         //삭제는 중요하니깐 한번 더 물어보기
         cnt = num;
         if(num ==1) {
            for(int j =0; j<arr.length; j++) {
               if(arr[j] != null) {      //배열에서 삭제할 데이터와 List에 있는 데이터 비교
                  if(ob[cnt].getName() == arr[j].getName() && ob[cnt].getAge() == arr[j].getAge()) {
                     arr[j] = null;      //삭제
                  }
               else if(arr[j] == null) {
                  continue;   
               }
               else {
                  break;
               }   
            }
         }      
      }
         else {
        	 System.out.println("취소되었습니다.");
         }
      }
      else {
    	  System.out.println("없는 자료아거나 / 잘못된입력입니다.");
      }
      br.close();
   }
   
   
   
   
   
}