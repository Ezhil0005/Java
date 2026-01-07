import java.util.*;
public class OddEven{
    public static void main (String []args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int []arr=new int[a];
          int []res=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
        }
        int k=0;
       for(int i=0;i<a;i++)
       {
        if(arr[i]%2==0)
        {
            res[k]=arr[i];
            k++;

        }
       }
       for(int j=0;j<a;j++)
       {
        if(arr[j]%2!=0)
        {
            res[k]=arr[j];
            k++;
        }
       }
         for(int j=0;j<a;j++)
            {
                System.out.print(res[j]+" ");
                
            }
       
        
    }
}