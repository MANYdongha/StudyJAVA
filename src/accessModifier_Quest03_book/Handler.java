package accessModifier_Quest03_book;

import java.util.Scanner;

public class Handler {
   private Book[] ob1 = new Book[10];
   Scanner sc = new Scanner(System.in);
   
   public Handler() {}
   
   public Handler(Book[] ob1) {
      this.ob1 = ob1;
   }
   
   void showList() {
      for(int i=0; i<ob1.length; i++) {
         if(ob1[i] != null) {
         System.out.println("---------------------------------");	 
         System.out.print("제목 : " + ob1[i].getName() + "\n");
         System.out.print("출판사 : " + ob1[i].getMajor()+ "\n");
         System.out.print("지은이 : " + ob1[i].getMaker()+ "\n");
         System.out.println("---------------------------------");
         System.out.println();
         }
 
         else if(ob1[0] == null){
        	 System.out.println();
			 System.err.println("자료가 없습니다.");
            break;
         }
//         System.out.println(ob1[i]);
      }
   }
   void showList(Book[] result) { //findList
	   for(int i=0; i<result.length; i++) {
		   if(result[i] != null) {
			   System.out.println("---------------------------------");	 
			   System.out.print("제목 : " + result[i].getName() + "\n");
			   System.out.print("출판사 : " + result[i].getMajor()+ "\n");
			   System.out.print("지은이 : " + result[i].getMaker()+ "\n");
			   System.out.println("---------------------------------");
			   System.out.println();
		   }
		   
		  
		   else {
			   break;
		   }
//         System.out.println(ob1[i]);
	   }
   }
   
   void deletShowList(Book[] result) { //findList
	   for(int i=0; i<result.length; i++) {
		   if(result[i] != null) {
			   System.out.println("---------------------------------");
			   System.out.println(i+1+"번");
			   System.out.print("제목 : " + result[i].getName() + "\n");
			   System.out.print("출판사 : " + result[i].getMajor()+ "\n");
			   System.out.print("지은이 : " + result[i].getMaker()+ "\n");
			   System.out.println("---------------------------------");
			   System.out.println();
		   }
		   
		   
		   else {
			   break;
		   }
//         System.out.println(ob1[i]);
	   }
   }
   
   void input(Book book) {
      
      for(int i=0; i<ob1.length; i++) {
//         System.out.println(ob1[i].getClass().getSimpleName());
         if(ob1[i] == null) {
         Book tmp = book;
         ob1[i] = tmp;
         break;
         }
         
         else if(ob1[i] != null) {
        	 continue;
        	 
         }
         else {
            System.out.println("공간이 다찼습니다. 삭제해서 공간을 만드세욧!");
         }
         }   
         
      
   }
   
    public Book inputPlace() {
       System.out.print("책제목입력 >>");
       String name = sc.next();
       System.out.print("출판사입력 >>");
       String major = sc.next();
       System.out.print("책지은이입력 >>");
       String maker = sc.next();
       Book tmp = new Book(name, major, maker);
       return tmp;
    }
    
    public void findBook() {
    	int menu = 0;
    	
    	do {
    		System.out.println("1. 제목으로 검색하기");
    		System.out.println("2. 출판사으로 검색하기");
    		System.out.println("3. 책지은이로 검색하기");
    		System.out.println("0. 종료");
    		System.out.print("선택 >> ");
    		menu = sc.nextInt();
    		System.out.println();
    		switch (menu) {
			case 1 :
				howFindName();
				break;
					
			case 2 :
				howFindMajor();
				break;
				
			case 3 :
				howFindMaker();
				break;
				
			case 0 :
				break;
				
			default:
				System.err.println("잘못된입력입니다.");
			}
		} while (menu != 0);
    	
    	
    	
    }

	private void howFindMaker() {	//지은이로 검색
		Book[] result = new Book[ob1.length];
		Boolean find = false;
		System.out.print("찾을 지은이로 입력 >> ");
		String findMaker = sc.next();
		
		for(int i=0; i<ob1.length; i++) {
			if(ob1[i] != null) {
				if(ob1[i].getMaker().equals(findMaker)) {
						find = true;
						for(int j =0; j<result.length; j++) {
								if(result[j] == null) {
									result[j] = ob1[i];	
									break;								
								}
								else {
									continue;
								}
						}	
				}
				else {
					continue;
				}

			}
			
			else {
				continue;
			}
		}
		
		if(find == true) {
			showList(result);
		}
		else {
			
			 System.err.println("자료가 없습니다!!");
			
		}
	}

	private void howFindMajor() {	//출판사로 검색
		Book[] result = new Book[ob1.length];
		Boolean find = false;
		System.out.print("찾을 지은이로 입력 >> ");
		String findMajor = sc.next();
		
		for(int i=0; i<ob1.length; i++) {
			if(ob1[i] != null) {
				if(ob1[i].getMajor().equals(findMajor)) {
						find = true;
						for(int j =0; j<result.length; j++) {
								if(result[j] == null) {
									result[j] = ob1[i];	
									break;								
								}
								else {
									continue;
								}
						}	
				}
				else {
					continue;
				}

			}
			
			else {
				continue;
			}
		}
		
		if(find == true) {
			showList(result);
		}
		else {
			
			 System.err.println("자료가 없습니다!!");
			
		}
	}
		
	

	private void howFindName() {	//책이름으로 검색
		Book[] result = new Book[ob1.length];
		Boolean find = false;
		System.out.print("찾을 지은이로 입력 >> ");
		String findName = sc.next();
		
		for(int i=0; i<ob1.length; i++) {
			if(ob1[i] != null) {
				if(ob1[i].getName().equals(findName)) {
						find = true;
						for(int j =0; j<result.length; j++) {
								if(result[j] == null) {
									result[j] = ob1[i];	
									break;								
								}
								else {
									continue;
								}
						}	
				}
				else {
					continue;
				}

			}
			
			else {
				continue;
			}
		}
		
		if(find == true) {
			showList(result);
		}
		else {
			
			 System.err.println("자료가 없습니다!!");
			
		}
	}

	public void deleteList() {
    	int menu = 0;
    	
    	do {
    		System.out.println("1. 제목으로 삭제하기");
    		System.out.println("2. 출판사으로 삭제하기");
    		System.out.println("3. 책지은이로 삭제하기");
    		System.out.println("4. 목록보기");    		 		
    		System.out.println("0. 종료");
    		System.out.print("선택 >> ");
    		menu = sc.nextInt();
    		System.out.println();
    		switch (menu) {
			case 1 :
				deleteFindName();
				break;
					
			case 2 :
				deleteFindMajor();
				break;
				
			case 3 :
				deleteFindMaker();
				break;
			
			case 4 :
				showList();
				break;
				
	
			case 0 :
				break;
				
			default:
				System.err.println("잘못된입력입니다.");;
			}
		} while (menu != 0);
        
	}

	private void deleteFindMaker() {
		Book[] result = new Book[ob1.length];
		Boolean find = false;
		System.out.print("삭제할 도서 지은이입력 >> ");
		String findName = sc.next();
		
		for(int i=0; i<ob1.length; i++) {
			if(ob1[i] != null) {
				if(ob1[i].getMaker().equals(findName)) {
						find = true;
						for(int j =0; j<result.length; j++) {
								if(result[j] == null) {
									result[j] = ob1[i];	
									break;								
								}
								else {
									continue;
								}
						}	
				}
				else {
					continue;
				}

			}
			
			else {
				continue;
			}
		}
		
		if(find == true) {
			deletShowList(result);
			int how = 0;
			System.out.print("지우려는 번호를 입력하세요 >> ");
			int deletNum = sc.nextInt();
			while(true) {
				System.out.print("정말지우시겠습니까? yes=1 / no=0 을 입력해주세요");
				how = sc.nextInt();
				if(how == 1 || how == 0) {
					break;
				}
				else {
					System.err.println("잘못입력하셨습니다. yes=1 / no=0 을 입력해주세요");
				}
			}
			if(how == 1) {	//만약, 앞에서 입력받은 값이 1이면 삭제
				for(int i=0; i< ob1.length; i++) {
					if(result[deletNum-1].getName() == ob1[i].getName() 
						&& result[deletNum-1].getMajor() == ob1[i].getMajor() 
						&&result[deletNum-1].getMaker() == ob1[i].getMaker()) {
						ob1[i] = null;
						break;
					}					
				}
			}
			else { // 만약, 앞에서 입력받은 값이 0이면 취소
				System.out.println("취소되었습니다.");
			}
			
		}
		else {
			
			 System.err.println("해당하는 도서가 없습니다.");
			
		}
		
	}

	private void deleteFindMajor() {
		Book[] result = new Book[ob1.length];
		Boolean find = false;
		System.out.print("삭제할 도서 출판사입력 >> ");
		String findName = sc.next();
		
		for(int i=0; i<ob1.length; i++) {
			if(ob1[i] != null) {
				if(ob1[i].getMaker().equals(findName)) {
						find = true;
						for(int j =0; j<result.length; j++) {
								if(result[j] == null) {
									result[j] = ob1[i];	
									break;								
								}
								else {
									continue;
								}
						}	
				}
				else {
					continue;
				}

			}
			
			else {
				continue;
			}
		}
		
		if(find == true) {
			deletShowList(result);
			int how = 0;
			System.out.print("지우려는 번호를 입력하세요 >> ");
			int deletNum = sc.nextInt();
			while(true) {
				System.out.print("정말지우시겠습니까? yes=1 / no=0 을 입력해주세요");
				how = sc.nextInt();
				if(how == 1 || how == 0) {
					break;
				}
				else {
					System.err.println("잘못입력하셨습니다. yes=1 / no=0 을 입력해주세요");
				}
			}
			if(how == 1) {	//만약, 앞에서 입력받은 값이 1이면 삭제
				for(int i=0; i< ob1.length; i++) {
					if(result[deletNum-1].getName() == ob1[i].getName() 
						&& result[deletNum-1].getMajor() == ob1[i].getMajor() 
						&&result[deletNum-1].getMaker() == ob1[i].getMaker()) {
						ob1[i] = null;
						break;
					}					
				}
			}
			else { // 만약, 앞에서 입력받은 값이 0이면 취소
				System.out.println("취소되었습니다.");
			}
			
		}
		else {
			
			 System.err.println("해당하는 도서가 없습니다.");
			
		}
		
	}

	private void deleteFindName() {
		Book[] result = new Book[ob1.length];
		Boolean find = false;
		System.out.print("삭제할 도서 제목입력 >> ");
		String findName = sc.next();
		
		for(int i=0; i<ob1.length; i++) {
			if(ob1[i] != null) {
				if(ob1[i].getName().equals(findName)) {
						find = true;
						for(int j =0; j<result.length; j++) {
								if(result[j] == null) {
									result[j] = ob1[i];	
									break;								
								}
								else {
									continue;
								}
						}	
				}
				else {
					continue;
				}

			}
			
			else {
				continue;
			}
		}
		
		if(find == true) {
			deletShowList(result);
			int how = 0;
			System.out.print("지우려는 번호를 입력하세요 >> ");
			int deletNum = sc.nextInt();
			while(true) {
				System.out.print("정말지우시겠습니까? yes=1 / no=0 을 입력해주세요");
				how = sc.nextInt();
				if(how == 1 || how == 0) {
					break;
				}
				else {
					System.err.println("잘못입력하셨습니다. yes=1 / no=0 을 입력해주세요");
				}
			}
			if(how == 1) {	//만약, 앞에서 입력받은 값이 1이면 삭제
				for(int i=0; i< ob1.length; i++) {
					if(result[deletNum-1].getName() == ob1[i].getName() 
						&& result[deletNum-1].getMajor() == ob1[i].getMajor() 
						&&result[deletNum-1].getMaker() == ob1[i].getMaker()) {
						ob1[i] = null;
						break;
					}					
				}
			}
			else { // 만약, 앞에서 입력받은 값이 0이면 취소
				System.out.println("취소되었습니다.");
			}
			
		}
		else {
			
			 System.err.println("해당하는 도서가 없습니다.");
			
		}
		
	}
		
	
    
    
    
   
}