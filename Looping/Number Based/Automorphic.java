import java.util.*;
public class Automorphic
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.print("Enter a Number:");
        int a=obj.nextInt();
        int b=a*a;
        int temp=a;
        int digit=0;
        while(temp!=0)
        {
            digit++;
            temp/=10;
        }
        int power=(int) Math.pow(10,digit);
           if(b%power==a)
            System.out.println("It is a automorphic number");
        else
             System.out.println("It is a not a automorphic number");
    }
}