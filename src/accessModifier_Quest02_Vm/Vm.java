package accessModifier_Quest02_Vm;


import java.util.Scanner;

public class Vm {
   private Drink[] area1 = new Drink[10]; 
   private Drink[] area2 = new Drink[10]; 
   private Drink[] area3 = new Drink[10]; 
   private Drink[] area4 = new Drink[10]; 
   private Drink[] area5 = new Drink[10]; 
   Scanner sc = new Scanner(System.in);
   private int money; 
   private boolean power = false;
   private int button;
   int test;
   

   
   public Vm() {
      for(int i =0; i<area1.length; i++) {
         area1[i]= new Drink("콜라", 1200);
      }
      for(int i =0; i<area2.length; i++) {
         area2[i]= new Drink("사이다", 1300);
      } 
      for(int i =0; i<area3.length; i++) {
         area3[i]= new Drink("게토레이", 1000);
      } 
      for(int i =0; i<area4.length; i++) {
         area4[i]= new Drink("포카리", 1000);
      }
      for(int i =0; i<area5.length; i++) {
         area5[i]= new Drink("여명", 800);
      }
      
   }   
   public Drink[] reArea1(int cnt) {
      for(int i= cnt; i<getArea1().length; i++) {
         area1[i] = null;
      
      }
//      System.out.println("area1 : " + area1.length);
      return area1;
   }
   public Drink[] reArea2(int cnt) {
      for(int i= cnt; i<getArea2().length; i++) {
         area2[i] = null;
         
      }
//      System.out.println("area1 : " + area1.length);
      return area1;
   }
   public Drink[] reArea3(int cnt) {
      for(int i= cnt; i<getArea3().length; i++) {
         area3[i] = null;
         
      }
//      System.out.println("area1 : " + area1.length);
      return area3;
   }
   public Drink[] reArea4(int cnt) {
      for(int i= cnt; i<getArea4().length; i++) {
         area4[i] = null;
         
      }
//      System.out.println("area1 : " + area1.length);
      return area1;
   }
   public Drink[] reArea5(int cnt) {
      for(int i= cnt; i<getArea5().length; i++) {
         area5[i] = null;
         
      }
//      System.out.println("area1 : " + area1.length);
      return area1;
   }
   
   public Drink[] getArea1() {
      return area1;
      
   }
   public int Area1Price() {
      return area1[1].getPrice();
      
   }
   public int Area2Price() {
      return area2[1].getPrice();
      
   }
   public int Area3Price() {
      return area3[1].getPrice();
      
   }
   public int Area4Price() {
      return area4[1].getPrice();
      
   }
   public int Area5Price() {
      return area5[1].getPrice();
      
   }
   
   public void setArea1(Drink[] area1) {
      this.area1 = area1;
      
   }
   
   public void setArea2(Drink[] area2) {
      this.area2 = area2;
   }
   public void setArea3(Drink[] area2) {
      this.area2 = area2;
   }
   public void setArea4(Drink[] area2) {
      this.area2 = area2;
   }
   public void setArea5(Drink[] area2) {
      this.area2 = area2;
   }


   public Drink[] getArea2() {
      return area2;
   }



   public Drink[] getArea3() {
      return area3;
   }



   public Drink[] getArea4() {
      return area4;
   }



   public Drink[] getArea5() {
      return area5;
   }



   public boolean isPower() {
      return power;
   }

   public void setPower(boolean power) {
      this.power = power;
   }



   public int getMoney() {
      return money;
   }



   public void setMoney(int money) {
      this.money = money;
   }



   public int getButton() {
      return button;
   }



   public void setButton(int button) {
      this.button = button;
   }
   
    
}
