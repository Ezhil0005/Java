import java.util.*;
public class Maximum
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
        int max=arr[0];
       for(int i=0;i<a;i++)
       {
       if(max<arr[i])
       {
        max=arr[i];
       }
           

        
        
    }
System.out.println(max);}
}