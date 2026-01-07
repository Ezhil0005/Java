import java.util.*;
public class Dutch{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
      int []arr=new int[a];
      
      for(int i=0;i<a;i++)
      {
        arr[i]=obj.nextInt();

      }
     int low =0;int mid=0;int high=a-1;
     while(mid<=high)
     {
      if(arr[mid]==0)
      {
        int x=arr[mid];
        arr[mid]=arr[low];
        arr[low]=x;
        low++;mid++;
      }
      else if(arr[mid]==1)
      {
        mid++;
      }
      else if(arr[mid]==2)
      {
        int y=arr[mid];
        arr[mid]=arr[high];
        arr[high]=y;
        high--;
      }
     }
     for(int i=0;i<a;i++)
     {
      System.out.print(arr[i]+" ");
     }

        
      }
    
     
    }
