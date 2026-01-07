import java.util.*;
public class Bubble{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
      int []arr=new int[a];
      for(int i=0;i<a;i++)
      {
        arr[i]=obj.nextInt();
      }
      for(int i=0;i<a-1;i++)
      {
        for(int j=0;j<a-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
            int temp=arr[j+1];
            arr[j+1]=arr[j];
            arr[j]=temp;
            }
        }
      }
  
      for(int i=0;i<a;i++)
      {
        System.out.print(arr[i]+" ");
      }
      
    }
}