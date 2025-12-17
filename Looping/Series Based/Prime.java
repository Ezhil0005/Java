import java.util.*;
public class Prime
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number: ");
        
         int a=obj.nextInt();
         for (int i=2;i<=a;i++)
         {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
                 System.out.println(i);

         }
       
        
    }
}