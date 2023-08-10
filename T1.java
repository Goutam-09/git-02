/*class T1
{
   public static void main(String[] args) {
      Integer i=127;
      Integer j = 127;
      System.out.println(i==j);
      A obj = new B();
      obj.show(); 
   }
}
class A
{
   static void show()//Static method cannot override thats why compilation and execution based on refrence Variable
   {
      System.out.println("class A");
   }
}
class B extends A
{
   static void show()
   {
      System.out.println("class B");
   }
}*/
/*class T1
{
   public static void main(String[] args) {
      Integer i=127;
      Integer j = 127;
      System.out.println(i==j);
      A obj = new B();
      obj.show(); 
   }
}
class A
{
    void show()
   {
      System.out.println("class A");
   }
}
class B extends A
{
   static void show()
   {
      System.out.println("class B");//In this case we cannot create child class method as Static make same as parent class
   }                                // cannnot override method as static compile time error
}*/
      // What will be the output of below program?
/*class T1 {
   public static void main(String[] args) {
      Subclass s1 = new Subclass();
      s1.foo(); 
      Super s = new Subclass();
      s.foo(); 
   }
}

class Super {
   private void foo() //private method cannot visible bcz private declare within class only
   {
      System.out.println("Super");
   }
}

class Subclass extends Super 
{
   public void foo() 
   {
      System.out.println("Subclass");
   }
}*/
class T1
{
   public static void main(String[] args) 
   {
      String s1 = "abc";
String s2 = new String("abc");
System.out.print(s1==s2);
System.out.println(s1==s2.intern());
   }
}