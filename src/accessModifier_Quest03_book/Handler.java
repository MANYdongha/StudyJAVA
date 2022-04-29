package accessModifier_Quest03_book;

import java.util.Scanner;

public class Handler {
   private Book ob1[] = new Book[10];
   Scanner sc = new Scanner(System.in);
   
   
   
   
   
   public Handler() {}
   
   public Handler(Book[] ob1) {
      this.ob1 = ob1;
   }
   
   void showList() {
      for(int i=0; i<ob1.length; i++) {
         if(ob1[i] != null) {
         System.out.println(ob1[i].getName());
         System.out.println(ob1[i].getMaker());
         System.out.println(ob1[i].getMajor());
         }
         else {
            System.out.println("자료가 없습니다.");
            break;
         }
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
   
}