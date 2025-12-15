import java.util.*;
public class Gcd
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("enter a Number:");
        int a=obj.nextInt();
        int b=obj.nextInt();
        while(b!=0)
        {
            int rem=a%b;
            a=b;
            b=rem;
        }
         System.out.println("The GCD  is: "+a);
       }
       
    }

