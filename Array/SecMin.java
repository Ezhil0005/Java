import java.util.*;
public class SecMin{
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
            if(arr[i]>arr[j])
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
      }
      int min=arr[0];
        for(int i=0;i<a;i++)
        {
            if(min!=arr[i])
            {
                 System.out.print(arr[i]+" ");
                 break;
            }
        }
           

    }
}