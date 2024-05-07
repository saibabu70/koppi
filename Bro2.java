public class Bro2 {
  /**
   * @param args
   */
  public static void main (String args[]){
    int  [] arr={1,2,3,4,5};
    System.out.println(arr[1]);
    for(int a=0;a<arr.length;a++){
      System.out.println(arr[a] + "\t ");
    }
    System.out.println();

    //average calculation
    for(int a=0;a<arr.length;a++){
    float sum=0,b=0;
    sum +=arr[a];
    b=sum/arr.length;
    System.out.println(b);
  }
}
}
