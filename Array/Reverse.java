import java.util.*;
public class Reverse{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int [] b=new int[a];
        int count=0;
        for(int i=0;i<a;i++)
        {
            b[i]=obj.nextInt();
           
        }
        for(int i=a-1;i>=0;i--)
        {
            System.out.print(b[i]+" ");
          
        }
      
       
          
        

    }
}