import java.util.*;
public class Lcm
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("enter a two Number:");
        int a=obj.nextInt();
        int b=obj.nextInt();
        int num1=a;
        int num2=b;
        while(b!=0)
        {
            int rem=a%b;
            a=b;
            b=rem;
        }
         System.out.println("The LCM  is: "+(num1*num2)/a);
       }
       
    }

