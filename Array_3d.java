public class Array_3d {
  public static void main (String args []) {
     int my3darray [] [][]=new int[3][4][5];
     int i,j,k;
     for(i=0;i<3;i++)
     for(j=0;j<4;j++)
     for(k=0;k<5;k++)
     my3darray[i][j][k]= i*j*k ;
     for(i=0;i<3;i++)
     for(j=0;j<4;j++)
     for(k=0;k<5;k++) 
     System.out.println(my3darray[i][j][k] + "");
     System.out.println();
  }
}
