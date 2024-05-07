class Sai
{
 int no;
String name;
float avg;
void get (int sno,String sname )
{
System.out.println( no=sno);
System.out.println( name =sname);
}
void get (float avg )
{
System.out.println (avg=avg);
}
}
class Ambica3
{
 public static void main (String args [])
{
 Sai obj =new Sai();
obj.get(101,"sai");
obj.get(2.2f);
}
}