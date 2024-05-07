class A
{
    int a=10,b=10;
 void add ()
{
 System.out.println("Addition is = "+ (a+b));
}
}
class B extends A
{
  void sub()
{
 System.out.println("Subtraction is ="+(a-b));
}
}
class C extends B
{
  void mul()
{
 System.out.println("Multiplicatin is ="+(a*b));
}
}
class Exe5a
{
 public static void main (String args [])
 {
 C obj= new C ();
   obj.add();
   obj.sub();
   obj.mul();
}
}