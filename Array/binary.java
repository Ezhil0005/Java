import java.util.*;
public class binary{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
      int []arr=new int[a];
      System.out.print("enter the element to search: ");
      int key=obj.nextInt();
      
      for(int i=0;i<a;i++)
      {
        arr[i]=obj.nextInt();
      }
      int low =0;int high=a-1;
      while(low<=high)
      {
        int mid=(low+high)/2;
        if(key<arr[mid])
        {
          high=mid-1;
        }
        else if(key>arr[mid])
        {
          low=mid+1;
        }
        else
        {
          System.out.print("Found at postion:"+mid);
          return ;
        }
      }
      System.out.println("Not found");

      
        
      
}
}