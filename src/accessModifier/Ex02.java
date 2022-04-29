package accessModifier;

class Test1{
   
   private int pri = 1;
   int pac = 2;   //안적으면 package : 접근제한자를 명시적으로 작성하는 것이 아니다.(default) 
   int pro = 3;   //protected : 클래스 상속을  공부한후 사용 
   int pub = 4;   //public은 모든 범위에서 직접 접근이 가능하다.

   public void show() {   //메서드에도 적용가능
      System.out.println(pri);
      System.out.println(pac);
      System.out.println(pro);
      System.out.println(pub);
      System.out.println();
      
   }
   public Test1() {} //생성자에도 사용이 가능

   //일반적으로 필드에는 private,메서드 및 생성자에는 public을 적용한다.
   //속성에 대한 직접적인 접근은 막고, 기능을 통하여 속성을 참조하거나, 변경하는 경우를 열어준다. 
   //member필드는 기본적으로 private가 일반적이다. 하지만 , member기능(메서드)는 public을 걸어준다.
   //객체는 기본적으로 기능으로 접근해야한다.
}


public class Ex02 {   //클래스에도 적용 가능 (하나의 소스파일은 하나이상의 클래스를 가진다.(public은 대표클래스))
   public static void main(String[] args) {
      Test1 ob = new Test1();
//      ob.pri = 5; //The field Test1.pri is not visible
      ob.pac = 5;
      ob.pro = 5;
      ob.pub = 5;
      ob.show();
      
   }
}