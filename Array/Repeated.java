import java.util.*;
public class Repeated{
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
        for(int j=i-1;j<a;j++)
        {
          if(arr[i]==arr[i+1])
          {
            System.out.println(arr[i]);
          return;
          }
        }
      }
      System.out.println("No repeated elemets");
    
     
    }
}