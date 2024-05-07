import java.util.Scanner;
class Exe2b
{
    public static void main(String []args)
    {
         int n,t,i,j;
         Scanner s=new Scanner(System.in);
         System.out.println("How many numbers to be sorted:");
         n=s.nextInt();
         int a[]=new int[n];
         System.out.println("Enter "+n+"integers");
         for (i=0;i<n;i++)
         a[i]=s.nextInt();
         for (i=0;i<(n-1);i++){
            for (j=0;j<n-(i+1);j++){
                if (a[j]>a[j+1]){
                    t =a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
         }
         System.out.println("After after sorting");
         for(i=0;i<n;i++){

         }
    }
}
