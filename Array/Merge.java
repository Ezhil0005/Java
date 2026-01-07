import java.util.*;
public class Merge{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
      int arr[]=new int[a];
      int brr[]=new int[b];
      int crr[]=new int [a+b];
      for(int i=0;i<a;i++)
      {
        arr[i]=obj.nextInt();
      }  
      for(int i=0;i<b;i++)
      {
        brr[i]=obj.nextInt();
      } 
      for(int i=0;i<a;i++)
        {
          crr[i]=arr[i];
        } 
        for(int i=0;i<b;i++)
        {
          crr[a+i]=brr[i];
        } 
        Arrays.sort(crr);
        for(int i=0;i<a+b;i++)
        {
          System.out.print(crr[i]+" ");
        }
}
}