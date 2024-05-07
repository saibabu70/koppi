import java.io.*;
class Data
{
 public static void main (String args [] ) throws IOException 
 {
  int a,b,c,d;
  double r1,r2;
DataInputStream dis = new DataInputStream (System.in);
System.out.println("Enter a,b and c values");
a=Integer.parseInt (dis.readLine() );
b=Integer.parseInt (dis.readLine() );
c=Integer.parseInt (dis.readLine() );
d=b* b-4* a* c;
  if(d==0)
{
  r1=r2=(double) -b/(2*a);
System.out.println("Root1 is ="+r1 "Root2 is ="+r2);
}
else if(d>0)
{
r1=(-b+Math.sqrt (d) /(2*a);
r2=(-b+Math.sqrt (d) /(2*a);
System.out.println("Root1 is ="+r1 "Root2 is ="+r2);
}
else
{
 System.out.println("Roots are Imaginary");
}
}
}
