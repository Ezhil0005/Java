import java.util.*;
public class Occur{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        System.out.print("Enter the key element: ");
        int key=obj.nextInt();
      int arr[]=new int[a];
      
      for(int i=0;i<a;i++)
      {
        arr[i]=obj.nextInt();
      }
      int first=-1;
      int last=-1;
      for(int i=0;i<a;i++)
      {
        if(arr[i]==key)
        {
          if(first==-1)
          {
            first=i;
          }
          
            last=i;
        }
      }
      
      if(first==-1)
      {
        System.out.println("Not found");
      }
      
        
      else System.out.println("First occurance is: "+first+"\nLast Occurance is: "+last);
}
}