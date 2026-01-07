import java.util.*;
public class DuplicateRemove{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
      int []arr=new int[a];
      
      for(int i=0;i<a;i++)
      {
        arr[i]=obj.nextInt();

      }

      for(int i=0;i<a;i++)
      {
        for(int j=i+1;j<a;j++)
        {
            if(arr[i]<arr[j])
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
      }
      int j=0;
      for(int i=0;i<a;i++)
      {
        if(arr[i]!=arr[i+1])
        {
          arr[j]=arr[i];
          j++;
        }
      }
      for(int i=0;i<j;i++)
      {
        System.out.print(arr[i]+" ");
      }
      
    }
}