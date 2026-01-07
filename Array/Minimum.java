import java.util.*;
public class Minimum
{
    public static void main (String []args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int []arr=new int[a];
        
        for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
        }
        int min=arr[0];
       for(int i=0;i<a;i++)
       {
       if(min>arr[i])
       {
        min=arr[i];
       }
           

        
        
    }
System.out.println(min);}
}