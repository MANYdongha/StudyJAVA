package accessModifier_Quest03_book;


public class Book {
   private   String name;
   private String major;
   private String maker;
   
   public Book() {}

   public Book(String name, String major, String maker) {
      this.name = name;
      this.major = major;
      this.maker = maker;
   }

   
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getMajor() {
      return major;
   }

   public void setMajor(String major) {
      this.major = major;
   }

   public String getMaker() {
      return maker;
   }

   public void setMaker(String maker) {
      this.maker = maker;
   }
   
      
}
