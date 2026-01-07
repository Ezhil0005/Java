import java.util.*;
public class Missing{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
      int []arr=new int[a-1];
      int sum=0;
      for(int i=0;i<a-1;i++)
      {
        arr[i]=obj.nextInt();
        sum+=arr[i];

      }
      int sum2=0;
      for(int i=1;i<=a;i++)
      {
        sum2+=i;
      }
    
    
      System.out.println("Missing num is :" + (sum2-sum));
     

        
      }
    
     
    }
