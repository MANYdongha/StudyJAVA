package accessModifier_Quest04_Member;


import java.util.Scanner;

public class Handler {
   Scanner sc = new Scanner(System.in);
   Member[] arr = new Member[5];
   int menu = 0;
   
   public Handler() {}

   public Handler(Member[] arr) {
      this.arr = arr;
   }
   
   public void showList() { //전체 List 보여주는 함수  
      for(int i=0; i<arr.length; i++) {
         if(arr[i] != null ) {
            System.out.println("-------------------------------");
            System.out.println("이름 : " + arr[i].getName());
            System.out.println("나이 : " + arr[i].getAge());
            System.out.println("-------------------------------");
            System.out.println();
            
         }
         else if(arr[i]==null) {
        	 continue;
         }
         else {
        	 
            break;
         }
      }
   }//end of showList()
   
   public void addList() { //List에 추가하는 함수
      System.out.print("추가 하려는 맴버이름: ");
      String name = sc.next();
      System.out.print("추가 하려는 맴버나이: ");
      int age = sc.nextInt();
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
   } //end of addList()
   
   public void findData1(){   //List에서 해당 검색어 검색 프로그램

      do {
         System.out.println("1.이름으로 찾기");
         System.out.println("2.나이로 찾기");
         System.out.println("0.메인으로 되돌아가기");
         System.out.print("선택 >>");
         menu = sc.nextInt();
         
         switch (menu) {
         case 1:
            System.out.print("이름입력 >> ");
            String findName = sc.next();
            findData2(findName);
            break;
         case 2:
            System.out.print("나이입력 >> ");
            int findAge = sc.nextInt();
            findData2(findAge);
            break;

         }
      } while (menu != 0);
      System.out.println();
      
   }//end of findData1()

   void findData2(String name) { //아이디로 검색한 검색어 찾는 곳
	   							 
      for(int i=0; i<arr.length; i++) {
         if(arr[i] != null) {
            if(name.equals(arr[i].getName())) {	//2글자이상이면 2글자 모두 같아야만 출력
               System.out.println("-------------------------------");
               System.out.println("이름 : " + arr[i].getName());
               System.out.println("나이 : " + arr[i].getAge());
               System.out.println("-------------------------------");
               System.out.println();
               }
            
            else if(name.length() == 1 ){
            	//1글자는 해당글자가 포함하면 모드 출력함
               if(arr[i] == null) {
                  break;
               }
               if(arr[i].getName() == null) {
                  break;
               }
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
      }
         
   //end of findData2
   
   
   
   void findData2(int age) { //나이로 검색한 검색어 찾는 곳
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
   

public void delet() {	//삭제하기 메뉴
	 do {
	 System.out.println("1.이름으로 삭제");
	 System.out.println("2.나이로 삭제");
	 System.out.println("0.메인으로 되돌아가기");
	 System.out.print("선택 >>");
	 menu = sc.nextInt();
	 
	 switch (menu) {
	 case 1:
	    System.out.print("삭제할 맴버 이름입력 >> ");
	    String findName = sc.next();
	    deletData(findName);
	    break;
	 case 2:
	    System.out.print("삭제할 맴버 나이입력 >> ");
	    int findAge = sc.nextInt();
	    deletData(findAge);
	    break;
	 }
	 	} while (menu != 0);
	
	 }//end of delet

   
	public void deletData(String name) { // 이름으로 데이터 삭제시작하는 곳 (오버로딩)
		Member[] ob = new Member[arr.length];	//배열을 만들어 삭제에 해당하는 자료들 호출
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
		System.out.print("몇번을 삭제하겠습니까?  ");	// 목록중에 몇번 살제할지 입력받기
		int num = sc.nextInt();
		cnt = num;
		if(num == cnt) {
			System.out.print("정말 삭제하시겠습니까? yes : 1 / no : 2  ");
			num = sc.nextInt();			//삭제는 매우 중요하므로 한번 더 확인하기
			if(num ==1) {
				for(int j =0; j<arr.length; j++) {
					if(arr[j] != null) {
						if(ob[cnt-1] != null) {	
							if(ob[cnt-1].getName() == arr[j].getName() && ob[cnt-1].getAge() == arr[j].getAge()) {
								arr[j] = null;//만든 목록에서 삭지할 데이터와 List에 있는 자료 찾기
								break;		  //삭제 실행
								
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
				System.out.println("취소되었습니다.");
			}
		}
		else {
			System.out.println("없는 자료아거나 / 잘못된입력입니다.");
		}
		
	}
	
	public void deletData(int age) {// 이름으로 데이터 삭제시작하는 곳 (오버로딩)
		Member[] ob = new Member[arr.length];	//배열을 만들어서 삭제할 내용만 모아둔다
		int cnt = 0;
		for(int i=0; i<arr.length;i++ ) {
			if(arr[i] != null) {
				if(age == arr[i].getAge()) {
					ob[cnt] = arr[i]; 
					cnt++;				//삭제 대상 한번 보여주기
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
		System.out.println("몇번을 삭제하겠습니까?");
		int num = sc.nextInt();			// 배열에서 삭제할 번호 입력받기
		if(num == cnt) {
			System.out.println("정말 삭제하시겠습니까? yes : 1 / no : 2");
			num = sc.nextInt();			//삭제는 중요하니깐 한번 더 물어보기
			cnt = num;
			if(num ==1) {
				for(int j =0; j<arr.length; j++) {
					if(arr[j] != null) {		//배열에서 삭제할 데이터와 List에 있는 데이터 비교
						if(ob[cnt].getName() == arr[j].getName() && ob[cnt].getAge() == arr[j].getAge()) {
							arr[j] = null;		//삭제
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
		
	}
   
   
   
   
   
}