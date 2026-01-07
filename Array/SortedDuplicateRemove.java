import java.util.*;
public class SortedDuplicateRemove{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
      int []arr=new int[a];
      
      for(int i=0;i<a;i++)
      {
        arr[i]=obj.nextInt();

      }

      int j=0;
      for(int i=0;i<a-1;i++)
      {
        for(int z=i+1;z<a;z++)
        {
            if(arr[i]>arr[z])
            {int temp=arr[z];
                arr[z]=arr[i];
                arr[i]=temp;

            }

        }
        if(arr[i]!=arr[i+1])
        {
          arr[j]=arr[i];
          j++;
        }
      }
      arr[j++]=arr[a-1];
      for(int i=0;i<j;i++)
      {
        System.out.print(arr[i]+" ");
      }
      
    }
}