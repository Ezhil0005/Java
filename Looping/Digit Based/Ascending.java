import java.util.*;
public class Ascending 
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("Enter a number :");
        long a=obj.nextLong();
        long temp =a;
        while(temp!=0)
        {
            int b=(int)temp%10;
            int c=(int)temp/10;
            int d=c%10;
            temp=c;
            if(d>b)
            {
               System.out.println("not a ascending order");
               return ;
            }
        }
        System.out.println("Ascending order");
    }
}