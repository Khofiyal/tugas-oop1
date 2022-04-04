package tgs1;
public class Tgs1{
   int MyAge;
   public Tgs1(String name){
      System.out.println("My Name is: " + name);
   }
   public void setAge(int age){
      MyAge = age;
   }
   public int getAge() {
      System.out.println("My age is: " + MyAge);
      return MyAge;
   }
   public static void main(String []args){
      Tgs1 myName = new Tgs1("Khofiyal Fatah Darojat");
      myName.setAge(18);
      myName.getAge();
      System.out.println("Variable Value: " + myName.MyAge);
   }
}
