import java.util.*;
public class NonRepeated{
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
        int count=0;
        for(int j=0;j<a;j++)
        {
          if(arr[i]==arr[j]&&i!=j)
          {
           count++;
          }
        }
        if(count==0)
        {
        System.out.print(arr[i]);
        return;
        }

        
      }
    
     
    }
}