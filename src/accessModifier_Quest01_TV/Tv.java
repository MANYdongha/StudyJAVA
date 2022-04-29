package accessModifier_Quest01_TV;


public class Tv {
   private int sound;
   private int ch;
   private boolean power;
   private String brand;
   
   public Tv() {}
   
   public Tv(boolean power, int sound, int ch , String brand) {
      this.sound = sound;
      this.ch = ch;
      this.power = power;
      this.brand = brand;
   }
   
   public int getSound() {
      return sound;
   }

   public void setSound(int sound) {
      this.sound = sound;
   }

   public int getCh() {
      return ch;
   }

   public void setCh(int ch) {
      this.ch = ch;
   }

   public boolean isPower() {
      return power;
   }

   public void setPower(boolean power) {
      this.power = power;
   }

   public String getBrand() {
      return brand;
   }

   public void setBrand(String brand) {
      this.brand = brand;
   }

   public void showTV(){
      System.out.println("=========================");
      System.out.printf("TV상태 : 켜졌는가? : %b\n사운드 키기 : %d\n체널위치: %d\nTV브랜드: %s\n ",power,sound,ch,brand );
      System.out.println("=========================");
   }
   
   
   
   //TV의 속성을 정의하세요
   //볼륨, 체널, 전원, 브랜드 내임
   
   //TV의 기능을 정의이하세요
   //볼륨올림/내림, 채널올림/내림
   //전원켜고 끄기, 음소거
   
   //필요함다면 TV의 생성자를 작성하세요
   
}