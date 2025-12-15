import java.util.*;
public class Prime
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("enter a Number:");
        int a=obj.nextInt();
        int count=0;
        for(int i=2;i<=a;i++)
        {
           if(a%i==0)
           {
            count++;
           }
        }
        if(count==1)
        System.out.println("It is prime number");
    else
         System.out.println("It is not prime number");

    }
}