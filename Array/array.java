import java.util.*;
public class array{
    public static void main (String []args)
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
           System.out.print(arr[i]+" ");
        }
        
    }

}