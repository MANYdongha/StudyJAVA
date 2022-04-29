package accessModifier;

//클래스를 구성하는 요소  : 필드, 메서드, 생성자, 접근제어자
//접근제한자 : 객체 내부의 구성요쇼에 대한 외부로 부터의 접근을 제한하는 역할(정상적인 접근만 가능)
//클래스, 필드, 메서드, 생성자에 적용
//private package, protected, public 4가지 종류

//private : 같은 클래스 내부가 아닌 폴더로 부터의 접근은 허용한다. (개인의)
//package : 같은 패키지 폴더로 부터의 접근은 허용한다.(작성하지 않을 경우의 기본값)
//protected : 같은 패키지 폴더 or 상속관계일 경우 접근을 허용한다.
//public : 모든 외부로 부터의 접근을 허용한다.(공공)


class Scanner{
 void show() {
    System.out.println("입력처리할 수 없는 내가 만드는 스캐너");
 }
 
 
}
public class Ex01 {
 public static void main(String[] args) {
    //같은 클새스 이름이라도 서로 다른 패키지라면 구분 가능
    //패키지안에서는 같은 클래스 이름을 쓰면 안된다.
    java.util.Scanner sc = new java.util.Scanner(System.in);
    Scanner sc2 = new Scanner();
    
    sc.close();
 }
 
}
