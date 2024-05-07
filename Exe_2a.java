import
java.util.Scanner;
class A
{
       int binarysearch(int L[],int n,int k)
   {
               int low=0,high=n-1,mid;
               while(low<=high)
           {
               mid=(low+high)/2;
               if(L[mid]==k)
                {
                       return mid;
}
                 else if (L[mid]>k)
                 {
                     high=mid-1;
 }
else
{   
      low=mid+1;
}
}
 return -1;
}
}
class Exe2a
{
      public static void main(String args[])
{
       int L[]=new int[20];
       int n,k,pos,i;
       A obj=new A();
       Scanner s=new Scanner(System.in);
       System.out.println("Enter n value");
       n=s.nextInt();
       System.out.println("Enter "+n+" elements");
       for(i=0;i<n;i++)
       {
          L[i]=s.nextInt();
       }
       System.out.println("Enter searching element");
       k=s.nextInt();
       pos=obj.binarysearch(L, n, k);
       if(pos==-1)
       {
        System.out.println("Seraching element not found in the list");
       }
       else
       {
        System.out.println("Element found at "+(pos+1)+"location");
       }
    }
}
       