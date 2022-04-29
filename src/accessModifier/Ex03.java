package accessModifier;

//이클립스 메뉴  - source - generate getters and setters
//1) private 으로 멤버 필드를 생성하고 저장
//2) 우클릭 - sorce -generate getters ane setters
//3) 모든 필드를 선택하고 접근제한자(public)확인후 generate

class Student{
   private String name;
   private int kor;
   private int eng;
   private int mat;
   private int sum;
   private double avg;
   
   
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getKor() {
      return kor;
   }
   public void setKor(int kor) {
      this.kor = kor;
   }
   public int getEng() {
      return eng;
   }
   public void setEng(int eng) {
      this.eng = eng;
   }
   public int getMat() {
      return mat;
   }
   public void setMat(int mat) {
      this.mat = mat;
   }
   public int getSum() {
      return sum;
   }
   public void setSum(int i) {
   
   }
   public double getAvg() {
      return avg;
   }
   public void setAvg(double avg) {
      this.avg = avg;
   }
   
   
   
}

public class Ex03 {
   public static void main(String[] args) {
      Student  st1 = new Student();
      st1.setName("이지은");
      st1.setKor(100);
      st1.setEng(99);
      st1.setMat(70);
      st1.setSum(100 + 90 + 70 );
      
      
   }
}