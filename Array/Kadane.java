import java.util.*;
public class Kadane{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
      int arr[]=new int[a];
      for(int i=0;i<a;i++)
      {
        arr[i]=obj.nextInt();
      }
   int cur=arr[0];
   int max=arr[0];
   for(int i=1;i<a;i++)
   {
    if(cur+arr[i]>arr[i])
    {
      cur=cur+arr[i];
    }
    else
      cur=arr[i];
     if(cur>max)
    max=cur;
   }
  


System.out.println(max);

    }}