import java.util.*;
public class KthMax{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
      int []arr=new int[a];
      
      for(int i=0;i<a;i++)
      {
        arr[i]=obj.nextInt();

      }
      System.out.println("Enter the number: ");
      int c=obj.nextInt();
      for(int i=0;i<a;i++)
      {
        for(int j=i+1;j<a;j++)
        {
            if(arr[i]>arr[j])
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
      }
      for(int i=0;i<a;i++)
      {
        System.out.print(arr[i]+" ");
      }
      System.out.println();
      System.out.println(arr[a-c]);
     
           

    }
}