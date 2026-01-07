import java.util.*;
public class ReverseInPlace{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int [] b=new int[a];
       
        for(int i=0;i<a;i++)
        {
            b[i]=obj.nextInt();
           
        }
        for(int i=0;i<a/2;i++)
        {
        int temp=b[i];
        b[i]=b[a-1-i];
        b[a-1-i]=temp;
        }
         for(int k=0;k<a;k++)
        {
           System.out.print(b[k]+" ");
          
        }
      
       
          
        

    }
}