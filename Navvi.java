class Stu
{
 int no;
 String name,address,branch;
float Avg;
Stu(int sno,String sname)
{
System.out.println("Stu no="+sno);
System.out.println("Stu name="+sname);
}
Stu(String address,String branch,float avg)
{
System.out.println("Stu address="+address);
System.out.println("Stu branch="+branch);
System.out.println("Stu avg="+avg);
}
}
class Navvi {
public static void main (String args[])
{
 Stu s= new Stu(103,"Saibabu");
 Stu d= new Stu("Challapalli","Aiml",86.8f);
}
}

